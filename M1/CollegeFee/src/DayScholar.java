
public class DayScholar extends Student {
	
	public DayScholar(int studentId, String studentName, String department, String gender, String category,
			double collegeFee, int busNumber, float distance) {
		super(studentId, studentName, department, gender, category, collegeFee);
		this.busNumber = busNumber;
		this.distance = distance;
	}


	// Fill the code
	private int busNumber;

	private float distance;

	
	public int getBusNumber() {
		return busNumber;
	}


	public void setBusNumber(int busNumber) {
		this.busNumber = busNumber;
	}


	public float getDistance() {
		return distance;
	}


	public void setDistance(float distance) {
		this.distance = distance;
	}


	public double calculateTotalFee() {
		
		// Fill the code
		if(getDistance()>30&&getDistance()<=40) {
			return 28000+getCollegeFee();
		}
		if(getDistance()>20&&getDistance()<=30) {
			return 20000+getCollegeFee();
		}
		if(getDistance()>10&&getDistance()<=20) {
			return 12000+getCollegeFee();
		}
		if(getDistance()<=10) {
			return 6000+getCollegeFee();
		}
		
		return 0;
	}

}
