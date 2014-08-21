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
    public void mover(int x, int y) {
        if (getY() == 2)
            if(y<=2 && y>0)
                setY(getY()+y);
            
        if (getY() == 7)
            if(y<=2 && y>0)
                setY(getY()-y);
       
        if(getY() != 2 && getY() != 7)
            if(y == 1)
                setY(getY()+y);
    }
}    
 