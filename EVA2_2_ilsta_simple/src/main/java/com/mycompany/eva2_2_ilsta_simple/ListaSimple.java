package com.mycompany.eva2_2_ilsta_simple;
    public class ListaSimple {
        private Nodo inicio;
        private Nodo fin;
        private int tamano;
        public ListaSimple(){
            inicio = null; //si acabo de crear la lista, no tiene nodos
            fin = null; 
            tamano = 0;
        }

        //Siempre el comportamiento por default es agregar un nodo
        //a the end of the list
        public void add(int valor){
            Nodo nuevo = new Nodo(valor);
            //que hacer  primero, saber si tennemos nodos o no
            if(inicio==null){//No tiene nodos
                inicio =  nuevo;
                fin = inicio;
                tamano = 1;
            }else{//Tiene nodos
                fin.setSiguiente(nuevo);
                nuevo.setValor(valor);
                fin=nuevo;
                tamano ++;
            }
        }
        
        //Metodo Imprimir O(N) d
        public void imprimir(){
            Nodo temp = inicio;
            while(temp !=null){
                System.out.println("["+temp.getValor() + "]");
                temp = temp.getSiguiente();
            }
        }
        //O(N) //Longitud ahora tiene que ser O(1) d
        public int longitud(){
            return tamano;
            }
        

        //Eficiencia n(1) d
        public void vaciaLista(){
            inicio = null;
            fin = null;
            //Garbage Collector 
        }

        //Empieza en posicion = 0
        //Ultima longitud (n)-1
        //O(n)
        public int encontrarEN(int posicion){ //D
            Nodo temp = inicio;
            int contar=0;
            while(temp!=null){
                if(contar==posicion){
                    return temp.getValor();
                } 
                contar++;
                temp=temp.getSiguiente();
            }
            return -1;
        }


        //metodo para editar el valor  O(N)
        public int seekNChange(int pos, int valToChange){ //D
            Nodo temp = inicio;
            int contar=0;
            while(temp!=null){
                if(contar==pos){
                    temp.setValor(valToChange);
                    return temp.getValor();
                } 
                contar++;
                temp=temp.getSiguiente();
            }
            return -1;
        }

        ///Metodo insertar O(N)^2 :(
        public void insert(int posicion,int valor){
            Nodo temp = inicio;
            int contar = 0;
            Nodo nuevo = new Nodo(valor);
            if(posicion<=-1 || posicion>(longitud()-1)){
                System.out.println("Posicion fuera de la lista");
                return;
            }
            while(temp!=null){
                int valorTemporal;
                if(contar==posicion){
                    valorTemporal=temp.getValor();
                    temp.setValor(valor);
                    //Si el nodo siguiente = null, se crea un nuevo nodo 
                    if(temp.getSiguiente()==null){
                        fin.setSiguiente(nuevo);
                        nuevo.setValor(valorTemporal);
                        fin=nuevo;
                        tamano++;
                        break;
                    }
                    temp.setValor(valor);
                    while(temp!=null){
                        temp=temp.getSiguiente();
                        int valTemp=temp.getValor();
                        temp.setValor(valorTemporal);
                        valorTemporal=valTemp;
                        if(temp.getSiguiente()==null){
                        fin.setSiguiente(nuevo);
                        nuevo.setValor(valorTemporal);
                        fin=nuevo;
                        tamano++;
                        break;
                    }
                        
                    }
                }
                contar++;
                temp=temp.getSiguiente();
            }
            imprimir();
        }
    
        public void SeekNDestroy(int posicion){
            Nodo temp = inicio;
            int contar = 0;
            if(posicion<0 || posicion>(longitud()-1)){
                System.out.println("Posicion fuera de la lista");
                return;
            }
            while(temp!=null){
                if(contar==posicion-1){
                    temp.setSiguiente(temp.getSiguiente().getSiguiente());
                    tamano--;
                    break;
                }
                if(contar==0 && posicion==0){
                    inicio=temp.getSiguiente();
                    tamano--;
                    break;
                }
                contar++;
                temp=temp.getSiguiente();
            }
        }
    }

    
