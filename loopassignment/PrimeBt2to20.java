package loopassignment;
import java.util.Scanner;
public class PrimeBt2to20 {
  
	void prime(int Num)
	{
		boolean Flag=true;
		     if(Num==2) {
		System.out.println(Num);
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
			System.out.println(Num );
		}
		
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeBt2to20 N=new PrimeBt2to20();
		 Scanner Sc=new Scanner(System.in);
	     int Num=Sc.nextInt();
	     
		for (int j=2;j<=Num;j++)
		{
		N.prime(j);
		}
	}

}