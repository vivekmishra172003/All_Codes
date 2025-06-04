
public class Hosteller extends Student {
	
	private int roomNumber;

	private char blockName;

	private String roomType;

	public Hosteller(int studentId, String studentName, String department, String gender, String category,
			double collegeFee, int roomNumber, char blockName, String roomType) {
		super(studentId, studentName, department, gender, category, collegeFee);
		this.roomNumber = roomNumber;
		this.blockName = blockName;
		this.roomType = roomType;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public char getBlockName() {
		return blockName;
	}

	public void setBlockName(char blockName) {
		this.blockName = blockName;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	@Override
	public double calculateTotalFee() {
		// TODO Auto-generated method stub
		if(getBlockName()=='A') {
			if(getRoomType().equals("AC")) {
				return getCollegeFee()+60000+8000;
			}else {
				return getCollegeFee()+60000;
			}
		}
		if(getBlockName()=='B') {
			if(getRoomType().equals("AC")) {
				return getCollegeFee()+50000+5000;
			}else {
				return getCollegeFee()+50000;
			}
		}
		if(getBlockName()=='C') {
			if(getRoomType().equals("AC")) {
				return getCollegeFee()+40000+2500;
			}else {
				return getCollegeFee()+40000;
			}
		}
		return 0;
	}

	// Fill the code
}
