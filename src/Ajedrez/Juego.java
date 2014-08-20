/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ajedrez;

import java.util.*;

/**
 *
 * @author Diaz
 */
public class Juego {
    static Scanner tec = new Scanner(System.in);
    static Pieza[][] tablero;
    
   public static void main(String[] args) {
    char exit = 'N';
    
       do{
       System.out.println("----------Menu----------\n1.JUGAR AJEDREZ\n2.ESTADI"
                + "STICAS\n3.SALIR");
        int opcion = tec.nextInt();
        
        
        switch (opcion){
            case 1: imprimirTablero();
            
            case 2:
            
            case 3: System.out.println("Esta segura que desea Salir del Juego");
                    exit = tec.next().charAt(0);
                    break;

            default:    System.out.println("ESTE COMANDO NO EXISTE");
                
            }
        }while(exit == 'Y' || exit =='y');
    }
   private static void imprimirTablero(){
       System.out.println("8"+tablero[0][0]);
       System.out.println("7");
       System.out.println("6");
       System.out.println("5");
       System.out.println("4");
       System.out.println("3");
       System.out.println("2");
       System.out.println("1");
       System.out.println(" ");
   }   private static void validarMovimiento(){
       
   }
   private static void estadistica(){
       
   }
   private static void reiniciar(){
    Pieza tablero[][] = new Pieza [8][8];   
   }
}
