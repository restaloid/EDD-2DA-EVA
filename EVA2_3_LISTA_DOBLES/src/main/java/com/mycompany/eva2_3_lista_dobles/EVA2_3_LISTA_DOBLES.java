/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_3_lista_dobles;

/**
 *
 * @author Luis
 */
public class EVA2_3_LISTA_DOBLES {

    public static void main(String[] args) {
        ListaDoble listaD = new ListaDoble();
        System.out.println("La lista esta vacia?");
        if(listaD.listaVacia()){
            System.out.println("Si esta vacia");
        }else{
            System.out.println("No esta vacia");
        }
        
        System.out.println("Nodos a añadir a la lista");
            listaD.add(260);
            listaD.add(999);
            listaD.add(355);
            listaD.add(358);
            listaD.add(3541);
            listaD.imprimir();
        System.out.println("La lista esta vacia?");
        if(listaD.listaVacia()){
            System.out.println("Si esta vacia");
        }else{
            System.out.println("No esta vacia");
        }
        
        
        //Vaciaremos la lista
        System.out.println("Vaciar lista...");
        listaD.vaciarLista();
        System.out.println("La lista esta vacia?");
        if(listaD.listaVacia()){
            System.out.println("Si esta vacia");
        }else{
            System.out.println("No esta vacia");
        }   
    
    }
}
