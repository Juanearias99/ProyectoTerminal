/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author Juan Esteban
 */
public class Queue<T> implements IQueue<T> {

    private int size;
    private Nodo<T> primero;

    public Queue() {
        this.size = 0;
        this.primero = null;
    }

    @Override
    public void enqueue(T dato) {
        Nodo<T> nodoNuevo = new Nodo(dato);
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

    public T dequeue(T dato) {
        return dato;
    }

    public T peek(T dato) {
        return dato;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public T dequeue() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public T peek() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
