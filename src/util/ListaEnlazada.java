/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.io.Serializable;

/**
 *
 * @author Juan Esteban
 */
public class ListaEnlazada<T> implements IList<T>,Serializable {

    private int size;
    private Nodo<T> primero;

    public ListaEnlazada() {
        this.size = 0;
        this.primero = null;
    }

    @Override
    public void add(T dato) {
        Nodo<T> nodoNuevo = new Nodo<>(dato);
        if (primero == null) {
            this.primero = nodoNuevo;
        } else {
            Nodo<T> aux = this.primero;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nodoNuevo);
        }
        size++;
    }

    @Override
    public T get(int index) {
        if (index < 0) {
            return primero.getDato();
        } else {
            Nodo<T> aux = this.primero;
            int contador = 0;
            while (contador < index) {
                aux = aux.getSiguiente();
                contador++;
            }
            return aux.getDato();
        }
    }

    @Override
    public void add(T dato, int index) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException("Para el indice" + index);
        } else {
            Nodo<T> nodoNuevo = new Nodo<>(dato);
            if (index == 0) {
                nodoNuevo.setSiguiente(primero);
                primero = nodoNuevo;
            } else {
                Nodo<T> nodoActual = this.primero;
                int contador = 0;
                while (contador < index - 1);
                nodoActual = nodoActual.getSiguiente();
                contador++;
            }
            nodoNuevo.setSiguiente(nodoNuevo.getSiguiente());
        }
        size++;
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Para el indice" + index);
        } else {
            if (index == 0) {
                primero = primero.getSiguiente();
            } else {
               Nodo<T> nodoActual = this.primero;
                int contador = 0;
                while (contador < index - 1) {
                    nodoActual = nodoActual.getSiguiente();
                    contador++;
                }
                nodoActual.setSiguiente(nodoActual.getSiguiente().getSiguiente());
            }
            size--;
        }
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

}
