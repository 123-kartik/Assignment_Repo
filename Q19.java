package SelfEvauation1;
import java.util.Scanner;

class Bookstore2{
	Scanner Sc=new Scanner(System.in);
	String bookname;
	 int qty,price;
	 static String clg_name="GCOEJ"; 
	void input() {
		System.out.println("Enter detail of books:");
	  bookname=Sc.next();
	  qty=Sc.nextInt();
	  price=Sc.nextInt();
	}
	void display() {
		System.out.println("College Name : " +clg_name);
		System.out.println("Entered detail for books are :");
		System.out.println("Bookname : " +bookname);
		System.out.println("Quantity : " +qty);
		System.out.println("Price    : " +price);	
	}
	void checkprice() {
		if(price>5000)
		{
			System.out.println("Discount is on the price is 200Rs. ");
		}
		else
			System.out.println("Discount is on the price is 100Rs. ");
	}
}
public class Q19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Bookstore2 Bs=new Bookstore2();
	    Bs.input();
	    Bs.display();
	    Bs.checkprice();
	    }
}
