package array;

import java.util.Scanner;

public class Mn {


    static int sum(int arr[])
    {
        int sum =0;
        for(int i=0 ; i< arr.length ; i++)
        {
            sum = sum + arr[i];
            
        }
        return sum;
    }

    static float mean(int sum , int length)
    {
        float a;
        a = (sum / length);
     
        return a;


    }

   public static void main(String[] args)
   {
    
   }

    
    
}
