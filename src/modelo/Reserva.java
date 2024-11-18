/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Juan Esteban
 */
public class Reserva implements Serializable {

    private String correo;
    private Cliente cliente;
    private Viaje viaje;
    private Date fechaCompra;
    private int cantidadTiquetes;
    private boolean estado;

    public Reserva() {
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Viaje getViaje() {
        return viaje;
    }

    public void setViaje(Viaje viaje) {
        this.viaje = viaje;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public int getCantidadTiquetes() {
        return cantidadTiquetes;
    }

    public void setCantidadTiquetes(int cantidadTiquetes) {
        this.cantidadTiquetes = cantidadTiquetes;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}
