package product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//database layer

public class ProductDB {

	private static Connection connection;
	static {
		String url = "jdbc:odbc:ProductDB";
		String user = "Admin";
		String password = "";
		try {
			connection = DriverManager.getConnection(url,user,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("Error connecting to Database....");
			e.printStackTrace();
		}
	}//static
	
	
	public static Product getProduct(String productCode){
		//create the Product object
		Product p = new Product();
		
		//fill the Product object with data
		p.setCode(productCode);
		if(productCode.equalsIgnoreCase("java")){
			p.setDescription("Murach's Beginning Java 2");
			p.setPrice(49.50);
		} else if(productCode.equalsIgnoreCase("japs")){
			p.setDescription("Murach's Java Servlet and JSP");
			p.setPrice(49.50);
		} else if(productCode.equalsIgnoreCase("mcb2")){
			p.setDescription("Murach's Mainframe COBOL");
			p.setPrice(59.50);
		}else {
			p.setDescription("Unknown");
		}//else
		return p;
	}//getProduct
}//ProductDBClass
