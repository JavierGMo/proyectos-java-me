/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nummara;


/**
 *
 * @author m01
 */
public class Maravilloso {
    public int maravilloso;
    public int aux;
    
    Maravilloso(int maravilloso){
        this.maravilloso = maravilloso;
        aux = this.maravilloso;
    }
    
    public void NumMaa(){
        /*
        Primero checar si es para o impar
        si es par dividirlo entre dos hasta llegar a uno
        si es impar
        multiplicarlo por 3 y sumar uno 
        despues hacer ciclo y volver a checar lo de incio hasta el 3n + 1
        
        */
        
         do{
            if(aux%2 == 0){
                if(aux/2 == 1){
                    System.out.println(this.maravilloso + " es un numero maravilloso");
                    break;
                }else{
                    aux = aux/2;
                }    
            }else{
                aux = aux*3 + 1;
            }
        }while(true);
         /*
         Arreglar la condicion del ciclo
         */
    }
    
}
