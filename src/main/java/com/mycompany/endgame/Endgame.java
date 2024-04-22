

package com.mycompany.endgame;

/**
 *
 * @author bdesi
 */
public class Endgame {

    public static void main(String[] args) {
        Heroe blackPanter=new Heroe ("Black Pnater grrr","Ser rey de todo Wakanda","Garra ");
        Villano galactus=new Villano("Galactus","Devora mundos","usa de chalan a Silver Surfer");
        Avenger ironMan=new Avenger("Tony Stark","Genio,filantropo,multimillonario,playboy","Mark 42","Prime");
        Thanos thanos=new Thanos("Thanos","El titan loco","Ejercito chitaury","Gemas del infinito");
       
        Personaje[]personajes={blackPanter,galactus,ironMan,thanos};
        for(Personaje personaje:personajes){
            personaje.atacar();
        }
    ((Avenger)ironMan).reunirse();
    
    thanos.chasquearDedos();
    }
}
