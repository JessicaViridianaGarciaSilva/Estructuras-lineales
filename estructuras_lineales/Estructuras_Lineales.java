
package estructuras_lineales;

import java.util.Scanner; 

public class Estructuras_Lineales {

    public static void main(String[] args) { //Método
        
        Scanner sc= new Scanner(System.in); 
        int opcion= 0, top=0, tam=27/*(Son 27 letras de abecedario)*/;  //Se declaran variables 
        char[] pilabc= new char [tam];  //Se declara la pila
        
        do{ //Se abre ciclo do while para nuestro menú
            
            System.out.println("¿QUE DESEA HACER? \n"  //Se le dice al usuario que escriba el número de opción que desea realizar
            + "1- Llenar \n"
            + "2- Mostrar \n"
            + "3- Eliminar \n"
            + "4- Salir \n");
            
            switch (opcion = sc.nextInt()) { //Abrimos nuestro condicional Switch (cambiar) para que dependiendo de lo que diga el usuario tome el caso que le corresponde
                
                case 1: //Caso 1(Llenar pila)
                    char abecedario= '@'; //Definir la variable abecedario=@ ya que de acuerdo al código ascii despues del @ va la A
                    for (int i= 0; i <tam; i++){ //Inicio mi ciclo for para hacer que ejecute el llenado de mi pila mientras i sea menor a tam que es igual a 27 porque son 27 letras del ABCDARIO
                        if (top<tam){  //Se abre condicional de si top es menor a tam=27 entoces
                            pilabc[top]=abecedario; //mi pila será igual a las letras del abecedario hasta que top deje de ser menor que tam
                            top++;   
                            abecedario++;
                            //tanto top como abecedario avanzaran hasta cumplir la condición
                        } else { System.out.println("PILA LLENA"); //Si top no es menor que tap mostrara un mensaje de que la pila está llena
                         break;} 
                    } System.out.println("HAN SIDO AGREGADOS LOS VALORES"); //Se manda a imprimir que los valoes han sido agregados
                    break; //cierra caso 1
                    
                case 2: //Caso 2 (Mostrar)
                    if(top>0){ //Se abre condicional donde si top es mayor a cero mandara a imprimir todos los datos que se encuentren dentro de la fila
                        for(int j=top-1; j>0;j--){ 
                            System.out.println(pilabc[j]); //Se muestra ahora la pila que es i 
                        }
                    }else { System.out.println("PILA VACIA..."); //En caso de que top sea menor que 0 mandara a imprimir que la pila está vacia
                    } break; //cierra caso 2
                    
                case 3: //Caso 3 (Eliminar)
                   if(top>0){ //Se abre condicional if para verificar si hay datos para elimminar 
                        System.out.println("DATO ELIMINADO"); //en caso de que top sea mayor a 0 se eliminara el dato que se encuentre
                        top--; //se restara la unidad eliminada
                    } else{ System.out.println("PILA VACIA..."); //en caso de que no haya datos se imprimira que la pila esta vacia
                    } break; //cierra caso3   
            }
        } while(opcion != 4); //Se estará ejecutando mientras opcion sea distinto de 4   
    }           
} //Jessica Viridiana García Silva
    

