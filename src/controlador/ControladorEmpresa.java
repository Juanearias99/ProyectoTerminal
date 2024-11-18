/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.AdministradorFlota;
import modelo.Caseta;
import modelo.Empresa;
import singleton.SingletonCaseta;
import singleton.SingletonUsuario;

/**
 *
 * @author Juan Esteban
 */
public class ControladorEmpresa {

    private final Caseta[][] casetas;

    public ControladorEmpresa() {
        casetas = SingletonCaseta.getInstancia().getCasetas();
    }

    public Empresa buscarEmpresa(String nit) {
        for (int i = 0; i < casetas.length; i++) {
            for (int j = 0; j < casetas[i].length; j++) {
                Empresa empresa = casetas[i][j].getEmpresa();
                if (empresa.getNit() != null && empresa.getNit().equals(nit)) {
                    return empresa;
                }
            }
        }
        return null;
    }

    public Empresa buscarEmpresa(AdministradorFlota administradorFlota) {
        for (int i = 0; i < casetas.length; i++) {
            for (int j = 0; j < casetas[i].length; j++) {
                Empresa empresa = casetas[i][j].getEmpresa();
                if (empresa.getAdminFlota() != null
                        && empresa.getAdminFlota().getCedula().equals(administradorFlota.getCedula())) {
                    return empresa;
                }
            }
        }
        return null;
    }

    public void persistirDatos() {
        SingletonUsuario.getInstancia().escribirUsuarios();
        SingletonCaseta.getInstancia().escribirCasetas();
    }

}
