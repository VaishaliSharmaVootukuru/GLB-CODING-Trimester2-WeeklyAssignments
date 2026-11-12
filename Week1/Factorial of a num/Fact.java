//Factorial of a number 
class Fact
{
	public static void main(String agrs[])
	{
		int num = 5;
        long factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + num + " is: " + factorial);
	}
}



