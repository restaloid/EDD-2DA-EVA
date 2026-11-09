package com.recursividad;

public class Main {
    public static void imprimirInvCiclo(int valor) {
        for(int i =valor; i>=1; i--){
            System.out.println(i +" -");
        }
        System.out.println("");
    }

    public static void printInvRec(int valor){
        if(valor>=1){
            System.out.println(valor +" - ");
            imprimirInvCiclo(valor-1);
        }
    }
    public static void main(String args[]){
        int valor=80;
        imprimirInvCiclo(valor);
        printInvRec(valor);
    }



}