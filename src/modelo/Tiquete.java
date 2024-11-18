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
public class Tiquete implements Serializable {

    private String codigo;
    private Viaje viaje;
    private Cliente cliente;
    private Bus bus;
    private int cantidadTiquetes;
    private Date fechaCompra;
    private double precioTiquete;
    private int puntosAcumulados;
    private boolean estadoTiquete;

    public Tiquete(String codigo, Viaje viaje, Cliente cliente, Bus bus, int cantidadTiquetes, Date fechaCompra, double precioTiquete, int puntosAcumulados, boolean estadoTiquete) {
        this.codigo = codigo;
        this.viaje = viaje;
        this.cliente = cliente;
        this.bus = bus;
        this.cantidadTiquetes = cantidadTiquetes;
        this.fechaCompra = fechaCompra;
        this.precioTiquete = precioTiquete;
        this.puntosAcumulados = puntosAcumulados;
        this.estadoTiquete = estadoTiquete;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Viaje getViaje() {
        return viaje;
    }

    public void setViaje(Viaje viaje) {
        this.viaje = viaje;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public int getCantidadTiquetes() {
        return cantidadTiquetes;
    }

    public void setCantidadTiquetes(int cantidadTiquetes) {
        this.cantidadTiquetes = cantidadTiquetes;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public double getPrecioTiquete() {
        return precioTiquete;
    }

    public void setPrecioTiquete(double precioTiquete) {
        this.precioTiquete = precioTiquete;
    }

    public int getPuntosAcumulados() {
        return puntosAcumulados;
    }

    public void setPuntosAcumulados(int puntosAcumulados) {
        this.puntosAcumulados = puntosAcumulados;
    }

    public boolean isEstadoTiquete() {
        return estadoTiquete;
    }

    public void setEstadoTiquete(boolean estadoTiquete) {
        this.estadoTiquete = estadoTiquete;
    }

}
