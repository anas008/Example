package DataPrevia;

import dataprevia.DataPrevia;
import java.util.Scanner;

/**
 *
 * @author Anas
 */
public class Indice {
    static Scanner read = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DataPrevia ob= new DataPrevia();
        
        System.out.println("Introduzca dia:");
	ob.setDia(read.nextInt());
	System.out.println("Introduzca mes: ");
	ob.setMes(read.nextInt());
        System.out.println("Introduzca any: ");
        ob.setAny(read.nextInt());
        
        ob.DataAnterior();
        
         System.out.println("Data Anterior: "+ob.getDia()+"/"+ob.getMes()+"/"+ob.getAny());
    }
    
}

