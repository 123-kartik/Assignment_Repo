package loopassignment;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Num,Fact=1;
		System.out.print("Enter No. For factorial");
		Scanner Sc=new Scanner(System.in);
	     Num=Sc.nextInt();
	     for(int i=1;i<=Num;i++)
	     {
	    	 Fact=Fact*i;
	    	 
	     }
	     System.out.print("The  factorial of "+ Num +" is "+ Fact);
	}

}
