/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import util.ListaEnlazada;

/**
 *
 * @author Juan Esteban
 */
public class Empresa implements Serializable {

    private String nombre;
    private String nit;
    private AdministradorFlota adminFlota;
    private int cantidadPlazaEstacionamiento;
    private double canonArrendamiento;
    private ListaEnlazada<Bus> listaBuses;
    private ListaEnlazada<Viaje> listaViajes;

    public Empresa() {
        listaBuses = new ListaEnlazada<>();
        listaViajes = new ListaEnlazada<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public AdministradorFlota getAdminFlota() {
        return adminFlota;
    }

    public void setAdminFlota(AdministradorFlota adminFlota) {
        this.adminFlota = adminFlota;
    }

    public int getCantidadPlazaEstacionamiento() {
        return cantidadPlazaEstacionamiento;
    }

    public void setCantidadPlazaEstacionamiento(int cantidadPlazaEstacionamiento) {
        this.cantidadPlazaEstacionamiento = cantidadPlazaEstacionamiento;
    }

    public double getCanonArrendamiento() {
        return canonArrendamiento;
    }

    public void setCanonArrendamiento(double canonArrendamiento) {
        this.canonArrendamiento = canonArrendamiento;
    }

    public ListaEnlazada<Bus> getListaBuses() {
        return listaBuses;
    }

    public void setListaBuses(ListaEnlazada<Bus> listaBuses) {
        this.listaBuses = listaBuses;
    }

    public ListaEnlazada<Viaje> getListaViajes() {
        return listaViajes;
    }

    public void setListaViajes(ListaEnlazada<Viaje> listaViajes) {
        this.listaViajes = listaViajes;
    }

    
}
