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
public class Torre extends Pieza {

    public Torre(int x, int y, String nombre) {
        super(x, y, nombre);
        if(y == 1)
          setNombre(nombre+"B");  
        if(y == 8)
          setNombre(nombre+"N");  
    }

    @Override
    public void mover(int x, int y) {
        if(getX() != x && getY()== y)
            setX(x);
        if(getX() == x && getY()!= y)
            setY(y);
    }
}
