package Propios;

/*
Es cierto que la aplicación ha fallado y revienta,
Pero también es cierto que la cláusula finally se ejecuta y cierra los recursos que están abiertos.
Y, era el objetivo de este ejemplo
 */
public class CasoFinally {

    public static void main(String[] args) {

        int a =5;
        int b=0;

        try {
            int resultado=a/b;

            System.out.println(resultado);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("la aplicacion fallo");
            throw new NullPointerException();
        }finally {
            System.out.println("se cierran los recursos");

        }

        System.out.println("la aplicacion finalizado");

    }

}
