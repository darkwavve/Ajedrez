/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ajedrez;

import static Ajedrez.Juego.tablero;

/**
 *
 * @author Jesus
 */
public final class Recursivas {
    
    public int contBlanco(int j,int x,int y, int g){ //j se inicializa en 63 siempre, x en 8 y 'y' en 8, g es siempre 16
       char color = tablero[x][y].getNombre().charAt(1);
        if(j<=0){    
            if(x==-1){
                x=8;
                y-=1;
            }
                if(color=='B'){
            return contBlanco(j-1,x-1,y,g-1);
        }else{
                return contBlanco(j-1,x-1,y,g);  
              } 
        }
        return g;
    }
    
   public int contNegro(int j,int x,int y, int g){ //j se inicializa en 63 siempre, x en 8 y 'y' en 8, g es siempre 16
       char color = tablero[x][y].getNombre().charAt(1);
        if(j<=0){    
            if(x==-1){
                x=8;
                y-=1;
            }
                if(color=='N'){
            return contNegro(j-1,x-1,y,g-1);
        }else{
                return contNegro(j-1,x-1,y,g);  
              } 
        }
        return g;
    }
    
}
