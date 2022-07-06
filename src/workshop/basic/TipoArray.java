package workshop.basic;

public class TipoArray {

    public static void LongitudArray()
    {
        int lista[]= new int [10];
        int num[]={1,2,3};
        int tabla[][]={
                {1,2,3},    // 0
                {4,5},      // 1
                {6,7,8,9}   // 2
            //   0 1 2 3
        };
        System.out.println("Longitud de lista: "+lista.length);
        System.out.println("Longitud de num: " +num.length);
        System.out.println("Longitud de tabla: "+tabla.length);
        System.out.println("Longitud de tabla[0]: " +tabla[0].length);
        System.out.println("Longitud de tabla[1]: " +tabla[1].length);
        System.out.println("Longitud de tabla[2]: " +tabla[2].length);
        System.out.println();
    }

    public static void cloneArray() 
    {
        int intArray[] = {1,2,3};
        int cloneArray[] ;
        
        cloneArray = intArray.clone();
         
        System.out.println(intArray == cloneArray);
         
        for (int i = 0; i < cloneArray.length; i++) {
            System.out.print(cloneArray[i]+" ");
        }
        ///////////////
        int[][] MulDimeEnteros = MatrizEnterosBiDimencional();
        int[][] MulDimeEnterosClone = MulDimeEnteros.clone();

        for (int i=0; i< MulDimeEnterosClone.length; i++)
        {
            for (int j=0; j < 3 ; j++)
                System.out.print(MulDimeEnterosClone[i][j] + " ");
            System.out.println();
        }   
    }

    public static void arrayInt () 
    {         
      // declara un array de enteros.
      int[] arr;
         
      // asignando memoria para 5 enteros.
      arr = new int[5];
         
      // inicializa el primer elemento del array
      arr[0] = 10;
      arr[1] = 20;
      arr[2] = 30;
      arr[3] = 40;
      arr[4] = 50;
         
      // accediendo a los elementos del array
      for (int i = 0; i < arr.length; i++)
         System.out.println("Elemento en el índice " + i + " : "+ arr[i]);          
    }

    public static void arregloEnterosBiDimencional () 
    {         
        //int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10,11,12,18 }; 
        // declarar e inicializar array 2D
        // int[][] arr = { {2,7,9},{3,6,1},{7,4,2} ,{70,40,20}};
        int[][] arr = MatrizEnterosBiDimencional();
            //  i       0       1       2     ...
            //  j        0-1-2   0-1-2   0-1-2    ...
        // imprimir array 2D
        for (int i=0; i< arr.length; i++)
        {
            for (int j=0; j < 3 ; j++)
                System.out.print(arr[i][j] + " ");
            
            System.out.println(" -> Suma de valores del array: " + sum(arr[i]));
            System.out.println();
        }   
          
        System.out.println(" -> Suma Total: " + sumTotal(arr));
    }


    public static int[][] MatrizEnterosBiDimencional() 
    {
        return new int[][]{ {2,7,9},{3,6,1},{7,4,2} ,{70,40,20}};
    }


    public static int sum(int[] arr) 
    {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum+=arr[i];
        return sum;
    }

    public static int sumTotal(int[][] arr) 
    {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum+=sum(arr[i]);
        return sum;
    }


    public  static void ArrayVectorMatriz()
    {
        // 1. Declaraciones válidas
        //Tipo de datos primitivos
        // int numerosPares[];  
        // int[] numerosInpares;
        // int[] numerosPrimos;
        // byte byteArray[];
        // short shortArray[];
        // boolean booleanArray[];
        // long longArray[];
        // float floatArray[];
        // double doubleArray[];
        // char charArray[];

        //Tipos de datos definidos por el usuario CLases
        //BucleFigura myClassArray[]; 
        //BucleFigura[] myClassArrayx; 
        //Object[]  ao,        // array de Object
        //Collection[] ca;  // array de Collection


        // 2. inicializacion
        //intArray = new int;     // asignando memoria al array
        // 1. 2.
        //int[] intArray = new int; // combinando ambas declaraciones en una

        int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10,11,12,18 }; 
                                //  0 1 2 .....
        //acceder a los elementos del array
        for (int i = 0; i < intArray.length; i++)
            System.out.println("Elemento en el indice " + i + " : "+ intArray[i]);
    }
}
