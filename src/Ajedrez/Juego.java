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

  static boolean turno1 = true;
    static String jug1;
    static String jug2;
    static boolean salir = false;
    static char conf;
    static int contN,contB,x1,y1,x2,y2;
    static boolean valido;
    
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
            do{
            imprimirTablero();
              if(turno1==true){
                  System.out.println("Turno de: "+jug1);
              }else{
                  System.out.println("Turno de: "+jug2);
              }
                    valido = false;

        do { 
            System.out.println("Ingrese la posicion de la pieza que desea mover");
          
            x1 = tec.nextInt();
            y1 = tec.nextInt();
            if(x1 == -1 && y1 == -1){
           forfeit();
           break;
        }
            System.out.println("Ingrese la posicion donde desea moverla");
            x2 = tec.nextInt();
            y2 = tec.nextInt();  
            
            if(x1>=8 || x2>=8 || y1>=8 || y2>=8 || x1<=-1 || x2<=-1 || y1<=-1 || y2<=-1){
                System.out.println("Movimiento invalido (Coordenadas invalidas)");
                valido = false;
            }else{
              char color1 = tablero[x1][y1].getNombre().charAt(1);
              char color2 = tablero[x2][y2].getNombre().charAt(1);  
              if(color1 == color2){
           System.out.println("Movimiento Invalido (Piezas del Mismo Color)");
           valido = false;
              }else if(color1=='N' && turno1==true){
                  valido = false;
              }else if(color1=='B' && turno1==false){ 
                  valido = false;
              }else{
                  valido = true;
       }
            }
        } while (valido == false);
        if(tablero[x1][y1] instanceof Peon){
           if(tablero[x1][y1].comer(x2, y2) == true){
           tablero[x2][y2] = tablero[x1][y1];
           tablero[x1][y1] = new espacio(x1,y1);
           }
        }
        
        if(tablero[x1][y1].mover(x2, y2) == true){
           tablero[x2][y2] = tablero[x1][y1];
           tablero[x1][y1] = new espacio(x1,y1);
           if(turno1 == true){
               turno1=false;
           }else{
               turno1=true;
            }
        }
        
    }while(salir == false);
            
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
           System.out.print(x+"|");
           for(int y =0; y <8;y++){
           System.out.print(tablero[x][y]+"|");  
           }
           System.out.println("");
        }
       System.out.print("  ");
       for(int x = 0 ; x< 8; x++){
           System.out.print(" "+x+" ");
       }
       System.out.println("");
    }
   
   private static void validarMovimiento(int x1,int y1,int x2,int y2){
       char color1 = tablero[x1][y1].getNombre().charAt(1);
       char color2 = tablero[x2][y2].getNombre().charAt(1);
       
       
       if(x1 == -1 && y1 == -1){
           forfeit();
       }   
       if(color1 == color2){
           System.out.println("Movimiento Invalido (Piezas del Mismo Color)");
           System.out.println(tablero[x1][y1].getNombre()+" "+tablero[x2][y2].getNombre());
           
       }
 
       if(tablero[x1][y1].mover(x2, y2) == true){
           tablero[x2][y2] = tablero[x1][y1];
           tablero[x1][y1] = new espacio(x1,y1);
         }
       }

    
   private static void forfeit(){
       System.out.println("Esta seguro que desea salir del juego? (y = si)"); 
       char opc = tec.next().charAt(0);
       if(opc=='y')
       salir = true;   
    } 
           
   private static void estadistica(String jug1, String jug2,String cont){
        
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
                    if(y == 4)
                        tablero[x][y] = new Reina(x,y,"DB");
                    if(y == 3)
                        tablero[x][y] = new Rey(x,y,"RB");
                }
                if(x == 6){
                    tablero[x][y] = new Peon(x,y,"PB");
                }
            }
        }
   }
}
