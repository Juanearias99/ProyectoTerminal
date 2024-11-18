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
import modelo.Caseta;

/**
 *
 * @author Juan Esteban
 */
public class SingletonCaseta {
    
    private static SingletonCaseta INSTANCIA = new SingletonCaseta();
    Caseta[][] casetas;

    private SingletonCaseta() {
        casetas = leerCasetas();

    }

    public static SingletonCaseta getInstancia() {
        return INSTANCIA;
    }

    public Caseta[][] getCasetas() {
        return casetas;
    }

    private Caseta[][] leerCasetas() {
        try {
            FileInputStream archivo = new FileInputStream("src/singleton/casetas.dat");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            return (Caseta[][]) lector.readObject();
        } catch (IOException | ClassNotFoundException e) {
            casetas = new Caseta[4][5];
            int numeroCaseta = 1;
            for (int i = 0; i < casetas.length; i++) {
                for (int j = 0; j < casetas[i].length; j++) {
                    casetas[i][j] = new Caseta();
                    casetas[i][j].setNumeroCaseta(numeroCaseta);
                    numeroCaseta ++;
                }
            }
            escribirCasetas();
            return casetas;
        }

    }

    public void escribirCasetas() {
        try {
            FileOutputStream archivo = new FileOutputStream("src/singleton/casetas.dat");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(casetas);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
