/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_1_referencias;

/**
 *
 * @author Luis
 */
public class EVA2_1_REFERENCIAS {

    public static void main(String[] args) {
        Ejemplo ejemplo1 = new Ejemplo();
        System.out.println("Ejemplo1 = " + ejemplo1);
        System.out.println("Ejemplo1 = " + ejemplo1.val);
        System.out.println("Ejemplo1 = " + ejemplo1.otro);
        
        ejemplo1.otro = new Ejemplo();
        
        System.out.println("Ejemplo1 = " + ejemplo1);
        System.out.println("Ejemplo1 = " + ejemplo1.otro.val);
        System.out.println("Ejemplo1 = " + ejemplo1.otro.otro);
        
        ejemplo1.otro.otro = new Ejemplo();
        ejemplo1.otro.otro.otro = new Ejemplo();
        ejemplo1.otro.otro.otro.otro = new Ejemplo();
        
        
        Ejemplo siguiente = ejemplo1;
        while(siguiente !=null){
            System.out.print("["+siguiente.val + "]");
            siguiente = siguiente.otro;
            
        }
        System.out.println("");
    }
}

class Ejemplo{
    int val = 5; 
    Ejemplo otro;
}
