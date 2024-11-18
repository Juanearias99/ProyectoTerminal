/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author Juan Esteban
 */
public class ViajeCruzadoExcepcion extends Exception{

    public ViajeCruzadoExcepcion() {
        super("El nuevo viaje se cruza con el último viaje.");
    }
    
}
