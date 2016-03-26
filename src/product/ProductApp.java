package product;

import java.util.Scanner;

public class ProductApp {
	
	public static void main(String args[]){
		System.out.println("Welcome to the Product Selector");
		System.out.println();
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while(choice.equalsIgnoreCase("y")){
			System.out.println("Enter the product code: ");
			String productCode = sc.next();//get product code form user
			sc.nextLine();//discard excess data
			
			//get Product object
			Product product = ProductDB.getProduct(productCode);
			
			//display output
			System.out.println();
			System.out.println("SELECTED PRODUCT");
			System.out.println("Description: " + product.getDescription());
			System.out.println("Price: " + product.getFormattedPrice());
			System.out.println();
			
			//if continue
			System.out.println("Continue? y/n: ");
			choice = sc.nextLine();
			System.out.println();
		}//while
	}//main
}
