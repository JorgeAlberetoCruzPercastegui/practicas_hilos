
package variostemas.practicaslibrojava;

/**
 *
 * @author PERCASTEGUI
 */
public class practicashilos extends Thread {

    String nombre;
    public practicashilos(String nombre){
    if (nombre!=null){
    setName(nombre);
    }
    }
    public practicashilos(){
    this(null);
    }
    
    public void run(){
    
    for (int i=0; i<=20; i++){
        System.out.println(""+this.getName()+"\n"+i+""+this.getPriority());
    }
        System.out.println("Ha finalizado");
       
    }
    
public static void main (String [] args){

practicashilos ph = new practicashilos();
boolean b = ph.isDaemon();
ph.setDaemon(b);
ph.start();

}
}
