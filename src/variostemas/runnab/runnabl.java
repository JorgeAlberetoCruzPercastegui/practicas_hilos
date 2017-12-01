/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variostemas.runnab;

public class runnabl implements Runnable {
    String nombre;
public runnabl(String nombre){
this.nombre= nombre;

}
    @Override
    public void run() {
       for (int i=0; i<5; i++){
           System.out.println(nombre+": "+i);
       try{
       Thread.sleep(1000);
       }catch(InterruptedException ex){
           System.out.println("Error"+ex);
       }
       }
    }
    
    public static void main(String[] args){
    runnabl r = new runnabl("Hilo 1");
    r.run();
    
    for (int i=0; i<5; i++){
        System.out.println("Hilo 2: "+i);
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println("Error"+e);
        }
    }
        System.out.println("Este proceso ha terminado");
    }
}
