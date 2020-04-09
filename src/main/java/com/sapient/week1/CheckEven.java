package com.sapient.week1;
import java.util.Scanner;

public class CheckEven {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");

	int number = reader.nextInt();
	
        if( check(number) )
        	System.out.print("Number is Even");
        else
        	System.out.print("Number is odd");
	}
    
	public static Boolean check( int n )
	{
		if (n % 2 == 0 )
                 {
                     return true;
                 }
               else
                 {
                    return false;
	          }
	}
}
