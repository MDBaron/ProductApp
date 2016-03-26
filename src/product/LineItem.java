package product;

import java.text.NumberFormat;

public class LineItem {

	private int quantity;
	private double total;
	
	public LineItem(){
		this.product = new Product();
		this.quantity = 0;
		this.total = 0;
	}//LineItem Constructor
	
	public LineItem(Product product,int quantity){
		this.product = product;
		this.quantity = quantity;
	}//overloaded constructor
	
	private Product product;
	/**
	 * @return the product
	 */
	public Product getProduct() {
		return product;
	}//getProduct

	/**
	 * @param product the product to set
	 */
	public void setProduct(Product product) {
		this.product = product;
	}//setProduct

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}//getQuantity

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}//setQuantity

	/**
	 * @return the total
	 */
	public double getTotal() {
		this.calculateTotal();
		return total;
	}//getTotal

	/**
	 * @param total the total to set
	 */
	public void calculateTotal() {
		this.total = this.getQuantity() * product.getPrice();
	}//calculateTotal
	
	public String getFormattedTotal(){
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(this.getTotal());
	}//getFormattedTotal
	
}//LineItemClass
