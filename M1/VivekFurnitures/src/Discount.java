
public class Discount {
	
	public double calculateDiscount(Bero bObj) {
		// Fill the code
		if(bObj instanceof SteelBero) {
			return (bObj.getPrice()*0.10);
		}
		if(bObj instanceof WoodenBero) {
			return (bObj.getPrice()*0.15);
		}
		return 0;
		
	}
}
