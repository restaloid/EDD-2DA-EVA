/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_9_arbol;

/**
 *
 * @author Luis
 */
public class EVA2_9_Arbol_Binario {
    public static void main(String []args){
        Arbol_Binario tree = new Arbol_Binario();
        tree.add(10);
        tree.add(18);
        tree.add(2);
        tree.add(11);
        tree.add(17);
        tree.add(20);
        tree.add(18);
        tree.preOrder();
    }
}
