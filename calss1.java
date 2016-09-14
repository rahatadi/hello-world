package project1;

public class calss1 {

	public static void main(String[] args) {
		
		
		System.out.println("hello_to_all_i_am_here!");
		int initialBalance = 10000 ;
		int years = 0;
			double balance = initialBalance;
			while (balance < 1000000 && years < 10) {
			years++;
		balance = balance * 1.05;
			}
		
		System.out.println("ur balance will be " + balance + " after" + years +" years");
		

	}
	
}


