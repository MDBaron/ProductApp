package product;

import java.text.NumberFormat;

public class Product {
	//instance variables
	private String code;
	private String description;
	private double price;
	private static int objectCount = 0;
	
	//constructor
	public Product(){
		code = "";
		description = "";
		price = 0.0;
		objectCount++;
	}//constructor
	
	//Overloaded constructor
	public Product(String code, String description, double price){
		this.code = code;
		this.description = description;
		this.price = price;
		objectCount++;
	}//constructor
	
	public void setCode(String code){
		this.code = code;
	}//setCode
	
	public String getCode(){
		return code;
	}//getCode
	
	public void setDescription(String description){
		this.description = description;
	}//setDescription
	
	public String getDescription(){
		return description;
	}//getDescription
	
	public void setPrice(double price){
		this.price = price;
	}//setPrice
	
	public double getPrice(){
		return price;
	}//getPrice
	
	public String getFormattedPrice(){
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(price);
	}//getFormattedPrice
	
	public void printToConsole(){
		System.out.println(code + "" + description + "" + price);
	}//printToConsole
	
	public void printToConsole(String sep){
		System.out.println(code + sep + description + sep + price);
	}//printToConsole
	
	public void printToConsole(String sep, boolean printLineAfter){
		printToConsole(sep);
		if(printLineAfter){
			System.out.println();
		}//if true
	}//printToConsole
	
	public void print(){
		System.out.println(this);
	}//print
	
	public void save(){
		//ProductDB.saveProduct(this);
	}//save
	
	public static int getObjectCount(){
		return objectCount;
	}//getObjectCount
	
}//ProductClass
