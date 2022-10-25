public class Maxsub{

static int operation(int arr[])
{


    int sub[] =  new int[arr.length];

    int result = arr[0];
    for(int i = 1 ; i< arr.length ; i++)
    {
        sub[i] = Math.max(arr[i] , sub[i-1]+arr[i]);
        result = Math.max(result , sub[i]);

    }

 return result;

}


public static void main(String[] args)
{

int arr[] ={1,2,3,4,5,6,7,8,9};
System.out.println(operation(arr));

}




}