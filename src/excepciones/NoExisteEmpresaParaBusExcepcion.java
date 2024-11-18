/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author Juan Esteban
 */
public class NoExisteEmpresaParaBusExcepcion extends Exception{

    public NoExisteEmpresaParaBusExcepcion() {
        super("Debe de registrar una empresa antes de agregar un bus. \n\nComuniquese con el administrador del terminal");
    }
    
    
}
