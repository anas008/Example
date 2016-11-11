/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ahorcado;

import java.util.Random;

/**
 *
 * @author Anas
 * @version 2016
 */
public class Ahorcado {
    private String[] paraules;
    private String resposta; 
    private String llegit;
    private boolean valid;
    private int count, encerts, pos;
    private char c;
    private String paraula;
    char lletres[];
    
    //Constructors
    public Ahorcado() {
        this.valid = false;
        //Se inicializan las variables a 0 para contar los aciertos y fallos
        this.count = 0;
        this.encerts = 0;
        
        this.llegit = "";
        //Array de Strings que contiene las palabras a acertar
        this.paraules = new String[]{"ATOM", "MOLECULA", "BIO", "PERL"};
        //Se hace un random para escoger una palabra aleatoria del array de palabras
        Random rnd = new Random();
        //Se escoge una palabra del array paraules una posicion que contiene una palabra
        this.paraula=paraules[(int)(rnd.nextDouble()*paraules.length)];
        this.lletres = new char[paraula.length()];
        //Creo l'array de caràcters que mostraran les encertades
        for(int i=0;i<this.paraula.length();i++){
                this.lletres[i] ='_';
            }
    }

    public Ahorcado(String[] paraules, String resposta, String llegit, boolean valid, int count, int encerts, int pos, char c, String paraula, char[] lletres) {
        this.paraules = paraules;
        this.resposta = resposta;
        this.llegit = llegit;
        this.valid = valid;
        this.count = count;
        this.encerts = encerts;
        this.pos = pos;
        this.c = c;
        this.paraula = paraula;
        this.lletres = lletres;
        this.valid = false;
        this.count = 0;
        this.encerts = 0;
        this.llegit = "";
        this.valid = false;
        //Se inicializan las variables a 0 para contar los aciertos y fallos
        this.count = 0;
        this.encerts = 0;
        
        this.llegit = "";
        //Array de Strings que contiene las palabras a acertar
        this.paraules = new String[]{"ATOM", "MOLECULA", "BIO", "PERL"};
        //Se hace un random para escoger una palabra aleatoria del array de palabras
        Random rnd = new Random();
        //Se escoge una palabra del array paraules una posicion que contiene una palabra
        this.paraula=paraules[(int)(rnd.nextDouble()*paraules.length)];
        this.lletres = new char[paraula.length()];
        //Creo l'array de caràcters que mostraran les encertades
        for(int i=0;i<this.paraula.length();i++){
                this.lletres[i] ='_';
            }
    }

    public String[] getParaules() {
        return paraules;
    }

    public void setParaules(String[] paraules) {
        this.paraules = paraules;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public String getLlegit() {
        return llegit;
    }

    public void setLlegit(String llegit) {
        this.llegit = llegit;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getEncerts() {
        return encerts;
    }

    public void setEncerts(int encerts) {
        this.encerts = encerts;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }

    public String getParaula() {
        return paraula;
    }

    public void setParaula(String paraula) {
        this.paraula = paraula;
    }

    public char[] getLletres() {
        return lletres;
    }
    /**
    * Funcion que busca en la palabra a adivinar si el caracter introducido por el usuario
    * esta en la cadena o no
    * @author Anas
    * @version 2016
    * @return boolean
    */
    public boolean BuscarLetra()
    {
        //Se recoge la primera posicion del String valido que se ha leido anteriormente
        this.c=llegit.toUpperCase().charAt(0);
        //Busca la posicion del la letra que el usuario ha introducido en la palabra a acertar
        pos = paraula.indexOf(c);
        
        if (this.pos == -1) {
             this.count++;
             return false;   
               } else {
                    /*Si se encuentra la posicion se cambia la posicion por la letra que coincida
                    y se los aciertos suman 1*/
                    for(int i=0;i<this.lletres.length;i++){
                        if(this.paraula.charAt(i) == c){
                           this.lletres[i]=c; 
                               this.encerts +=1;
                           }
                       }
                    return true;
    }
}
}
