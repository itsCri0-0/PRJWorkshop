package test;
/**
 * Clase - Demostracion de testing
 * @author: itsCri0-0
 * @version: 1.0
 */
public class Testing {
    /**
     *  Valida la compilacion del Java 
     */
    public static void TestJava(){
        System.out.printf("Java are ready :)");
    }

    /**
     *  Valida la compilacion del Java 
     * @param name : Escribe tu nombre
     */
    public static void TestJavaName(String name){
        System.out.printf("Java are ready :)"+name);
    }

    /**
     *  Valida la compilacion del Java 
     * @param nombre : Escribe tu nombre
     * @param fecha : Es la fecha actual
     * @return Un saludo
     */
    public static String TestJavaSaluda(String nombre, String fecha){
        return "Java are ready" + nombre + " " + fecha ;
    }
    
}
