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
    }

    @Override
    public void mover(int x, int y) {
        if(x != getX() && y == getY())
            setX(x);
        if(x == getX() && y != getY())
            setY(y);
    }
}
