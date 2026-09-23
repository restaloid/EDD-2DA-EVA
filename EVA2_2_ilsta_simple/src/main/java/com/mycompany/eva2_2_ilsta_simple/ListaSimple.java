/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_2_ilsta_simple;

/**
 *
 * @author Luis
 */
public class ListaSimple {
    private Nodo inicio;
    public ListaSimple(){
        inicio = null; //si acabo de crear la lista, no tiene nodos
    }
    
    //Siempre el comportamiento por default es agregar un nodo
    //a the end of the list
    public void add(int valor){
        Nodo nuevo = new Nodo(valor);
        //que hacer  primero, saber si tennemos nodos o no
        if(inicio==null){//No tiene nodos
            inicio =  nuevo;
        }else{//Tiene nodos
            Nodo temp = inicio;
            while(temp.getSiguiente()!=null){
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevo);
            nuevo.setValor(valor);
            
    }
        
        
}
    public void imprimir(){
        Nodo temp = inicio;
        while(temp !=null){
            System.out.print("["+temp.getValor() + "]");
            temp = temp.getSiguiente();
        }
        System.out.println("");
    }
}