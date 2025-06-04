
public class CustomerDetails implements BonusPoints , DoorDelivery {
	
	private String customerName;

	private String phoneNumber;

	private String streetName;

	private double billAmount;

	private int distance;

	
	public CustomerDetails(String customerName, String phoneNumber, String streetName, double billAmount,
			int distance) {
		super();
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.streetName = streetName;
		this.billAmount = billAmount;
		this.distance = distance;
	}

	// Fill the code

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public double getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public double calculateBonusPoints() {
		// Fill the code
		if(getBillAmount()>=250) {
			return getBillAmount()/10;
		}
		return 0;
	}

	public double deliveryCharge() {
		// Fill the code
		if(getDistance()>=25) {
			return 8*getDistance();
		}else if(getDistance()>=15 && getDistance()<25) {
			return 5*getDistance();
		}else if(getDistance()<15) {
			return 2*getDistance();
		}
		return 0;
	}
	
}
