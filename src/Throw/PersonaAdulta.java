package Throw;
/*
Ejercicio:
Declarar una clase llamada 'PersonaAdulta' con los atributos nombre y edad. Lanzar una excepción de tipo
IOException en caso que llegue en el constructor una edad menor a 18 años.
En este problema he tomado la decisión de validar y lanzar una excepción en caso que se intente la creación
de un objeto de la clase PersonaAdulta con una edad inferior a 18.
 */
public class PersonaAdulta {
    private String nombre;
    private int edad;

    public PersonaAdulta(String nombre, int edad) throws Exception {
        this.nombre = nombre;
        if (edad < 18)
            throw new Exception("No es adulta la persona " + nombre + " porque tiene " + edad + " años.");
        this.edad = edad;
    }

    public void fijarEdad(int edad) throws Exception {
        if (edad < 18)
            throw new Exception("No es adulta la persona " + nombre + " porque tiene " + edad + " años.");
        this.edad = edad;
    }

    public void imprimir() {
        System.out.println(nombre + " - " + edad);
    }

    public static void main(String[] ar) {
        try {
            PersonaAdulta persona1 = new PersonaAdulta("Ana", 50);
            persona1.imprimir();
            PersonaAdulta persona2 = new PersonaAdulta("Juan", 13);
            persona2.imprimir();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}

/*
Para lanzar una excepción debemos utilizar la palabra clave 'throw' y seguidamente la referencia de un
objeto de la clase 'Exception' o de una subclase de 'Exception':

        if (edad < 18)
            throw new Exception("No es adulta la persona " + nombre +
                                " porque tiene " + edad + " años.");
En el método que utilizamos el comando 'throw' debemos enumerar en su declaración luego de la palabra
clave 'throws' los nombres de excepciones que puede lanzar dicho método (pueden ser más de uno):

    public PersonaAdulta(String nombre, int edad) throws Exception {
De forma similar el método 'fijarEdad' verifica si la edad que llega es menor a 18 para lanzar la excepción:

    public void fijarEdad(int edad) throws Exception {
        if (edad < 18)
            throw new Exception("No es adulta la persona " +
                                nombre + " porque tiene " + edad + " años.");
        this.edad = edad;
    }
Ahora cuando creamos objetos de la clase 'PersonaAdulta' debemos capturar obligatoriamente la excepción mediante
un bloque try/catch:

    public static void main(String[] ar) {
        try {
            PersonaAdulta persona1 = new PersonaAdulta("Ana", 50);
            persona1.imprimir();
            PersonaAdulta persona2 = new PersonaAdulta("Juan", 13);
            persona2.imprimir();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
Cuando creamos el objeto 'persona2' se captura la excepción debido que "Juan" tiene 13 años:

Cuando se ejecuta el comando throw no se continúan ejecutando las instrucciones del método, sino que se
aborta su ejecución y vuelve al método que lo llamó.
 */