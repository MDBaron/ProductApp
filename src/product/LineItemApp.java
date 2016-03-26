package product;

import java.util.Scanner;

public class LineItemApp {

	public static void main(String args[]){
		System.out.println("Welcome to the Line Item Calculator");
		System.out.println();
	
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while(choice.equalsIgnoreCase("y")){
			System.out.println("Enter the product code: ");
			String productCode = Validator.getString(sc, "Enter the product code: ");//get product code form user
			int quantity = Validator.getInt(sc, "Enter quantity:		", 0, 1000);
		
			
			//get Product object
			Product product = ProductDB.getProduct(productCode);
			
			//get a new LineItem object
			LineItem lineItem = new LineItem(product, quantity);
		
			//display output
			System.out.println();
			System.out.println("LINE ITEM");
			System.out.println("Code: " + product.getCode());
			System.out.println("Description: " + product.getDescription());
			System.out.println("Price: " + product.getFormattedPrice());
			System.out.println("Quantity: " + lineItem.getQuantity());
			System.out.println("Total: 		" + lineItem.getFormattedTotal() + "\n");
			System.out.println();
		
			//if continue
			choice = Validator.getString(sc, "Continue? y/n: ");
			System.out.println();
		}//while
	
	}//main
}//LineItemAppClass
