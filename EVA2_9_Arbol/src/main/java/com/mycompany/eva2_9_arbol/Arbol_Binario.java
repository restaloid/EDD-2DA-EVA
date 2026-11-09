/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_9_arbol;

/**
 *
 * @author Luis
 */
public class Arbol_Binario {
    private Nodo root;
    
    public Arbol_Binario(){
        root = null;
    }
    
    //Agregar un valor al arbolito :=/
    public void add(int valor){
        //Esta vacio el arbol
        if(root==null){
            root =  new Nodo(valor);
            
        }else{
            //Nodo en cuestion y el valor a insertar
            addRecu(root,valor);
        }
    }
      
     
    private void addRecu(Nodo actual, int valor){
        if(valor < actual.getValor()){
            if(actual.getIzquierda()==null){
                actual.setIzquierda(new Nodo(valor));
            }else{
                addRecu(actual.getIzquierda(),valor);
            }
        }else{
            if(actual.getDerecha()==null){
                actual.setDerecha(new Nodo(valor));       
            }else{
                addRecu(actual.getDerecha(),valor);
            }
        }
    }
   
    public void preOrder(){
        preOrderRecu(root);
   
      
    }
    
    private void preOrderRecu(Nodo actual){
        System.out.print(actual.getValor() + "-");//Visit nodo
        
            System.out.print(actual.getValor() + " - ");
            if(actual.getIzquierda() !=null){
                preOrderRecu(actual.getIzquierda());
            }if(actual.getDerecha()!=null){
                preOrderRecu(actual.getDerecha());
            }
        
        
    }
    //--------
}
