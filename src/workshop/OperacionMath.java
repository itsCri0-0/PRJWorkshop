package workshop;

public class OperacionMath {

    /*
     * Este es un METODO: drawLinea <-- notacion camelCase
     * Presenta una linea de caracteres
     * @deprecated metodo deprecado - Usar sumaShort
     */
    static void suma()
    {
        //Declaracion de variables
        int a, b;

        //Inicializacion de variables
        a=100;
        b=55;

        //Operacion
        a = a + b;
        System.out.printf("La suma es: %d", a);
    }

    static void sumaShort()
    {
        //Declaracion - Inicializacion de variables
        int a=100, b=55;

        //Operacion
        a = a + b;
        System.out.printf("La suma es: %d", a);
    }

    //Metodo retorna valor + parametros : tipo datos (no void) -> int, float, char ..... + return
    static int sumaPara(int a, int b) //Parametros : int a, int b
    {
        return a + b;
    }
}
