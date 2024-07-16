
package two_d_array;

import java.util.Scanner;

public class Two_D_Array 
{
   Scanner value = new Scanner(System.in); 
    private int[][] two_D_Array = new int[3][3];
    
    public Two_D_Array()
    {
        for( int a = 0; a < two_D_Array.length; a++ )
        {
            int b = 0;
            while( b < two_D_Array.length )
            {
                System.out.print("Enter value into two_D_Array["+a+"]["+b+"] = ");
                two_D_Array[a][b] = value.nextInt();
                b++;
            }
            System.out.println("");
        }
        
        int c = 0;
        while( c < two_D_Array.length )
        {
             int d = 0;
             do
             {
                 System.out.print(two_D_Array[c][d]+"\t");
                 d++;
             }
             while( d < two_D_Array.length );
            c++;
            System.out.println("");
        }
    }
    public int[][] getTwo_D_Array()
    {
        return two_D_Array;
    }
}
