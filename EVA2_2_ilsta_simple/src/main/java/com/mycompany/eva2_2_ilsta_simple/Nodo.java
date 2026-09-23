/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_2_ilsta_simple;

/**
 *
 * @author Luis
 */
public class Nodo {
//Atributos
    private int valor;
    private Nodo siguiente;
    //Constructores:
  //Es importante que siguiete siempre se se inicialice en NULL
    public Nodo(){
        siguiente = null;
    }
    public Nodo(int valor){
        this.valor=valor;
        siguiente = null;
    }
    

//getters y setters

    public int getValor() {
        return valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
