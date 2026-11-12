//Write a java code to check whether a number is palindrome or not.
import java.util.Scanner;
public class Palindrome {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int no=sc.nextInt(); //no=525
        int rev=0,temp;
        int num=no;
        while(num>0)
        {
            temp=num%10; //temp=5,temp=2,temp=5
            rev=rev*10+temp; //rev=5,rev=52,rev=525!!!
            num=num/10; //num=52,num=5,num=0-->while loop breaks.
        }
        if (rev==no) System.out.println(rev+" is a palindrome");
        else System.out.println("not a palindrome");
        sc.close();
    }
}
