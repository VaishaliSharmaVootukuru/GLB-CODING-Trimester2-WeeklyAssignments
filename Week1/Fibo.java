//Write a code to print the Fibonacci series (10 digits)
//LEARN THIS!!!
public class Fibo 
{
    public static void main(String[] args)
    {
        int no=10,a=0, b=1, c;
        System.out.println("Fibonacci Series is ");
        System.out.print(a + " " + b+" ");
        c=a+b;
        while (c<=no)
        {
            System.out.print(c+" ");
            a=b;
            b=c;
            c=a+b;
        }
   
    }
}
