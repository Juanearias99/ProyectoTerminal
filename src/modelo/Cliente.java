/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import util.ListaEnlazada;

/**
 *
 * @author Juan Esteban
 */
public class Cliente extends Usuario {

    private String direccion;
    private int puntosAcumulados;
    private Reserva reserva;
    private ListaEnlazada<Notificacion> notificaciones;
    private Tiquete tiquete;

    public Cliente(String direccion, int puntosAcumulados, Reserva reserva, ListaEnlazada<Notificacion> notificaciones, Tiquete tiquete, String cedula, String nombre, String correo, String contrasenia) {
        super(cedula, nombre, correo, contrasenia);
        this.direccion = direccion;
        this.puntosAcumulados = puntosAcumulados;
        this.reserva = new Reserva();
        this.notificaciones = new ListaEnlazada<>();
        this.tiquete = tiquete;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getPuntosAcumulados() {
        return puntosAcumulados;
    }

    public void setPuntosAcumulados(int puntosAcumulados) {
        this.puntosAcumulados = puntosAcumulados;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public ListaEnlazada<Notificacion> getNotificaciones() {
        return notificaciones;
    }

    public void setNotificaciones(ListaEnlazada<Notificacion> notificaciones) {
        this.notificaciones = notificaciones;
    }

    public Tiquete getTiquete() {
        return tiquete;
    }

    public void setTiquete(Tiquete tiquete) {
        this.tiquete = tiquete;
    }

    public void calcularPuntosAcumulados(double montoAcumulado) {
        int puntosObtenidos = (int) (montoAcumulado / 10000) * 3;
        this.puntosAcumulados += puntosObtenidos;
        System.out.println("Puntos Acumulados" + puntosAcumulados);
    }

    public boolean canjearPuntosPorTiquete(double precioTiquete) {
        if (puntosAcumulados >= 90 && precioTiquete <= 30000) {
            puntosAcumulados -= 90;
            System.out.println("Ha canjeado 90 puntos por un tiquete de $\" + precioTiquete");
            return true;
        }
        
        return false;
    }
}
