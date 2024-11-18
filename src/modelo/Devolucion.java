/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 *
 * @author Juan Esteban
 */
public class Devolucion implements Serializable{

    private String codigo;
    private Tiquete tiquete;
    private LocalDateTime fechaDevolucion;
    private double valorDevolucion;
    private String motivo;

    public Devolucion(String codigo, Tiquete tiquete, LocalDateTime fechaDevolucion, double valorDevolucion, String motivo) {
        this.codigo = codigo;
        this.tiquete = tiquete;
        this.fechaDevolucion = fechaDevolucion;
        this.valorDevolucion = valorDevolucion;
        this.motivo = motivo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Tiquete getTiquete() {
        return tiquete;
    }

    public void setTiquete(Tiquete tiquete) {
        this.tiquete = tiquete;
    }

    public LocalDateTime getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDateTime fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public double getValorDevolucion() {
        return valorDevolucion;
    }

    public void setValorDevolucion(double valorDevolucion) {
        this.valorDevolucion = valorDevolucion;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

}
