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
public class paresimpares {
    
    public static void main (String [] args ){
    int par=0;
    boolean parr= true;
            int impares=0;
            int suma=0;
            for (int i =1; i<=20; i++){
            if (i%2==0){
                System.out.println("Numeros pares: "+i);
            par=par+1;
            suma = suma+i;
            }
            }
            
            System.out.println("suma de numeros pares: "+suma);
            int x=0;
            while (x<2){
    
                for (int i=0; i>x; i++)
                x++;
                    System.out.println(x);
            }
            
    }
    
    
}
