package introToJava;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
		boolean isPrime=true;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter any number:");
		
		int num=scan.nextInt();
		 scan.close();
		for(int i=2;i<=num/2;i++)
		{
			temp=num%i;
			if(temp==0)
			{
				isPrime=false;
				break;
			}
		}
	
	//if prime is true then the number is prime else not
	if(isPrime)
		System.out.println(num + " is a Prime number");
	else
		System.out.println(num + "is not a prime number");

	}

}
