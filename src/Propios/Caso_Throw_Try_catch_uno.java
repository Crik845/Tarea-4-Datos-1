package Propios;

import java.util.Scanner;


/*
Ejemplo, vamos a crear un tipo de excepción llamado CasoThroe que se lanzará cuando el valor utilizado
en una determinada operación no sea correcto.
 */

public class Caso_Throw_Try_catch_uno extends Exception{
    public Caso_Throw_Try_catch_uno(){ }
    public Caso_Throw_Try_catch_uno(String cadena){
        super(cadena); //Llama al constructor de Exception y le pasa el contenido de cadena
    }
    public static void main(String[] args) {
        try {
            double x = leerValor();
            System.out.println("Raiz cuadrada de " + x + " = " + Math.sqrt(x));
        }catch (Caso_Throw_Try_catch_uno e) {
            System.out.println(e.getMessage());
        }
    }

    public static double leerValor() throws Caso_Throw_Try_catch_uno {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce número > 0 ");
        double n = sc.nextDouble();
        if (n <= 0) {
            throw new Caso_Throw_Try_catch_uno("El número debe ser positivo");
        }
        return n;
    }
}
