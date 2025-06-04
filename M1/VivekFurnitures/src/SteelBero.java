
public class SteelBero extends Bero {

	public SteelBero(String beroType, String beroColour,int beroHeight) {
		super(beroType, beroColour);
		// TODO Auto-generated constructor stub
		this.beroHeight = beroHeight;
	}


	public int getBeroHeight() {
		return beroHeight;
	}


	public void setBeroHeight(int beroHeight) {
		this.beroHeight = beroHeight;
	}


	// Fill the code
	private int beroHeight;

	
	public void calculatePrice() {
		
		// Fill the code
		if(beroHeight==3) {
			setPrice(5000);
		}
		if(beroHeight==5) {
			setPrice(8000);
		}
		if(beroHeight==7) {
			setPrice(10000);
		}
		
	}

}
