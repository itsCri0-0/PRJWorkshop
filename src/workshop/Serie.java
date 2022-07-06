package workshop;

public class Serie {
    
    public static void Pares()
    {
       for (int i = 0; i <= 10; i++)
       {
           if (i % 2 == 0)
           System.out.printf(" %d", i);
       }
    }

    public static void Pares(int Top)
    {
       for (int i = 0; i <= Top; i++)
       {
           if (i % 2 == 0)
           System.out.printf(" %d", i);
       }
    }

    public static void paresImpares(int Cantidad)
    {
       {
           int par = 2;
           int impar = 1;
           int count = 1;
           while (count <= Cantidad)
           {
                System.out.printf(" %d/%d", impar, par);
                impar = impar + 2;
                par = par + 2;
                count++;
           }
           
       }
    }

    public static void signoAlterno(int Cantidad)
    {
        int count = 0;
        String signo = "";
        while (count <= Cantidad)
        {
            if (count % 2 != 0)
                signo = "+";
            else
                signo = "-";
            for (int i = 1; i <= count; i++)
                System.out.printf(signo);
            count = count + 1;
            System.out.printf(" ");
        }
        
    }

    public static void signoAlternoOptimo(int Cantidad)
    {
        int count = 0;
        while (count++ <= Cantidad)
        {
            for (int i = 1; i <= count; i++)
                System.out.printf((count % 2 != 0 )? "+":"-" ); //Operador terciario (Sustituto del If)
                System.out.printf("  ");
        }
    }
}
