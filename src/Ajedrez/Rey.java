/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ajedrez;

/**
 *
 * @author Diaz
 */
public class Rey extends Pieza {

    public Rey(int x, int y, String nombre) {
        super(x, y, nombre);
        }

    @Override
    public void mover(int x, int y) {
     if(x==getX()+1 || x==getX()-1 && y==getY()+1 || y==getY()-1){
         setX(x);
     setY(y);
     }
    }
    
}
