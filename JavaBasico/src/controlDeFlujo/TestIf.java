
package controlDeFlujo;

/**
 *
 * @author Juan Carlos Garcia Bernal
 */
public class TestIf {
    public static void main(String[] args) {
        
        //Declaramos la variable "condicion" de tipo booleano que nos servirá para decidir que flujo debe seguir nuestro programa
        boolean condicion;
        
        //Asignamos el valor de la variable los dos posibles valores son true / false
        condicion = false;
        /*
            Evaluamos el valor de nuestra variable para decidir que bloque de codigo se debe ejecutar
            El primer bloque se ejecuta solo cuando la condicion tiene el valor "true"
            El segundo bloque (else) se ejecuta cuando la condición tiene el valor "false";
        */
        if(condicion){
            System.out.println("SI cumple la condición");
        }
        else{
            System.out.println("NO cumple la condición");
        }
    }
}
