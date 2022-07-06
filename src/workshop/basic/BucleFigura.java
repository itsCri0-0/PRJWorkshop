package workshop.basic;

import java.util.Scanner;

public class BucleFigura
{
 
    private static void max2Numeros() {
        int a=10, b=23;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Ingrese el 1er valor: ");
        a = sc.nextInt();
        System.out.printf("Ingrese el 2do valor: ");
        b = sc.nextInt();

        if(a>b)
        {
            System.out.printf("El mayor es: %d", a);
        }
        else
        {
            System.out.printf("El mayor es: %d", b);
        }
    }

    public static void drawLetraP(int t)
    {
        t=t*2;
        for(int i=1; i<=t; i++)
        {
            for(int j=1;j<=t;j++)
            {
                if((i==1 || i == (t/2) || j==1 ) || (j == t && i <=(t/2)  ))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
    }

    public static void drawTrianguloRectangulo(int l)
    {
        for(int i=1; i<=l; i++)
        {
            for(int j=1;j<=l;j++)
            {
                if((j==1 || i == l) || (j == i))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println("");
        }
    }

    public static void drawRectangulo()
    {
        int b=15, h=10;
        for(int i=1; i<=h; i++)
        {
            for(int j=1;j<=b;j++)
            {
                if((i==1 || i == h) || (j==1 || j == b))
                    System.out.printf("* ");
                else
                    System.out.printf("  ");
            }
            System.out.println("");
        }
    }

    public static void drawCuadrado() 
    {
        for(int i=1; i<=10; i++)
        {
            for(int j=1;j<=10;j++)
            {
                if((i==1 || i == 10) || (j==1 || j == 10))
                    System.out.printf("* ");
                else
                    System.out.printf("  ");
            }
            System.out.printf("\n");
        }
    }

    public static void drawLetraPP(int t) throws InterruptedException
    {
        t=t*2;
        for(int i=1; i<=t; i++)
        {
            for(int j=1;j<=t;j++)   
                System.out.print(   (i==1 || i == (t/2) || j==1 ) || (j == t && i <=(t/2) )
                                    ? "#"
                                    : " ");
            System.out.print("\t");
            for(int j=1;j<=t;j++)   
            System.out.print(   (i==1 || i == (t/2) || j==1 ) || (j == t && i <=(t/2) )
                                ? "#"
                                : " ");
            Thread.sleep(900);
            System.out.print("\n");
        
        }
    }
}