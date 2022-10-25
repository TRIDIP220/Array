package array;
public class Delete {

    static void Remove_duplicate(int[] arr , int length)
    {
        int index=0;
        for(int i=0 ; i< length ; i++)
        {
            for(int j = i +1 ; j < length ; j++)
            {
                if(arr[i] == arr[j])
                {
                    index = j;

                }

            }
        }
        for(int k = index ; k < length -1 ; k++)
        {

            arr[k] = arr[k+1];

        }

        length--;

        for(int i=0 ; i< length ; i++)
        {

            System.out.println(arr[i]);
        }

    }


    public static void main(String[] args)

    {

      int arr[] ={1,2,1,4,5,6,7};

      Remove_duplicate(arr , arr.length);
      
      

    }
    
}
