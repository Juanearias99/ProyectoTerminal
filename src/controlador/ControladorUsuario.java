/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import excepciones.CorreoRegistradoExcepcion;
import excepciones.UsuarioRegistradoExcepcion;
import modelo.AdministradorFlota;
import modelo.AdministradorTerminal;
import modelo.Caseta;
import modelo.Empresa;
import modelo.Usuario;
import singleton.SingletonCaseta;
import singleton.SingletonUsuario;
import util.ListaEnlazada;

/**
 *
 * @author Juan Esteban
 */
public class ControladorUsuario {

    private final Caseta[][] casetas;
    private static AdministradorTerminal admin;
    private final ListaEnlazada<Usuario> listaUsuarios;

    public ControladorUsuario() {
        casetas = SingletonCaseta.getInstancia().getCasetas();
        listaUsuarios = SingletonUsuario.getInstancia().getUsuarios();
        admin = new AdministradorTerminal("1234", 18, "Carrera20", "Juan99", "juan99", "123");
        crearAdminTerminal();
    }

    private void crearAdminTerminal() {
        try {
            guardarUsuario(admin);
        } catch (CorreoRegistradoExcepcion | UsuarioRegistradoExcepcion ex) {
        }
    }

    public static AdministradorTerminal getAdministradorTerminal() {
        return admin;
    }

    

    public AdministradorFlota buscarAdminFlota(String correo) {
        for (int i = 0; i < casetas.length; i++) {
            for (int j = 0; j < casetas[i].length; j++) {
                AdministradorFlota administradorFlota = casetas[i][j].getEmpresa().getAdminFlota();
                if (administradorFlota != null && administradorFlota.getCorreo().equals(correo)) {
                    return administradorFlota;
                }

            }
        }
        return null;
    }

    private void buscarUsuarioPorCorreo(String correo) throws CorreoRegistradoExcepcion {
        for (int i = 0; i < listaUsuarios.size(); i++) {
            if (listaUsuarios.get(i).getCorreo().equalsIgnoreCase(correo)) {
                throw new CorreoRegistradoExcepcion();
            }
        }
    }

    public Usuario buscarUsuarioPorCedula(String cedula) {
        for (int i = 0; i < listaUsuarios.size(); i++) {
            if (listaUsuarios.get(i).getCedula().equalsIgnoreCase(cedula)) {
                return listaUsuarios.get(i);
            }
        }
        return null;
    }

    public Usuario realizarLogin(String correo, String contrasenia) {
        for (int i = 0; i < listaUsuarios.size(); i++) {
            if (listaUsuarios.get(i).getCorreo().equals(correo)
                    && listaUsuarios.get(i).getContrasenia().equals(contrasenia)) {
                return listaUsuarios.get(i);
            }
        }
        return null;
    }

    public void guardarUsuario(Usuario usuario) throws CorreoRegistradoExcepcion, UsuarioRegistradoExcepcion {
        buscarUsuarioPorCorreo(usuario.getCorreo());
        Usuario buscarUsuario = buscarUsuarioPorCedula(usuario.getCedula());
        if (buscarUsuario != null) {
            throw new UsuarioRegistradoExcepcion();
        }
        listaUsuarios.add(usuario);
        persistirDatos();
    }

    public void persistirDatos() {
        SingletonUsuario.getInstancia().escribirUsuarios();
        SingletonCaseta.getInstancia().escribirCasetas();
    }

}
