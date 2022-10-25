public class Merge {

    static void operation(int arr[] , int mid  , int low , int high)
    {
        int i , j , k ;

        int b[] = new int [100];

        i = k = low ;

        j = mid + 1;
        while(i <mid && j < high)
        {

            if(arr[i] < arr[j])
            {
                b[k] = arr[i];
                i++;
                k++;
            }
            else{

                    b[k] = arr[j];
                    j++;
                    k++;
                
            }
        }






    }





    public static void main(String[] args)
    {



        int arr[] = {10 , 9 , 8 , 7 , 6};

        int n = arr.length;

        







    }
    
}
