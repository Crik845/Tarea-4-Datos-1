package Propios;


import java.util.InputMismatchException;
import java.util.Scanner;

/*
Cada catch debe tener como parámetro un objeto de la clase Throwable, de una clase derivada de ella o
de una clase definida por el programador.

Cuando se lanza una excepción se captura por el primer bloque catch cuyo parámetro sea de la misma
clase que el objeto excepción o de una clase base directa o indirecta. Por este motivo, es importante
el orden en que se coloquen los bloques catch.

Las excepciones más genéricas se deben capturar al final
Si no es necesario tratar excepciones concretas de forma específica se puede poner un bloque catch
de una clase base que las capture todas y las trate de forma general. Esto se conoce como captura
genérica de excepciones.

Ejemplo de captura genérica de excepciones:
 */
public class Caso_Try_Catch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] array = {4,2,6,7};
        int n;
        boolean repetir = false;
        do{
            try{
                repetir = false;
                System.out.print("Introduce un número entero > 0 y < " + array.length + " ");
                n = sc.nextInt();
                System.out.println("Valor en la posición " + n + ": " + array[n]);
            }catch(InputMismatchException e){
                sc.nextLine();
                n = 0;
                System.out.println("Debe introducir un número entero ");
                repetir = true;
            }catch(IndexOutOfBoundsException e){
                System.out.println("Debe introducir un número entero > 0 y < " + array.length + " ");
                repetir = true;
            }catch(Exception e){ //resto de excepciones de tipo Exception y derivadas
                System.out.println("Error inesperado " + e.toString());
                repetir = true;
            }
        }while(repetir);
    }
}
