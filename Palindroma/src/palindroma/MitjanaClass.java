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
 * @version 2016
 */
public class MitjanaClass {
    public int n_veces;
    public int[] n;
    
    //Constructor
    
    public MitjanaClass(int n_veces) {
        this.n_veces = n_veces;
    }
    
   public MitjanaClass() {}
   
   //Getter & Setters
   
   public int getN_veces() {
        return n_veces;
    }

    public void setN_veces(int n_veces) {
        this.n_veces = n_veces;
    }
    // SetN define la longitud del array n[], y pide tantos valores como definidos por el usuario
    public void setN() {
        Scanner scan = new Scanner(System.in);
        n=new int[this.n_veces];
        for (int i=0;i<n.length;i++)
        {
            System.out.println ("Introduzca numero "+i+": ");
            n[i]=scan.nextInt();
        }
    }
   
    //Calculo de la media
    
   public int calcMitja()
    {
        int mitj=0;
        
        for (int i=0;i<n.length;i++)
        {
            mitj=+n[i];
        }
        return mitj/n.length-1;
    }
   
   //Calculo del numero minimo
   
    public int calcMinim()
    {
        int min=n[n.length-1];
        
        for (int i=0;i<n.length;i++)
        {
            
            if(n[i]<min)
            {
                min=n[i];
            }
        }
        return min;
    }
    
    //Calculo del numero maximo
    
     public int calcMaxim()
    {
        int max=0;
        for (int i=0;i<n.length;i++)
        {
            if(max<n[i])
            {
                max=n[i];
            }
        }
        return max;
    }
}