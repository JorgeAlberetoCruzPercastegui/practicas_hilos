/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reloj;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class principal extends Thread {
    private int carrera;
    private String nombre;
    JTextField nomb, per, gat;
    
    public principal (JTextField canguro, JTextField perro, JTextField gato ){
    this.nomb= canguro;
    this.per= perro;
    this.gat=  gato;
    }

    
    
    public void run(){
    for (int i=0; i<=20; i++){
        try{
            Thread.sleep(1000);
        System.out.println(i+" Avanza "+nombre);
        yield();
        }catch(Exception e){
        e.printStackTrace();
        }
    }
        System.out.println("Finaliza la carrera "+ this.nombre);
    }
    /*public static void main(String[] args){
    principal p = new principal("Perro");
    principal g = new principal("Gato");
    principal Canguro = new principal("Canguro");
    p.start();
    g.start();
    Canguro.start();
    
    }*/
    
    
}
