//write a java program to take data at runtime and add all the elements of the array.
import java.util.*;
public class SumArray {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a[]=new int[10],no,i;
    System.out.println("Please enter the range of your array.");
        no=sc.nextInt();
        for(i=0;i<no;i++){
            System.out.print("Please enter index "+i+" value: ");
            a[i]=sc.nextInt();
        }
        System.out.println();
        int sum=0;
        for(int j=0;j<a.length;j++){
            sum=sum+a[j];
        }
        System.out.println("Sum of elements: "+sum);
        sc.close();
    }
}
