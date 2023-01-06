package chapter02.entity;

//import chapter02.entity.PersonalInfo;


public class Police extends PersonalInfo{
	
	
	String district; // 관할지구
	String officePosition; // 직책

	
	Police(){
		
	}
	
	
	Police(String gender, String name, int age, String address, String email, String district, String officePosition){
		super(gender, name, age, address, email);
		this.district =  district;
		this.officePosition = officePosition;
	}

	// * getter / setter
	public String getDistrict() {
		return district;
	}


	public void setDistrict(String district) {
		this.district = district;
	}


	public String getOfficePosition() {
		return officePosition;
	}


	public void setOfficePosition(String officePosition) {
		this.officePosition = officePosition;
	}
	
	
	
	
	
	
	/*
	Police{
		super("Johon doe", "man");
	}
	*/
	
}

