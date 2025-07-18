
public abstract class Endowment {
	
	// Fill the cod
	protected String endowmentId;

	protected String holderName;

	protected String endowmentType;
	protected String registrationDate;

	public Endowment(String endowmentId, String holderName, String endowmentType, String registrationDate) {
		super();
		this.endowmentId = endowmentId;
		this.holderName = holderName;
		this.endowmentType = endowmentType;
		this.registrationDate = registrationDate;
	}

	

	public String getEndowmentId() {
		return endowmentId;
	}

	public void setEndowmentId(String endowmentId) {
		this.endowmentId = endowmentId;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public String getEndowmentType() {
		return endowmentType;
	}

	public void setEndowmentType(String endowmentType) {
		this.endowmentType = endowmentType;
	}

	public String getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}
	public abstract double calculateEndowment();



}
