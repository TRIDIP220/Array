 class Rev {



    void rev(int arr[] , int l)
    {
        
        for(int i=l-1 ; i>=0 ; i--)
        {
            System.out.print(arr[i]);
        }

    }

    public static void main(String[] args)
    {


        Rev obj = new Rev();

        int arr[] ={10,9,8,7,6};
        int n = arr.length;

        obj.rev(arr,n);



    }
    
}
