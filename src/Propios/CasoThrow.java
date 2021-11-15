package Propios;

import java.util.Scanner;

public class CasoThrow extends Exception{
    public CasoThrow(){ }
    public CasoThrow(String cadena){
        super(cadena); //Llama al constructor de Exception y le pasa el contenido de cadena
    }
    public static void main(String[] args) {
        try {
            double x = leerValor();
            System.out.println("Raiz cuadrada de " + x + " = " + Math.sqrt(x));
        }catch (CasoThrow e) {
            System.out.println(e.getMessage());
        }
    }

    public static double leerValor() throws CasoThrow {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce número > 0 ");
        double n = sc.nextDouble();
        if (n <= 0) {
            throw new CasoThrow("El número debe ser positivo");
        }
        return n;
    }
}
