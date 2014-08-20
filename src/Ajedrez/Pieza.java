package Ajedrez;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diaz
 */
public abstract class Pieza {
   protected int x;
   protected int y;
   protected String nombre;
   
    public Pieza(int x, int y, String nombre ) {
        this.x = x;
        this.y = y;
        this.nombre = nombre;
    }
        
    public int getX() {
        return x;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
   
   public abstract void mover(int x, int y);
   
   public void comer(int x, int y, String nombre){
       if (x<8 || y <8)
           setNombre(nombre);
   } 

    @Override
    public String toString() {
        return "Pieza" + "\nPosicionX = " + x + "\nPosicionY = " + y + "\nNomb"
                + "re Pieza=" + nombre;
    }

   
}
