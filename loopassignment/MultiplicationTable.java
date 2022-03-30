package loopassignment;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Num,Fact=1;
		System.out.print("Enter No. For Table");
		Scanner Sc=new Scanner(System.in);
	     Num=Sc.nextInt();
	     for(int i=1;i<=10;i++)
	     {
	    	 Fact=Num*i;
	    	 System.out.println(Num +" * "+ i +" = "+ Fact);
	     }
	    
	}

}
