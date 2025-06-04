
public class HealthEndowment extends Endowment {
	
	public HealthEndowment(String endowmentId, String holderName, String endowmentType, String registrationDate ,String healthCareCenter, int holderAge ) {
		super(endowmentId, holderName, endowmentType, registrationDate);
		// TODO Auto-generated constructor stub
		this.healthCareCenter = healthCareCenter;
		this.holderAge = holderAge;
	}


	// Fill the code
	private String healthCareCenter;

	 private int holderAge;

	
	public double calculateEndowment(){
		// Fill the code
		if(holderAge<=30) {
			return 120000;
		}
		if(holderAge>30 && holderAge<60) {
			return 200000;
		}
		if(holderAge>=60) {
			return 500000;
		}
		return 0;
	}


	public String getHealthCareCenter() {
		return healthCareCenter;
	}


	public void setHealthCareCenter(String healthCareCenter) {
		this.healthCareCenter = healthCareCenter;
	}


	public int getHolderAge() {
		return holderAge;
	}


	public void setHolderAge(int holderAge) {
		this.holderAge = holderAge;
	}

}
