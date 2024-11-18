/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Juan Esteban
 */
public class AdministradorFlota extends Usuario {

    private String genero;
    private String telefono;

    public AdministradorFlota(String genero, String telefono, String cedula, String nombre, String correo, String contrasenia) {
        super(cedula, nombre, correo, contrasenia);
        this.genero = genero;
        this.telefono = telefono;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
