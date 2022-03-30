package loopassignment;
import java.util.Scanner;
public class PrimeOrNot {
  
	void prime(int Num)
	{
		boolean Flag=true;
		     if(Num==2) {
		System.out.println(Num +" it is a prime Number.");
			}
	else
	{
		for(int i=2;i<Num;i++)
		{
			if((Num)%i==0)
			{
				Flag=false;
				break;
			}
		}
		if(Flag)
		{
			System.out.println(Num +" it is a prime Number.");
		}
		else 
			System.out.println(Num +" it is a not prime Number.");
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeOrNot N=new PrimeOrNot();
		 Scanner Sc=new Scanner(System.in);
	     int Num=Sc.nextInt();
	     		N.prime(Num);
	}

}
