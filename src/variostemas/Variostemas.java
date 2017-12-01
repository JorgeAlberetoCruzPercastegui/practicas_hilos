/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variostemas;

import javax.swing.JOptionPane;

/**
 *
 * @author PERCASTEGUI
 */
public class Variostemas extends Thread {
    String nombre;
    int limite;
    
 public Variostemas (String nombre){
 this.nombre= nombre;
 }
 
 public void run (){
 for (int i= 0;i<10; i++){
     System.out.println(nombre+ " Avanza");
 }
     System.out.println(nombre+"  Ha llegado a la meta");
     yield();//alterna y es paso a paso
     
 }
 
 
 
 
 
    
    
    /*private int id;
String mensaje;
    public Variostemas (int id){
    this.id= id;
    }
    public Variostemas(String p){
    super(p);
    }*/
   /*public void run()
    {   
        for (int i=0; i<5; i++){
        System.out.println(mensaje);
        }
        System.out.println("Este hilo ha terminado"+this.getName());
    }*/
    
    /*public void setMensaje(String p){
    this.mensaje= p;
    }*/
    
    public static void main(String[] args)  {
        /*String opicion = JOptionPane.showInputDialog("Ingrese una opcion"+"\n"+"1.-Hilos simple");
        int numero = Integer.parseInt(opicion);
        switch (numero){
            case 1:
                Variostemas h1 = new Variostemas("hilo uno");
                Variostemas h2 = new Variostemas("Hilo 2");
                h1.setMensaje("Este es el mensaje del hilo uno");
                h2.setMensaje("Este es el mensaje del hilo dos");
                h1.start();
                h2.start();
        break;
        case 2:
        break;
        }*/
        Variostemas conejo = new Variostemas("Conejo");
        Variostemas perro = new Variostemas("perro");
        Variostemas gato = new Variostemas("gato");
        
        conejo.start();
        perro.start();
        gato.start();
        
    }
    
}
