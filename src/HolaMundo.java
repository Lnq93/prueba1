//Mi clase en Java

public class HolaMundo {

    public static void main(String args[]) {
        //Defninimos la variable
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);
        //Modificamos el valor de la variable
        miVariableEntera = 5;
        System.out.println(miVariableEntera);
        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);
        //Modificamos el valor de la variable
        miVariableCadena = "Adios";
        System.out.println(miVariableCadena);
        //var - Inferencia de tipos en Java
        var miVariableEntera2 = 15;
        System.out.println(miVariableEntera2);
        var miVariableCadena2 = "Nueva cadena";
        System.out.println(miVariableCadena2);
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
        //Valore permitidos en el nombre de nuestras variables
        var miVariable = 1;
        var _miVariable = 2;
        var $miVariable = 3;
        //var áVariable = 10; No se recomineda utilizar acento en la primer letra de la variable//
        //var #miVariable = 2; No se permite utilizar caracteres especiales//
        System.out.println("miVariable = " + miVariable);
        System.out.println("_miVariable = " + _miVariable);
        System.out.println("$miVariable = " + $miVariable);
        var variableString = "Hola";
        var variableString_2 = "Lautaro Quiroga";
        var variableString_3 = "Argentina!!";
        System.out.println("variableString = " + variableString);
        System.out.println("variableString_2 = " + variableString_2);
        System.out.println("variableString_3 = " + variableString_3);
        
    }
}
