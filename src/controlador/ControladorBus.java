/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import excepciones.BusRegistradoExcepcion;
import excepciones.NoExisteEmpresaParaBusExcepcion;
import excepciones.SuperoNumeroPlazasExcepcion;
import modelo.Bus;
import modelo.Caseta;
import modelo.Empresa;
import singleton.SingletonCaseta;
import singleton.SingletonUsuario;
import util.ListaEnlazada;

/**
 *
 * @author Juan Esteban
 */
public class ControladorBus {

    private final ControladorEmpresa controladorE;
    private final Caseta[][] casetas;

    public ControladorBus() {
        controladorE = new ControladorEmpresa();
        casetas = SingletonCaseta.getInstancia().getCasetas();
    }

    public Bus buscarBus(Bus bus) {
        for (int i = 0; i < casetas.length; i++) {
            for (int j = 0; j < casetas[i].length; j++) {
                ListaEnlazada<Bus> listaBuses = casetas[i][j].getEmpresa().getListaBuses();
                for (int k = 0; k < listaBuses.size(); k++) {
                    if (listaBuses.get(k).getPlaca().equals(bus.getPlaca())) {
                        return listaBuses.get(k);
                    }
                }
            }
        }
        return null;
    }

    public void guardarBus(Bus bus, Empresa empresa) throws BusRegistradoExcepcion, NoExisteEmpresaParaBusExcepcion, SuperoNumeroPlazasExcepcion {
        Bus buscarBus = buscarBus(bus);
        Empresa buscarEmpresa = controladorE.buscarEmpresa(empresa.getNit());
        if (buscarBus != null) {
            throw new BusRegistradoExcepcion();
        }
        if (buscarEmpresa == null) {
            throw new NoExisteEmpresaParaBusExcepcion();
        }

        if (empresa.getListaBuses().size() == empresa.getCantidadPlazaEstacionamiento()) {
            throw new SuperoNumeroPlazasExcepcion();
        }
        empresa.getListaBuses().add(bus);
        persistirDatos();
    }

    public void persistirDatos() {
        SingletonUsuario.getInstancia().escribirUsuarios();
        SingletonCaseta.getInstancia().escribirCasetas();
    }

}
