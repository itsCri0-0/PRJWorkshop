package workshop.utility;
import java.io.IOException;

public class Utilitario {

    public static void avanceCarga() throws Exception
    {
        String c = "|/-\\";
        for (int x = 0; x <= 100; x++)
        {
            String srt = "\r " + c.charAt(x % c.length())+ " " + x + "%";
            System.out.write(srt.getBytes());
            Thread.sleep(100);
        }
        System.out.printf(" Done!!");
    }
    
    public static void DisplayBar(int procentaje, char c) throws IOException, InterruptedException
    {
        int TamBar = 30;
        String sb= new String();
        int nroCaracteres = procentaje * TamBar / 100;  //numero de caracteres
        sb =  "\r [";
        for (int k = 0; k <= TamBar; k++)
            sb += String.format("%s", ((nroCaracteres < k) ? " " : c));
        sb += "]";
        System.out.write(sb.getBytes());
        System.out.printf(" %d %%", procentaje);
        Thread.sleep(100);
    }

    public final static void clearConsole()
    {
        try
        {
            String operatingSystem = System.getProperty("os.name");     //Check the current operating system
              
            if(operatingSystem.contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                new ProcessBuilder("clear").inheritIO().start().waitFor();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
