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
public class prueba0 extends Thread {
    String nombre;
    public prueba0(String nombre)
    {
        this.nombre= nombre;
        
    }
    public void run(){
    for (int i=0; i<5; i++){
        System.out.println(nombre+"Avanza");
    }
        System.out.println(nombre+"Llega a la meta");
        yield();
    }
    
    
    
}
