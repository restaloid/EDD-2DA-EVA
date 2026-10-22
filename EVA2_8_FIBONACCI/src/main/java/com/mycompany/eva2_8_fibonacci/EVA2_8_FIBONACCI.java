/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_8_fibonacci;

/**
 *
 * @author Luis
 */
public class EVA2_8_FIBONACCI {

    public static void main(String[] args) {
        System.out.println("Fibonacci para la posicion 7");
        System.out.println(fibonacci(7));
    }
    
    
    
    public static int fibonacci(int posi){
        
        if(posi == 1 || posi==0){
            return 1;
        }
        return fibonacci(posi-1)+fibonacci(posi-2);
        
    }
}
