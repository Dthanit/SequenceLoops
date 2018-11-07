public class SequenceLoops
{
    public static void main(String[] args)
    {  
       int i = 1;
       int j = 1;
       getFor(i);
       System.out.println();
       getWhile(j);
       System.out.println();
       recursive(10);
    }
    public static void getFor(int i)
    { 
       for(i=1;i<=10;i++)
       System.out.print("  "+i);
    }
    public static void getWhile(int j)
    {
       while ( j <= 10 ) 
       {
          System.out.print ( "  "+j);
            ++j;
       }
     }
     public static void recursive(int n) 
     {
        if (n > 1) 
        {
           recursive(n - 1);
        }
        System.out.print  ("  "+n);
      }
}