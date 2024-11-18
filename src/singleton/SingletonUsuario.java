/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import modelo.Usuario;
import util.ListaEnlazada;

/**
 *
 * @author Juan Esteban
 */
public class SingletonUsuario {
     private static SingletonUsuario INSTANCIA = new SingletonUsuario();
    ListaEnlazada<Usuario> usuarios;

    private SingletonUsuario() {
        usuarios = leerUsuarios();

    }

    public static SingletonUsuario getInstancia() {
        return INSTANCIA;
    }

    public ListaEnlazada<Usuario> getUsuarios() {
        return usuarios;
    }

    private ListaEnlazada<Usuario> leerUsuarios() {
        try {
            FileInputStream archivo = new FileInputStream("src/singleton/usuarios.dat");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            return (ListaEnlazada<Usuario>) lector.readObject();
        } catch (IOException | ClassNotFoundException e) {
            usuarios = new ListaEnlazada<Usuario>();
            escribirUsuarios();
            return usuarios;
        }

    }

    public void escribirUsuarios() {
        try {
            FileOutputStream archivo = new FileOutputStream("src/singleton/usuarios.dat");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(usuarios);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
