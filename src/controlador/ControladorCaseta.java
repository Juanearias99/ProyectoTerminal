/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Caseta;
import singleton.SingletonCaseta;

/**
 *
 * @author Juan Esteban
 */
public class ControladorCaseta {

    private final Caseta[][] casetas;

    public ControladorCaseta() {
        casetas = SingletonCaseta.getInstancia().getCasetas();
    }

    public Caseta[][] getCasetas() {
        return casetas;
    }

    public Caseta obtenerCaseta(int fila, int columna) {
        return casetas[fila][columna];
    }

}
