
package com.mycompany.endgame;


public class Heroe extends Personaje {
    protected String arma;
    
public Heroe(String nombre,String poder, String arma){
    super(nombre,poder);
    this.arma=arma;
}

   @Override   //sobre escribir
   public void atacar(){
       System.out.println(nombre+"realizar ataque con el arma"+arma+"!");
   }
}