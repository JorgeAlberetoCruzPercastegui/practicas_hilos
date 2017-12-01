/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variostemas.practicaslibrojava;

/**
 *
 * @author PERCASTEGUI
 */
public class daemon extends Thread {
 
    public daemon(){
    setDaemon(true);
    start();
    }
    public void run(){
    char b = '\u0007';
    while(true){
    try{
    sleep(1000);    
    }catch(InterruptedException e){
    e.printStackTrace();
    }
        System.out.println(b);
    
    }
    
    }
    public static void main(String[] args){
    daemon d = new daemon();
    
    
    d.start();
    }
}
