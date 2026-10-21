/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_7_mcd;

/**
 *
 * @author Luis
 */
public class EVA2_7_MCD {

    public static void main(String[] args) {
        System.out.println("MCD de 180/48");
        int rr=mcd(180,48);
        System.out.println("El Maximo Comun divisor es " + rr);
        
    }

    public static int mcd(int dividendo, int divisor){
       //Lo que resuelve parte del problema
       if(divisor ==0){
           return dividendo;
       }
       int residuo = dividendo%divisor;
       //la llamada recusriva (el metodo se llama a si mismo
       return mcd(divisor, residuo);
        //detener la recursividad
      
    }
}

