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
public class prueba2 extends Thread{
    String mensaje;
    
    public prueba2(String msg){
    super(msg);
    }
    
public void prueba2(String msg){
this.mensaje= msg;
}


public void run(){

for (int i=0; i<5; i++){
    System.out.println(""+mensaje);
}
    System.out.println("Ha finalizado: "+this.getName());
    yield();

}
    
}
