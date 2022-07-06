package workshop.basic;
/**
 * Clase - Ciclos repetitivos Java
 * @author: itsCri0-0
 * @version: 1.0
 */
public class Bucle {
    /**
     * Uso del ciclo For
     * @param t : Número de repeticiones
     * @return en caso de que exista
     */
    public static void contadorFor(int t)
    {
        for (int i = 0; i <= t; i++)
        {
            System.out.printf(" %d ", i );
        } 

    }

    /**
     * Uso del ciclo While
     * @param t : Número de repeticiones
     * @return en caso de que se cumpla
     */
    public static void contadorWhile(int t)
    {
        int i=0;
        while (i <= t)
        {
            System.out.printf(" %d ", i );
            i++;
        } 

    }

    /**
     * Uso del ciclo Do - While
     * @param t : Número de repeticiones
     * @return en caso de que se cumpla
     */
    public static void contadorDoWhile(int t)
    {
        int i=0;
        do
        {
            System.out.printf(" %d ", i );
            i++;
        }
        while (i <= t); 

    }
}
