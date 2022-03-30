package loopassignment;

class Even{
	
	void display() {
		for(int i=1;i<=20;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}

public class EvenNumBet1to20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Even E=new Even();
E.display();  
	}

}
