/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_10_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author Luis
 */
public class EVA2_10_COLLECTIONS {

    public static void main(String[] args) {
        LinkedList <Integer> lista = new LinkedList <>();
        lista.add(600);
        lista.add(300);
        lista.add(100);
        lista.add(700);
        System.out.println(lista);
        System.out.println(lista.size());
        lista.clear();
        System.out.println(lista.size());
        
        
        //ArrayList --> No es una lista, es un arreglo. Si necesita cambiar e tamaño
        //Se crea un nuevo arreglo y se trnsfierela info. no es una lsta
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Hola");
        arrayList.add(" ");
        arrayList.add("Mundo");
        arrayList.add(" ");
        arrayList.add("!!");
        System.out.println(arrayList);
        System.out.println(arrayList.size());
        
        
        //Stack
        //el ultimo en llegar es el pirmero en ser atendido LIFO
        Stack<Integer> stack = new Stack<Integer>();
        stack.add(100);
        stack.add(200);
        stack.add(300);
        stack.add(400);
        stack.add(500);
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    
    //Queue
    Queue<String> queue = new LinkedList<>();
    queue.add("Hola");
    queue.add(" ");
    queue.add("Mundo");
    queue.add("!!");
    System.out.println(queue);
    System.out.println(queue.peek());
    System.out.println(queue.poll());
    System.out.println(queue.poll());
    
    }
}
