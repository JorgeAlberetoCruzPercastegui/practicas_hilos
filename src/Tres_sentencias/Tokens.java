
package Tres_sentencias;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tokens {
    
    public static void main(String [] args){
        /*int [][]mat= new int [5][3];*/
        
    StringTokenizer tk;
    tk = new StringTokenizer("Jorge Alberto Cruz Percastegui");
    while (tk.hasMoreTokens()){
        System.out.println(tk.nextToken(" "));
    }
    int i;
        System.out.println("**********************************");
        InputStreamReader st = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(st);
        System.out.println("Declara el valor uno");
        try {
            i = br.read();
        } catch (IOException ex) {
            Logger.getLogger(Tokens.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    
        System.out.println("**********************************");
        System.out.println("Matrices");
        Scanner s = new Scanner(System.in);
        int ff,cc;
        int cont=0;
        int cont2=0;
        int filas[]= new int[3];
        int columnas[] =new int [3];
        
        for (int f=0; f<filas.length; f++){
        System.out.println("Ingresa la matriz fila "+(cont+=1));
        filas[f]= s.nextInt();
        }
        for (int c=0; c<columnas.length; c++){
            System.out.println("Ingresa la matriz columna "+(cont2+=1));
        columnas[c]= s.nextInt();
        }
        for (int f=0; f<filas.length; f++){
            System.out.println("filas-> "+filas[f]);
        }
        for (int c=0; c<columnas.length; c++){
            System.out.println("Columnas->"+columnas[c]);
        }
    }
    
    
}
