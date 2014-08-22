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
    static Pieza[][] tablero = new Pieza [8][8];
    static String espacio = "-----------------------------";
    static String jug1;
    static String jug2;
    
   public static void main(String[] args) {
    char exit = 'N';
    
       do{
       System.out.print(espacio+"Menu"+espacio+"\n1.JUGAR AJEDREZ\n2.ESTADI"
                + "STICAS\n3.SALIR\n\nOpcion: ");
        int opcion = tec.nextInt();
        
        
        switch (opcion){
            case 1: System.out.println(espacio);
            System.out.println("Ingrese el nombre del jugador 1");
            jug1 = tec.next();
            System.out.println("Ingrese el nombre del jugador 2");
            jug2 = tec.next();
            System.out.println("\n\n");
            reiniciar();
            
            imprimirTablero();
            
            break;
                
            case 2:System.out.println(espacio);
                break;
            
            case 3: System.out.println(espacio);
                System.out.println("Esta seguro que desea salir del juego");
                    exit = tec.next().charAt(0);
                    break;

            default:    System.out.println("ESTE COMANDO NO EXISTE");
                
            }
        }while(exit == 'N' || exit == 'n');
    }
   private static void imprimirTablero(){
       for(int x = 0; x < 8;x++){
           System.out.print(x+1+"|");
           for(int y =0; y <8;y++){
           System.out.print(tablero[x][y]+"|");  
           }
           System.out.println("");
        }
       System.out.print(" ");
       for(int x = 1 ; x< 9; x++){
           System.out.print(" "+0+x);
       }
       System.out.println("");
    }
   
   private static void estadistica(){
       
   }
   private static void reiniciar(){  
        for(int x = 0 ; x<8;x++){
            for(int y = 0; y < 8;y++){
                if(x == 0){
                    if(y == 0 || y == 7)
                        tablero[x][y] = new Torre(x,y,"TN");
                    if(y == 1 || y == 6)
                        tablero[x][y] = new Caballo(x,y,"CN");
                    if(y == 2 || y == 5)
                        tablero[x][y] = new Alfil(x,y,"AN");
                    if(y == 3)
                        tablero[x][y] = new Reina(x,y,"DN");
                    if(y == 4)
                        tablero[x][y] = new Rey(x,y,"RN");
                }
                if(x == 1){
                    tablero[x][y] = new Peon(x,y,"PN");
                }
                if(x >= 2 && x <= 5){
                    tablero[x][y] = new espacio(x,y);
                }
                if(x == 7){
                    if(y == 0 || y == 7)
                        tablero[x][y] = new Torre(x,y,"TB");
                    if(y == 1 || y == 6)
                        tablero[x][y] = new Caballo(x,y,"CB");
                    if(y == 2 || y == 5)
                        tablero[x][y] = new Alfil(x,y,"AB");
                    if(y == 3)
                        tablero[x][y] = new Reina(x,y,"DB");
                    if(y == 4)
                        tablero[x][y] = new Rey(x,y,"RB");
                }
                if(x == 6){
                    tablero[x][y] = new Peon(x,y,"PB");
                }
            }
        }
   }
}
