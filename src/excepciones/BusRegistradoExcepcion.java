/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author Juan Esteban
 */
public class BusRegistradoExcepcion extends Exception {

    public BusRegistradoExcepcion() {
        super("Ya existe un bus con esta placa");
    }
    
}
