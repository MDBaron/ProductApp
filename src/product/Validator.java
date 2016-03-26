package product;

import java.util.Scanner;

public class Validator {
	
	public static String getString(Scanner sc, String prompt){
		System.out.println(prompt);
		String s = sc.next();//get user input
		sc.nextLine();//discard excess input
		return s;
	}
	
	public static int getInt(Scanner sc, String prompt){
		int i = 0;
		boolean isValid = false;
		while(isValid == false){
			System.out.print(prompt);
			if(sc.hasNextInt()){
				i = sc.nextInt();
				isValid = true;
			}else {
				System.out.println("Error! Invalid integer value. Try again.");
			}//else
			sc.nextLine();
		}//while
		return i;
	}//getInt
	
	public static int getInt(Scanner sc, String prompt, int min, int max){
		int i = 0;
		boolean isValid = false;
		while(isValid == false){
			i = getInt(sc,prompt);
			if(i <= min){
				System.out.println("Error! Number must be greater than " + min + ".");
			} else if(i >= max){
				System.out.println("Error! Number must be less than " + max + ".");
			} else {
				isValid = true;
			}//else
		}//while
		return i;
	}//getDoubleWithinRange
	
	public static double getDouble(Scanner sc, String prompt){
		double d = 0.0;
		boolean isValid = false;
		while(isValid == false){
			
			System.out.print(prompt);
			if(sc.hasNextDouble()){
				d = sc.nextDouble();
				isValid = true;
			}else {
				System.out.println("Error! Invalid decimal value. Try again.");
			}//else
			
			sc.nextLine();
		}//while
		return d;
	}//getDouble
	
	public static double getDouble(Scanner sc, String prompt, double min, double max){
		double d = 0.0;
		boolean isValid = false;
		while(isValid == false){
			d = getDouble(sc,prompt);
			if(d <= min){
				System.out.println("Error! Number must be greater than " + min + " .");
			} else if(d >= max){
				System.out.println("Error! Number must be less than " + max + " .");
			} else {
				isValid = true;
			}//else
		}//while
		return d;
	}//getDoubleWithinRange
}//ValidatorClass
