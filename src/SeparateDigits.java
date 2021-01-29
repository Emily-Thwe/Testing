import java.util.Scanner;
public class SeparateDigits 
{

	public static void main(String[] args)



	{	Scanner input = new Scanner(System.in);
		int number ;
		System.out.print("Enter a five-digit number : ");
		number = input.nextInt();
		int remainder1 = number % 10000;
		int remainder2 = remainder1 % 1000;
		int remainder3 = remainder2 % 100;
		int remainder4 = remainder3 % 10;
		if(number >= 100000)
		{
			System.out.println("The number of digits is more than 5 digits . ");
		}
		else if(number < 10000)
		{
			System.out.println("The number of digits is less than 5 digits . ");
		}
		else
		{
		System.out.printf("%d   %d   %d   %d   %d",number/10000,remainder1/1000,remainder2/100,remainder3/10,remainder4);
		}
       
	}

}
