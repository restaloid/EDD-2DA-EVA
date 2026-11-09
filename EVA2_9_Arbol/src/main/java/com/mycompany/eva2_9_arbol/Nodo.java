/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_9_arbol;

/**
 *
 * @author Luis
 */
public class Nodo {
   //Atributoos
    private int valor;
    private Nodo Derecha;
    private Nodo Izquierda;
    
    //Builder
    public Nodo(){
        this.Derecha = null;
        this.Izquierda = null;
    }
    
    public Nodo(int valor){
        this.valor=valor;
        this.Derecha = null;
        this.Izquierda = null;
    }
    
    //getters setters
    public int getValor(){
        return valor;
    }
    public Nodo getDerecha(){
            return Derecha;
    }
    public Nodo getIzquierda(){
        return Izquierda;
    }
    
    public void setValor(int valor){
        this.valor=valor;
    }
    public void setDerecha(Nodo Derecha){
        this.Derecha=Derecha;
    }
    public void setIzquierda(Nodo Izquierda){
        this.Izquierda=Izquierda;
    }


}

