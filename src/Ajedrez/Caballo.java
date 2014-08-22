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
public class Caballo extends Pieza {

    public Caballo(int x, int y, String nombre) {
        super(x, y, nombre);
    }

    @Override
    public boolean mover(int x, int y) {
            if(x ==(getX()+2) && y == (getY()+1)){
                setX(x);setY(y);
                return true;
            }
            if(x ==(getX()+1) && y == (getY()+2)){
                setX(x);setY(y);
                return true;
                }
            if(x ==(getX()-2) && y == (getY()-1)){
                setX(x);setY(y);
                return true;
            }
            if(x ==(getX()-1) && y == (getY()-2)) 
                setX(x);setY(y);
                return true;
            if(x ==(getX()+2) &&y == (getY()-1)){
                setX(x);setY(y);
                return true;
            }
            if(x ==(getX()+1) && y == (getY()-2)){
                setX(x);setY(y);
                return true;
            }
            if(x ==(getX()-2) && y == (getY()+1)){
                setX(x);setY(y);
                return true;
            }
            if(x ==(getX()-1) && y == (getY()+2)){ 
                setX(x);setY(y);
                return true;
            }
            System.out.println(getX()+" "+getY());
            return false;
        }
    }
    

