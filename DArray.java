
package pkg2.d.array;

import java.util.Arrays;
import java.util.Scanner;

public class DArray 
{

    public static void main(String[] args) 
    {
      Scanner data = new Scanner(System.in);  
        System.out.println("\t------------->> Static 2 D Array <<---------------");
        int[][] pak = { {1 , 2 } , {3 , 4 }  };
        for( int a = 0; a < pak.length; a++ )
        {
            int b = 0;
            while( b < pak.length )
            {
                System.out.print(pak[a][b]+"\t");
                b++;
            }
            System.out.println("");
        }     
        System.out.println("++++++++++>>> Dynamic 2 D Array <<<+++++++++++++");
       int[][] shan = new int[3][3];
       for( int c = 0; c < shan.length; c++ )
       {
           int d = 0;
           while( d < shan.length )
           {
               System.out.print("Enter value into shan["+c+"]["+d+"] = ");
               shan[c][d] = data.nextInt();
               d++;
           }
           System.out.println("");
       }
       int e = 0;
       while( e < shan.length )
       {
           int f = 0;
           do
           {
               System.out.print(shan[e][f]+"\t");
               f++;
           }
           while( f < shan.length );
           System.out.println("");
           e++;
       }
    }
    
}
