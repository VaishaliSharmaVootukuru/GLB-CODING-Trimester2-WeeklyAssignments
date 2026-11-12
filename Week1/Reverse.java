//Write a code to print the reverse of a number (example: 123-->321)
class Reverse
{
    public static void main(String[] args) 
    {
        int num=127,rev=0,temp;
        while(num>0)
        {
            temp=num%10; //Derives the remainder after division with 10 (last digit)
            rev=rev*10+temp;  // 0+7=7 so first digit of the new number is the last digit of the original number
            num=num/10; // divided by 10
            
        }
        System.out.println("Reverse of the number is: "+rev);
    }
}