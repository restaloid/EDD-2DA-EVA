/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_3_lista_dobles;

public class Nodo {
   //Atributoos
    private int valor;
    private Nodo Siguiente;
    private Nodo Previo;
    
    //Builder
    public Nodo(){
        Siguiente = null;
        Previo = null;
    }
    public Nodo(int valor){
        this.valor=valor;
        Siguiente = null;
    }
    
    //getters setters
    public int getValor(){
        return valor;
    }
    public Nodo getSiguiente(){
        return Siguiente;
    }
    public Nodo getPrevio(){
        return Previo;
    }
    
    public void setValor(int valor){
        this.valor=valor;
    }
    public void setSiguiente(Nodo Siguiente){
        this.Siguiente=Siguiente;
    }
    public void setPrevio(Nodo Previo){
        this.Previo=Previo;
    }


}