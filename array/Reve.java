class Reve{



static void operation(int arr[] , int s , int e)
{

     while(s  < e)
     {


        int temp = arr[s];

        arr[s] = arr[e];

        arr[e] = temp;

        s++;
        e--;
     }

}

static void Display(int arr[] ,int l)
{


    for(int i =0 ; i< l ; i++)
    {

        System.out.print(arr[i]);




    }







}



    public static void main(String[] args)
    {


     int arr[] ={10 , 9 , 8 , 7 , 6};

     int n = arr.length;


     operation(arr , 0 , n-1);
    
     Display(arr , n);





    }







}