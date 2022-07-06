package workshop.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class TipoString {
    
    public static void cadenaCaracter( )
    {
        //String strCadena;          //"texto de un libros hasta 1 caracter      ... ";
        String[] myarray;       //declaration of string array without size
        //String[] strArray = new String[5];  //declaration with size
 
        String[] numarray = {"one", "two", "three"};
        String[] strArray = new String[] {"one", "two", "three", "four","five"};

        //display elements of second array
        //System.out.print(strArray[0] + " " +strArray[1]+ " " + strArray[2]+ " " +  strArray[3]+ " " +strArray[4]);

        for(int i=0; i<strArray.length;i++)
            System.out.println(strArray[i] + " ");

    }

    public static void listaArray() 
    { 
        Scanner sc = new Scanner(System.in);
        List<String> lstStr  = new ArrayList<String>(); 
 
        lstStr.add("one"); 
        lstStr.add("two"); 
        lstStr.add("three"); 

        System.out.printf("Ingrese 10 nombres:");
        for (int i = 0; i < 10; i++)
        {
            String strNombre = sc.nextLine().toLowerCase();
            if (lstStr.contains(strNombre))
                System.out.println("Ya lo ingresaste!!");
            else
                lstStr.add(strNombre);
        }

        Collections.sort(lstStr);

        String strtwo = "Two";

        for (String srt : lstStr){
            System.out.println(srt);

            if (strtwo.toLowerCase().equals(srt.toLowerCase()))
                System.out.println("Existe otro: " + srt);
        }

        String[] str_Array = {"This","is","Software","Testing","Help"};
        strtwo= Arrays.toString(str_Array);
        System.out.println("String array converted to string: " + strtwo);

        System.out.println("-------------------");
        String[] arrSplit = strtwo.split("t",5);

        for (String srt : arrSplit)
            System.out.println(srt);

        System.out.println(arrSplit[2].toUpperCase());

        String myStr = "This is Java Series Tutorial";
        System.out.println("The original string:" + myStr + "\n");
        String[] arrStr = null;

        Pattern pattern = Pattern.compile(" ");
        arrStr = pattern.split(myStr);

        for (int i = 0; i < arrStr.length; i++)
            System.out.println("arrStr[" + i +"]=" + arrStr[i]);
        sc.close();
    }
    
}
