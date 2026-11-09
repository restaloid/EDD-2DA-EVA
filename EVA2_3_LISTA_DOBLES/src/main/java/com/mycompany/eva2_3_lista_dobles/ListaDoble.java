/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_3_lista_dobles;


public class ListaDoble {
    private Nodo inicio;
    private Nodo fin;
    private int size;

    public ListaDoble(){ //Creacion y hay 0 ndos
        inicio = null;
        fin = null;
    }
    
    //Metodo para añadir nodos a la listaaa Doublee
    public void add(int valor){
        Nodo nuevo = new Nodo(valor);
        if(inicio==null){
            inicio= nuevo;
            fin=inicio;
            size=1;
            
        }else{
            fin.setSiguiente(nuevo);
            nuevo.setPrevio(fin);
            fin=nuevo;
            size++;
        }
    }
    
    //Metodo print o(N)
    public void imprimir(){
        Nodo temp = inicio;
        while(temp !=null){
            System.out.println("["+temp.getValor() + "]");
            
            temp = temp.getSiguiente();
        }
    }
    
    //Metodo Lista Vacia
    public boolean listaVacia(){
        Nodo temp= inicio;
        if(temp==null){
            return true;
        }else{
            return false;
        }
    }
    
    //Eficiencia n(1)
    public void vaciarLista(){
        inicio = null;
        fin = null;//Garbage Collector 

    }
    public void tamanoLista(){
        if(size==1){
            System.out.println("Hay "+size+" Nodo en la lista");    
        }else{
            System.out.println("Hay "+size+" Nodos en la lista");
        }
    }

    public void addEN(int posicion, int valor){
        
        if(posicion<0 || posicion >size){
            throw new RuntimeException("La posicion no es valida para insetertar");            
        }
        if(posicion==0){
            Nodo nuevo = new Nodo(valor);
            if(inicio!=null){
                nuevo.setSiguiente(inicio);
                inicio.setPrevio(nuevo);
            }else{
            inicio=nuevo;
            fin=nuevo;
            }
            size--;
            return;
        }
        
        if(posicion==size){
            add(valor);
            return;
        }

        Nodo nuevo = new Nodo(valor);
        Nodo temp = inicio;
        for(int i =0; i<posicion-1;i++){
            temp=temp.getSiguiente();
        }
        Nodo nextNodo= temp.getSiguiente();
        nuevo.setSiguiente(nextNodo);
        nuevo.setPrevio(temp);
        temp.setSiguiente(nuevo);
        if(nextNodo!=null){
            nextNodo.setPrevio(nuevo);
        }
        size++;
    }

    public void DeleteIn(int posicion){
        if(posicion<0||posicion>size){
            throw new RuntimeException("Posicion no valida");
        }
        if(posicion==0){
            inicio=inicio.getSiguiente();
            if(inicio!=null){
                inicio.setPrevio(null);
            }else{
                fin=null;
            }
            size--;
            return ;
        }
        Nodo temp = inicio;
        for(int i =0; i<posicion-1; i++){
            temp=temp.getSiguiente();
        }
        Nodo EraseNode = temp.getSiguiente();
        Nodo nextNodo = EraseNode.getSiguiente();
        temp.setSiguiente(nextNodo);
        if(nextNodo!=null){
            nextNodo.setPrevio(temp);
        }
        if(EraseNode==fin){
            fin = temp;
        }
        size--;
    }




}
