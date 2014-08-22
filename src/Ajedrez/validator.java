/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ajedrez;

import static Ajedrez.Juego.tablero;
import static Ajedrez.Juego.tec;
import static Ajedrez.Juego.x1;

/**
 *
 * @author Jesus
 */
public class validator {
    
    /**
     *
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     */
    public void validator(int x1,int y1,int x2,int y2){
        
        boolean valido = false;

        do { 
            x1 = tec.nextInt();
            y1 = tec.nextInt();
            if(x1 == -1 && y1 == -1){
           forfeit();
       }
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
              }else{
                  valido = true;
       }
            }
        } while (valido == false);
    
        if(tablero[x1][y1].mover(x2, y2) == true){
           System.out.println(tablero[x2][y2].getNombre()+" "+tablero[x1][y1].getNombre());
           tablero[x2][y2] = tablero[x1][y1];
           tablero[x1][y1] = new espacio(x1,y1);
         }
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
           System.out.println(tablero[x2][y2].getNombre()+" "+tablero[x1][y1].getNombre());
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
}
