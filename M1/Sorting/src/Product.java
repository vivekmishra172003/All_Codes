
public class Product {
	//Include the attributes
	
	//Include the getters and setters for the attributes
	
	//Include three argument constructor to initialize values	
	
	//This method should return the productId, productName and price seperated by whitespace
	
	private int productid;

	private String productName;

	private double price;

	
	public Product(int productid, String productName, double price) {
		this.productid = productid;
		this.productName = productName;
		this.price = price;
	}


	public int getProductid() {
		return productid;
	}


	public void setProductid(int productid) {
		this.productid = productid;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString()
    	{
            return productid + " " + productName + " " + price;
    	}
	
}
