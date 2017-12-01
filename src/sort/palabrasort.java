/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class palabrasort {
    public static void main(String[] args){
    Scanner s = new Scanner (System.in);
      
    int[] datos= new int[5];
        for (int i=0; i<datos.length; i++){
            System.out.println("Ingresa el numero "+(i+1));
            datos[i]= s.nextInt();
        }
        Arrays.sort(datos);
        for (int i=0; i<1; i++){
        for (int a: datos){
            System.out.println("Numero en orden: "+a);
        }
        }
        
        System.out.println("************************");
        String texto= "Ingrese el numero";
        String resultados="LOS RESULTADOS SON: ";
        
        int numeros[] = new int[5];
        for (int i=0; i<numeros.length; i++){
            System.out.println(texto.toUpperCase()+" "+i);
            numeros[i]= s.nextInt();
        }
        Arrays.fill(numeros, 2);
        for (int i=0; i<1; i++)      {
        for (int b: numeros){
            System.out.println(resultados.toLowerCase()+" "+b);
        }
        }
        
    }
    
}
