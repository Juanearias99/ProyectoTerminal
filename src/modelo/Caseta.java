/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author Juan Esteban
 */
public class Caseta implements Serializable{

    private int numeroCaseta;
    private Empresa empresa;
    private boolean estaDisponible;

    public Caseta() {
        this.empresa= new Empresa();
        this.estaDisponible = true;
    }

    public int getNumeroCaseta() {
        return numeroCaseta;
    }

    public void setNumeroCaseta(int numeroCaseta) {
        this.numeroCaseta = numeroCaseta;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public boolean isEstaDisponible() {
        return estaDisponible;
    }

    public void setEstaDisponible(boolean estaDisponible) {
        this.estaDisponible = estaDisponible;
    }

    
}
