/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practca0;

/**
 *
 * @author PERCASTEGUI
 */
public class practicacarrera extends Thread implements Runnable {
    String nombre;
    int cont=0;
    public practicacarrera(String nombre){
    this.nombre= nombre;
    }
    
    public void run(){   
        for(int i=0; i<5; i++){
            cont++;
        System.out.println("Avanza "+nombre+" Lugar "+cont);
        yield();
    }
        System.out.println("Finaliza "+nombre+" Finaliza "+cont); 
        yield();
    }
   public static void main(String[] args){
   practicacarrera car = new practicacarrera("Hilo 1");
   Thread t = new Thread(car);
   t.start();
   practicacarrera car2 = new practicacarrera("Hilo 2");
   Thread tt = new Thread(car2);
   tt.start();
    
   
    }
    
    }
    
    

