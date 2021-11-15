package Propios;

/*
Para crear y lanzar una excepción propia tenemos que definir la clase ExcepcionIntervalo
derivada de la clase base Exception.
Esto es solo una clase necesaria para algunos ejemplos
 */
public class ExcepcionIntervalo extends Exception{
    public ExcepcionIntervalo(String msg) {
        super(msg);
    }

}
