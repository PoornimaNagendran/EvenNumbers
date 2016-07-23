package Guvi2;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		int Range1;
		int Range2;
		System.out.println("Enter the range");
	Range1=s.nextInt();
	Range2=s.nextInt();
	if(Range1%2==0)
	{
		Range1=Range1+2;
	}
	else
	{
		Range1++;
	}
	System.out.println("The odd numbers are");
	for(int i=Range1;i<Range2;)
	{
		System.out.println(i);
		i+=2;
	}

	}

}
