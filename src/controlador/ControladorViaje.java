/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import excepciones.VehiculoNoHabilitadoExcepcion;
import excepciones.ViajeCruzadoExcepcion;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import modelo.AdministradorFlota;
import modelo.Empresa;
import modelo.Viaje;
import singleton.SingletonCaseta;
import singleton.SingletonUsuario;


/**
 *
 * @author Juan Esteban
 */
public class ControladorViaje {
 
    private final ControladorEmpresa controladorE;
    
    public ControladorViaje(){
        controladorE = new ControladorEmpresa();
    }
    
     public LocalDateTime calcularFechaHora(Date fecha, String hora) {
        LocalDate localDate = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalTime localTime = LocalTime.parse(hora);
        return LocalDateTime.of(localDate, localTime);
    }

    public Date obtenerFechaCreacionViaje() {
        return new Date();
    }

    public void guardarViaje(Viaje viaje, AdministradorFlota administradorFlota) throws
            VehiculoNoHabilitadoExcepcion, ViajeCruzadoExcepcion {
        Empresa empresa = controladorE.buscarEmpresa(administradorFlota);
        boolean encontroBus = false;
        boolean puedeProgramarViaje = false;
        for (int i = 0; i < empresa.getListaViajes().size(); i++) {
            if (viaje.getBus().getPlaca().equals(empresa.getListaViajes().get(i).getBus().getPlaca())) {
                encontroBus = true;
                puedeProgramarViaje = puedeProgramarViaje(empresa.getListaViajes().get(i).getFechaHoraSalida(), empresa.getListaViajes().get(i).getFechaHoraLlegada(),
                        viaje.getFechaHoraSalida(), viaje.getFechaHoraLlegada());
            }
        }
        if (!encontroBus || puedeProgramarViaje) {
            empresa.getListaViajes().add(viaje);
            persistirDatos();
        }
    }

    private boolean puedeProgramarViaje(LocalDateTime fechaSalidaViajeCreado, LocalDateTime fechaLlegadaViajeCreado,
            LocalDateTime fechaSalidaViajeNuevo, LocalDateTime fechaLlegadaViajeNuevo) throws
            VehiculoNoHabilitadoExcepcion, ViajeCruzadoExcepcion {

        LocalDateTime fechaHabilitacion = fechaLlegadaViajeCreado.plus(1, ChronoUnit.DAYS);

        if (fechaSalidaViajeNuevo.isBefore(fechaHabilitacion)) {
            throw new VehiculoNoHabilitadoExcepcion();
        }

        if (fechaSalidaViajeNuevo.isAfter(fechaLlegadaViajeCreado)
                || fechaLlegadaViajeNuevo.isBefore(fechaSalidaViajeCreado)) {
            return true;
        } else {
            throw new ViajeCruzadoExcepcion();
        }
    }
    
     public void persistirDatos() {
        SingletonUsuario.getInstancia().escribirUsuarios();
        SingletonCaseta.getInstancia().escribirCasetas();
    }
    
}