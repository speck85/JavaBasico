/*
 * Clase que sirve como ejemplo de como se manejan los arreglos en Java
 */
package arreglos;

/**
 *
 * @author Juan Carlos García Bernal
 */
public class TestArreglos {
    public static void main(String[] args) {
        
        //Declaración de un arreglo de enteros con el nombre miArreglo
        int [] miArreglo;
        
        //Inicialización de la variable con la palabra reservada new 
        //indicamos que el tamaño del arreglo es de 10 elementos
        
        miArreglo = new int[5];
        
        //Inicialización de los elementos del arreglo 
        miArreglo[0] = 10;
        miArreglo[1] = 20;
        miArreglo[2] = 30;
        miArreglo[3] = 40;
        miArreglo[4] = 50;
                
        //Accediendo a los valores del arreglo
        
        System.out.println("Valor del indice 0: "+ miArreglo[0]);
        System.out.println("Valor del indice 1: "+ miArreglo[1]);
        System.out.println("Valor del indice 2: "+ miArreglo[2]);
        System.out.println("Valor del indice 3: "+ miArreglo[3]);
        System.out.println("Valor del indice 4: "+ miArreglo[4]);
                
        
        
    }
}
