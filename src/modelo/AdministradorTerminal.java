/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Juan Esteban
 */
public class AdministradorTerminal extends Usuario {

    private String direccion;
    private int edad;

    public AdministradorTerminal(String direccion, int edad, String cedula, String nombre, String correo, String contrasenia) {
        super(cedula, nombre, correo, contrasenia);
        this.direccion = direccion;
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
