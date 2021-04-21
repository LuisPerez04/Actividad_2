/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_2;

import java.util.Scanner;

/**
 *
 * @author Atomi
 */
public class Actividad_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println( " Ejercicio número 1" );
    //Crear un horario de usted de cualquier día de la semana, ej: 6 Despertar,7 Clase LP1, 8 Clase LP1, 9 Clase Estructuras, 10…, 21 Dormir,
    //leer un valor de 1 al 24 validar e imprimir la acción que realiza en su horario.
        
        Scanner miConsola=  new Scanner ( System . in );
        System.out.println( " Escribir un valor entero del 1 al 24 para obtener la accion de mi horario: " );
        int valor_entero = miConsola. nextInt ();
        
        switch (valor_entero) {
            case  7 :
                System.out.println( " Despertar, arreglarme y desayunar " );
                break;
            case 8,9 :
                System.out.println( " Tomar clases de Calculo Integral " );
                break;
            case 10,11,12 :
                System.out.println( " Tomar clases de Algebra Lineal " );
                break;
            case  13,14,15: 
                System.out.println( " Hacer tareas pendientes " );
                break;
            case  16 :
                System.out.println( " Almorzar con mi familia " );
                break ;
            case  17 :
                System.out.println( " Reposar la comida platicando con la familia " );
                break;
            case  18 :
                System.out.println( " Hacer ejercicio " );
                break;
            case 19 :
                System.out.println( " Bañarme " );
                break;
            case 20,21:
                System.out.println( " Jugar videojuegos, leer o estudiar " );
                break;
            case  22 : 
                System.out.println( " Cenar " );
                break ;
            case  23,24,1,2,3,4,5,6 :
                System.out.println( " Dormir " );
                break;
            default:
                System.out.println( " Valor inexistente " );      
        }
          System.out.println( "\n" );
        
          System.out.println( " Ejercicio numero 2" );
        // Crear un método que determine si es el día es habil (lunes a viernes), y emitir un mensaje o en su caso emitir un mensaje que es fin de semana.
          System.out.println( " Escribir un día de la semana con los siguientes valores: \n Lunes = 1 \n Martes = 2 \n Miércoles = 3 \n Jueves = 4 \n Viernes =  5 \n Sábado = 6 \n Domingo = 7 " );
        int diadelasemana = miConsola. nextInt ();
        switch (diadelasemana) {
            case  1 :
                  System.out.println( " El Lunes es un dia habil" );
                break ;
            case  2 :
                  System.out.println( " El Martes es un día hábil " );
                break;
            case  3 :
                  System.out.println( " El  Miércoles es un día hábil " );
                break;
            case  4 :
                  System.out.println( " El Jueves es un día hábil " );
                break;
            case  5 :
                  System.out.println( " El Viernes es un día hábil " );
                break;
            case  6 :
                  System.out.println( " El Sábado es fin de semana " );
                break;
            case  7 :
                  System.out.println( " El Domingo es fin de semana " );
                break;
            default:
                  System.out.println( " El valor no es inexistente " );
        }
          System.out.println( "\n" );
        
          System.out.println( " Ejercicio numero 3 " );
        //Crear un metodo que lea un valor entero del 1 al 12 valide el valor y nos diga en que trimestre del año nos encontramos
        //(Primer trimestre, Segundo Trimestre, Tercer Trimeste, Cuarto Trimestre)
        
          System.out.println( " Escribir un valor entero del 1 al 12: " );
       valor_entero= miConsola.nextInt();
       
        if (valor_entero >= 1 && valor_entero <= 3 ) {
              System.out.println ( " Estamos en el primer trimestre del año " );
        } else  if (valor_entero >=  4  && valor_entero <=  6 ) {
              System.out.println( " Estamos en el segundo trimestre del año " );
        } else  if (valor_entero >=  7  && valor_entero <=  9 ) {
              System.out.println( " Estamos en el tercer trimestre del año " );
        } else  if (valor_entero >=  10  && valor_entero <=  12 ) {
              System.out.println( " Nos encontramos en el cuarto trimestre " );
        } else{
              System.out.println( " El valor es inexistente " );
        }
        
        }
    }
        
    
    

