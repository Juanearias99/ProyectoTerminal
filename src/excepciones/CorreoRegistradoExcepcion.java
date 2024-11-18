/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author Juan Esteban
 */
public class CorreoRegistradoExcepcion extends Exception {
    
    public CorreoRegistradoExcepcion() {
        super("Ya existe un usuario registrado con este correo");
    }
    
}
