package Finally;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
Crear un archivo de texto con dos líneas. Luego proceder a leer el contenido del archivo de
texto y mostrarlo por pantalla. Asegurarse de liberar el archivo luego de trabajar con el mismo
 */
public class CreacionLecturaArchivoTXT {
    public static void main(String[] ar) {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(new File("datos.txt"));
            bw = new BufferedWriter(fw);
            bw.write("Línea 1");
            bw.newLine();
            bw.write("Línea 2");
        } catch (IOException ex) {
            System.out.println("Problemas en la creación del archivo");
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (bw != null)
                    bw.close();
                if (fw != null)
                    fw.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(new File("datos.txt"));
            br = new BufferedReader(fr);
            String linea = br.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }
        } catch (IOException ex) {
            System.out.println("Problemas con la lectura del archivo");
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (br != null)
                    br.close();
                if (fr != null)
                    fr.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}

/*
Hemos sacado del try la definición de las dos variables para la creación de archivos de texto:

        FileWriter fw = null;
        BufferedWriter bw = null;
En el bloque try si hay un problema cuando se crea el archivo 'datos.txt' o cuando se graban datos
mediante el método write se dispara la excepción IOException:

            fw = new FileWriter(new File("datos.txt"));
            bw = new BufferedWriter(fw);
            bw.write("Línea 1");
            bw.newLine();
            bw.write("Línea 2");
        } catch (IOException ex) {
            System.out.println("Problemas en la creación del archivo");
            System.out.println(ex.getMessage());

Luego que se haya disparado la excepción o no, pasa a ejecutarse el bloque 'finally', donde
debemos llamar al método close tanto del objeto bw como fw, como los objetos pueden no haberse
creado, disponemos un if para cada uno:


        } finally {
            try {
                if (bw != null)
                    bw.close();
                if (fw != null)
                    fw.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
Además hemos dispuesto otro bloque try/catch ya que el método close del FileWriter puede generar
una excepción de tipo IOException.

De forma muy similar hemos codificado la lectura del archivo de texto para asegurarnos la llamada
del método close del FileReader.
 */