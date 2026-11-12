import java.util.Scanner;
public class PrimeNum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i,count=0;
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        for (i=1;i<=num;i++){
            if(num%i==0){
                count=count+1;
            }
        }
        if (count==2){
            System.out.println("The number is prime");
        }
        else{
            System.out.println("The number is not prime");
        }
        sc.close();
    }
}
