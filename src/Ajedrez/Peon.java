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
                if(x - getX() <=2 && x - getX() >= -2){
                    setX(x);setY(y);
                    return true;
        }    
            if(getX() != 6 || getX() != 1)
                if(x - getX() <= 1 && x - getX() >= -1){
                   setX(x);setY(y);
                    return true;
        }
                    
            
            }
        return false;
    }

    @Override
    public boolean comer(int x, int y) {
        if(x != getX()){
            if(y == getY() + 1 || y == getY() - 1)
            return true;
        }        
        return false;
    }
}    