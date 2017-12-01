/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variostemas.unosolo;

/**
 *
 * @author PERCASTEGUI
 */
public class menu {
  public static void main(String[] args){
      
      prueba0 p0 = new prueba0("Conejo");
      prueba0 p1 = new prueba0("perro");
      prueba0 p2 = new prueba0("gato");
      p0.start();
      p1.start();
      p2.start();
      System.out.println("*********************");
      System.out.println("*********************");
      prueba2 pdos = new prueba2("Hilo 1 ");
      prueba2 pdoss = new prueba2("Hilo 2");
      pdos.prueba2("Mensaje hilo 1");
      pdoss.prueba2("Mensaje hilo 2");
      pdos.start();
      pdoss.start();
      
  
  }
    
    
    
}
