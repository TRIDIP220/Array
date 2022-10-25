class Minmax{

static class pair{

    int min;
    int max;
}

static pair minmax(int arr[], int n)
{

    pair rp = new pair();

    if(n == 1)
    {
        rp.min = rp.max = arr[0];

        return rp;
        
    }

  
        if(arr[0] > arr[1])
        {
            rp.max = arr[0];
            rp.min = arr[1];
        }
        else{


            rp.max = arr[1];
            rp.min = arr[0];
        }



    for(int i=2 ; i<n ; i++)
    {

        if(arr[i] > rp.max)
        {
            
            rp.max = arr[i];

        
        }
        else if(arr[i] < rp.min)
        {
            
            System.out.println(arr[i]);
            rp.min = arr[i];
        }

    }

    return rp;

}


public static void main(String[] args)
{
   int arr[] ={1,2,3,4,5};

   int n = arr.length;

    pair value = minmax(arr , n);
    System.out.println("max value" +value.max);
    System.out.println(value.min);

}


}