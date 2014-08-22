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
public class Peon extends Pieza {

    public Peon(int x, int y, String nombre) {
        super(x, y, nombre);
    }

    @Override
    public boolean mover(int x, int y) {
        if(x != getX()){
            if(getX() == 6 || getX() == 1)
                if(x - getX() <=2 && x - getX() >= -2)
                    return true;
            if(getX() != 6 || getX() != 1){
                if(x - getX() <= 1 && x - getX() >= -1)
                   return true;
            }
            
            }
        return false;
    }
}    
 