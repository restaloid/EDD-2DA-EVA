    package com.mycompany.eva2_2_ilsta_simple; /**
     *
     * @author Luis
     */
    public class EVA2_2_ilsta_simple {
        public static void main(String []args){
            ListaSimple lista = new ListaSimple();
            System.out.println("Nodos a añadir a la lista");
            lista.add(260);
            lista.add(999);
            lista.add(355);
            lista.add(358);
            lista.add(3541);
            lista.add(1);
            lista.add(2);
            lista.add(3);

            lista.imprimir();   
            System.out.println("Numero de nodos en la lista = "+lista.longitud());
            
            //Encontar posiciones en el lugar 0 a n
            System.out.println("Buscar valor en el nodo 5");
            int value = lista.encontrarEN(5);
            if(value!=-1){
                System.out.println("Valor en el nodo 5 = "+value);
            }else{
                System.out.println("El valor no se encontró en la lista");
            }
            /*------------------------------------------------------*/
            System.out.println("El valor a cambiar en el nodo 7 de la lista sera cambiado a 50");
            if(lista.seekNChange(7, 50)!=-1){
                System.out.println("El valor en el nodo 7 fue cambiado a 50");
                lista.imprimir();
            }else{
                System.out.println("El valor no se encontró en la lista");
            }
            System.out.println("El valor a cambiar en el nodo 7 de la lista sera cambiado a 50");
            if(lista.seekNChange(3, 777)!=-1){
                System.out.println("El valor en el nodo 3 fue cambiado a 777");
                lista.imprimir();
            }else{
                System.out.println("El valor no se encontró en la lista");
            }
            /*------------------------------------------------------*/
            System.out.println("Agregar un nuevo nodo en la posicion 0 con valor 450");
            lista.insert(0, 450);
            System.out.println("Longitud de lista = " +lista.longitud());
            System.out.println("Agregar un nuevo nodo en la posicion 5 con valor 555");
            lista.insert(5, 555);
            System.out.println("Longitud de lista = " +lista.longitud());
            /*------------------------------------------------------*/
            //Metodo para eliminar un Nodo
            System.out.println("Eliminaremos el nodo en la posicion 0");
            lista.SeekNDestroy(0);
            lista.imprimir();
            System.out.println("Nodos en la lista " + lista.longitud());
            
            System.out.println("Eliminaremos el nodo en la posicion 8");
            lista.SeekNDestroy(8);
            lista.imprimir();
            System.out.println("Nodos en la lista " + lista.longitud());
            
            System.out.println("Eliminaremos el nodo en la posicion 0");
            lista.SeekNDestroy(0);
            lista.imprimir();
            System.out.println("Nodos en la lista " + lista.longitud());
        }   
        
        
    }
