public class Combination {


    public static void combination(int arr[] , int data[] , int n , int r , int i , int index){

    if(index == r)
    {

        for(int j=0 ; j<r ; j++)
        {

            System.out.print(data[j]);
        }
        System.out.println("");
        return;
    }


    if(i >n)
    {
        return ;
    }

        data[index] = arr[i];
        combination( arr ,  data ,  n ,  r , i+1 ,  index+1);
        combination( arr ,  data ,  n ,  r , i+1 ,  index);

    }

    public static void print_Details(int arr[]  , int n , int r)
    {

         int data[] = new int[r];

         combination(arr ,data , n ,r ,0 ,0);

    }




    public static void main(String[] args)
    {

    int arr[] = {1,2,3,4,5};

    int n = arr.length;

    int r = 3;

    print_Details(arr , n , r);


    }
    
}
