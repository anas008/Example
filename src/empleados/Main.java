package empleados;

import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author anas
 */
public class Main {

    static Empleado[] array = new Empleado[3];
    static Scanner read = new Scanner (System.in);
	
	public static void main (String[] args) throws IOException
	{
		insertarDatosArray();
		mostrarDatosArray();
	}
	
	public static void insertarDatosArray(){
		String aux;
		for (int i=0 ; i<array.length ; i++)
		{
			System.out.print("Nom ["+ i +"]:");
			array[i] = new Empleado();
			aux=read.next();
			array[i].setNom(aux);
			System.out.print("Sou ["+ i +"]:");
			array[i].setSou(read.nextInt());
                        array[i].setSouFinal();
		}
	}
	
	public static void mostrarDatosArray(){
		for (int i=0 ; i<array.length; i++)
		{
			System.out.print("\nArray["+ i + "] ==> ");
			System.out.print("Nombre: "+array[i].getNom());
			System.out.println(" Sou Final: "+array[i].getSouFinal());
		}
	}
}
