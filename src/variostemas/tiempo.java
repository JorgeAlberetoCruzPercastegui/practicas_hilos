/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variostemas;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PERCASTEGUI
 */
public class tiempo extends Thread {
    
    public tiempo(){
    
    }
    
    public void run (){
    int contador=0;
        while (true){
            System.out.println("Tiempo: "+contador++);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(tiempo.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    }
    public static void main(String[] args){
    
    tiempo t = new tiempo();
    t.start();
    }
    
    
}
