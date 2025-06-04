
public class WoodenBero extends Bero {
	private String woodType;
	
	public WoodenBero(String beroType, String beroColour, String woodType) {
	    super(beroType, beroColour);
	    this.woodType = woodType;
	}



	// Fill the code

	

	
	public String getWoodType() {
		return woodType;
	}



	public void setWoodType(String woodType) {
		this.woodType = woodType;
	}



	public void calculatePrice() {
		
		// Fill the code
		if(woodType.equalsIgnoreCase("Ply Wood")) {
			setPrice(15000);
		}
		if(woodType.equalsIgnoreCase("Teak Wood")) {
			setPrice(12000);
		}
		if(woodType.equalsIgnoreCase("Engineered Wood")) {
			setPrice(10000);
		}
		
	}

}
