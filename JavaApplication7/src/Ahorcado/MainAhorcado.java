
package Ahorcado;

import java.util.Scanner;

/**
 *
 * @author Anas
 * @version 2016
 */
public class MainAhorcado {

    
    public static void main(String[] args) {
         
    Scanner lector = new Scanner (System.in);
    Ahorcado juego = new Ahorcado();
    //variable donde se guarda la opcion de si el usuario quiere seguir o no
    String resposta;
    
    do{
            System.out.println("La paraula que has d'encertar té "+juego.getParaula().length()+" lletres");
            
            do{
                juego.setValid(false);
                
                /*Se le pide al usuario una letra, se valida la lectura
                y se comprueba si se encuentra en alguna posicion de la palabra*/
              do{
                System.out.println ("Si us plau, Escriu una lletra valida");
                juego.setLlegit(lector.nextLine().toUpperCase());
                if(juego.getLlegit().matches("[ABCDEFGHIJKLMNÑOPQRSTUVWXYZ]")) juego.setValid(true);
              }while(juego.isValid() == false || juego.getLlegit().isEmpty() || juego.getLlegit()==null);


              
              
              
              //En caso de que la posicion no se encuentre la variable de fallos suma 1
              if (!juego.BuscarLetra()) {
                   System.out.println("Aquesta lletra no es troba dins de la paraula. Ara et queden "+ (10-juego.getCount())+ " intents");
                   //En caso de que los fallos llegan a los 10(en ese caso se saldria del "while")
                   if(juego.getCount() == 10) System.out.println("Has esgotat tots els intents");
               } else {
                        
                        /*Si se encuentra la posicion se cambia la posicion por la letra que coincida
                        y se los aciertos suman 1*/
                       char[] Lletres = juego.getLletres();
                       for(int i=0;i<juego.getLletres().length;i++){
                           System.out.print(Lletres[i]+" ");
                           
                       }
                  System.out.println("Molt bé!!! Torna a intentar-ho");
                  
                  if(juego.getEncerts()== juego.getParaula().length()){
                      System.out.println("Has acabat encertant la paraula. Felicitats!!!!");
                      juego.setCount(10);
                  }
               }

              }while(juego.getCount() !=10);
        
        System.out.println("Vols continuar?(S/N)");
        resposta=lector.nextLine().toUpperCase();
       }while(resposta.equals("S"));
    
   } 
}