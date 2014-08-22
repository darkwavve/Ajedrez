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
public class Reina extends Pieza{

    public Reina(int x, int y, String nombre) {
        super(x, y, nombre);
        if(y == 1)
          setNombre(nombre+"B");  
        if(y == 8)
          setNombre(nombre+"N");  
    }

    @Override
    public boolean mover(int x, int y) {
        if((getX()%2== 0 && getY()%2== 1) || (getX()%2== 1 && getY()%2== 0)){
            if((x % 2 == 0 && y % 2 == 1) || (x % 2 == 1 && y % 2 == 0)){
                return true;
            }
        }
        if((getX()%2== 1 && getY()%2== 1) || (getX()%2== 0 && getY()%2== 0)){
            if( (x % 2 == 0 && y % 2 == 0) || (x % 2 == 1 && y % 2 == 1)){
                return true;
            }
        }
        if(x != getX() && y == getY())
            return true;
        if(x == getX() && y != getY())
            return true;
        return false;
    }
}