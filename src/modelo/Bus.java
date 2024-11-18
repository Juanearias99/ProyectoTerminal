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
public class Bus implements Serializable {

    private String placa;
    private int puesto;
    private boolean estaDisponible;

    public Bus(String placa, int puesto) {
        this.placa = placa;
        this.puesto = puesto;
        this.estaDisponible = true;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getPuesto() {
        return puesto;
    }

    public void setPuesto(int puesto) {
        this.puesto = puesto;
    }

    public boolean isEstaDisponible() {
        return estaDisponible;
    }

    public void setEstaDisponible(boolean estaDisponible) {
        this.estaDisponible = estaDisponible;
    }

    @Override
    public String toString() {
        return this.placa;
    }

}
