/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PERCASTEGUI
 */
public class superr  extends Thread{
    String nombre;
    int limite;
    
    public  superr(String nom){
    super(nom);
    }
    
   public void run(){
   for (int i=0; i<20; i++){
       System.out.println(i+" Avanza "+ getName());
       yield();
       try {
           sleep((long)(Math.random()* 1000));
       } catch (InterruptedException ex) {
           Logger.getLogger(superr.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
       System.out.println(getName()+" Finaliza carrera");
   }    
   public static void main(String [] args){
   superr c = new superr("Conejo");
   superr p = new superr("Perro");
   superr g = new superr("Gato");
   
   c.start();
   p.start();
   g.start();
   
   }
}
