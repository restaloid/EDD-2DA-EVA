package com.eva2_11_iterator;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<>();
        
        lista.add(100);
        lista.add(200);
        lista.add(300);
        lista.add(400);
        lista.add(500);
        System.out.println(lista);
        Iterator<Integer> iterador = lista.iterator();
        //Nos permite aceder a los elemtnso de la lsta sin recorrer cada vezlos nodos anteriores
        while(iterador.hasNext()){
            System.out.println(iterador.next());
        }
    }
}