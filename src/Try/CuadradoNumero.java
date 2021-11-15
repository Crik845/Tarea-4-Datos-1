package Try;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Ejercicio

Realizar la carga de un número entero por teclado e imprimir su cuadrado.
 */
public class CuadradoNumero {
    public static void main(String[] ar) {
        Scanner teclado = new Scanner(System.in);
        int num;
        try {
            System.out.print("Ingrese un valor entero:");
            num = teclado.nextInt();
            int cuadrado = num * num;
            System.out.print("El cuadrado de " + num + " es " + cuadrado);
        } catch (InputMismatchException ex) {
            System.out.println("Debe ingresar obligatoriamente un número entero.");
        }
    }
}

/*
Para atrapar las excepciones debemos encerrar en un bloque try las instrucciones que generan
excepciones, en nuestro caso el método 'nextInt' de la clase Scanner:
        try {
            System.out.print("Ingrese un valor entero:");
            num = teclado.nextInt();
            int cuadrado = num * num;
            System.out.print("El cuadrado de " + num + " es " + cuadrado);
        }
Todo bloque try requiere que sea seguido por un bloque catch:
        catch (InputMismatchException ex) {
            System.out.println("Debe ingresar obligatoriamente un número entero.");
        }
Luego de la palabra clave catch se indica entre paréntesis el nombre de un parámetro cualquiera
(en nuestro caso lo llamamos 'ex') y el nombre de la excepción a capturar.
El bloque catch normalmente no se ejecuta salvo en los casos excepcionales que dentro del bloque
try informa que se disparó dicha excepción.
Ahora, si ejecutamos el programa y el operador ingresa un String en lugar de un entero nuestro
programa no se detiene sino se le informa el tipo de error que cometió el usuario:

 */