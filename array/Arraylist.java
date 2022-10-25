import java.util.*;

class Query{

  int l;
  int r;
  Query(int l , int r)
  {
    this.l = l;
    this.r = r;
  }

}

public class Arraylist{

  static void print_fun(int [] arr , int n , ArrayList<Query> q , int m)
  {

    for(int i =0 ; i< m ; i++)
    {

      int L =  q.get(i).l;

      int R = q.get(i).r;

      int sum = 0;

      for(int j = L ; j<=R ; j++)
      {
        
        sum = sum + arr[j];
      }
    
      System.out.println("Sum of" + "[" + L + ","  + R + "]" +sum);
    }

  }
  public static void main(String[] argv)
  {


    int [] arr = {1 , 2 ,3 ,4 , 5 , 6 , 7};

    int n = arr.length;

    ArrayList<Query> q = new ArrayList<Query>();

    q.add(new Query(0,4));
    q.add(new Query(1,2));

    int  m = q.size();

    print_fun(arr , n , q , m);

  }


}