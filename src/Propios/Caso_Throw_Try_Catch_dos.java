package Propios;

/*
En este casos de define una función denominada calcular, que devuelva el cociente entre el
numerador y el denominador, cuando se le pasa los strings obtenidos de los respectivos controles
de edición. La función calcular, convierte los strings en números enteros, verifica el rango, calcula
y devuelve el cociente entre el numerador y el denominador,
 */
public class Caso_Throw_Try_Catch_dos {

    public static void main(String[] args) {
        String str1="20";
        String str2="2";
        String respuesta;
        int numerador, denominador, cociente;
        try{
            cociente=calcular(str1, str2);
            respuesta=String.valueOf(cociente);
        }catch(NumberFormatException ex){
            respuesta="Se han introducido caracteres no numéricos";
        }catch(ArithmeticException ex){
            respuesta="División entre cero";
        }catch(ExcepcionIntervalo ex){
            respuesta=ex.getMessage();
        }
        System.out.println(respuesta);
    }
    static int calcular(String str1, String str2)throws ExcepcionIntervalo,
            NumberFormatException, ArithmeticException{
        int num=Integer.parseInt(str1);
        int den=Integer.parseInt(str2);
        if((num>100)||(den<-5)){
            throw new ExcepcionIntervalo("Números fuera del intervalo");
        }
        return (num/den);
    }
}
