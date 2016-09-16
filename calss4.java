package java_udacity;

public class Tutorail1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Purchase_price=0;
		
		int total_cost=0;
		int miles_driven= 50000;
		int[] purchase_price = {15000,30000};
		int[] mpg = {10,50};
		 for (int i = 0; i < purchase_price.length; i++) {
	         System.out.println("for" + i + " car puchase price is " + purchase_price[i] + " ");
	         int g_cost = (miles_driven/mpg[i])* 4;
	         System.out.println("gas cost is " + g_cost);
	         total_cost = purchase_price[i] + g_cost;
	         System.out.println("total cost is " + total_cost);
	         System.out.println(" ************for car ************ " + i);
	         
	      }
		