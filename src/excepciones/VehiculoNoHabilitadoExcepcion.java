/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author Juan Esteban
 */
public class VehiculoNoHabilitadoExcepcion extends Exception {

    public VehiculoNoHabilitadoExcepcion() {
        super("El vehículo aún no está habilitado para un nuevo viaje.");
    }

}
