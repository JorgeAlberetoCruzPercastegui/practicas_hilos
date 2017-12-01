/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variostemas;

/**
 *
 * @author PERCASTEGUI
 */
public class setmesaje extends Thread {
    String mensaje;
    public setmesaje(String msg){
    super(msg);
    }
    
    public void setMensaje(String mensaje){
    this.mensaje= mensaje;
    }
    
    public void run(){
    for (int i=0; i<7; i++){
        System.out.println(""+mensaje);
    }
        System.out.println("Este mensaje ha terminado"+this.getName());
        yield();
    }
    
    public static void main(String[] args){
    
    setmesaje me = new setmesaje("Hilo uno");
    setmesaje mee = new setmesaje("Hilo dos");
    me.setMensaje("Mensaje Hilo 1");
    mee.setMensaje("Mensaje Hilo 2");
    me.start();
    mee.start();
    }
    
}
