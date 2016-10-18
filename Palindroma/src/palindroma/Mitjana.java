/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindroma;

import java.util.Scanner;

/**
 * 
 * @author Anas
 */
public class Mitjana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        MitjanaClass n = new MitjanaClass();
        System.out.println ("Introduzca numero de veces: ");
        n.setN_veces(scan.nextInt());
        
        n.setN();
        int op=0;
        
        System.out.println ("1- Mitja");
        System.out.println ("2- Minim");
        System.out.println ("3- Maxim");
        op=scan.nextInt();
        
        switch(op)
        {
            case 1:
                System.out.println ("Mitjana: "+n.calcMitja());
            case 2:
        System.out.println ("Minim: "+n.calcMinim());
            case 3:
        System.out.println ("Maxim: "+n.calcMaxim());
        }
        
    }
}
