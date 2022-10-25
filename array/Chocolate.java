import java.util.*;
public class Chocolate {


    static int operation(int arr[] , int n , int m)
    {

        Arrays.sort(arr);
        int min = arr[n-1];
        int dif;

        for(int i=0 ; i< n - m  ; i++)
        {

            dif = arr[i + m -1] + arr[i];
            if(dif < min)
            {

                min = dif;
            }
            
        }

        return  min;
        
    }


    public static void main(String[] args)
    {

          int arr[] ={7, 3, 2, 4, 9, 12, 56};

          int n = arr.length;
          
          int m = 3;
          System.out.println(operation(arr , n , m));

    }
    
}
