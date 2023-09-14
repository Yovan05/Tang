
package mx.itson.tang.ui;

import java.util.Scanner;

/**
 * Inicia el programa y determina la cantidad de numeros provenienntes de distintos lugares.
 * @author alexis
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el texto a evaluar");
        
        String oracion = leer.nextLine();
        
        String nuevaOracion= oracion.replace(" ", "").replace("-", "").replace("(", "").replace(")", "");
        
        
        String [] numero = nuevaOracion.split(",");
        
        int tijuana = 0;
        int hermosillo = 0;
        int guaymas = 0;
        int desconocido = 0;
        
        for(String n : numero){
            if(n.startsWith("664")){
             tijuana++;
           
            }else if(n.startsWith("662")){
            hermosillo++;
            
            }else if(n.startsWith("622")){
            guaymas++;
            
            }else{
            desconocido++;
            
            }
            
        }
        System.out.println("Hay "+ tijuana+" numeros de Tijuana");
        System.out.println("Hay "+ hermosillo+ " numeros de Hermosillo");
        System.out.println("Hay "+ guaymas+ " numeros de Guaymas");
        System.out.println("Hay "+ desconocido+ " numeros desconocidos");
        
        
    }
    
}
