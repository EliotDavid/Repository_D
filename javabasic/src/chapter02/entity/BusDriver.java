package chapter02.entity;

//import chapter02.entity.PersonalInfo;


public class BusDriver  extends PersonalInfo {

	String vehicleModel; // 마을버스인지 시내버스인지 버스 차종
	String busNumber; // 몇 번 버스를 담당하는지
	
	BusDriver(){
		
	}
	
	BusDriver(String gender, String name, int age, String address, String email, String vehicleModel, String busNumber){
		super(gender, name, age, address, email);
		this.vehicleModel =  vehicleModel;
		this.busNumber = busNumber;
	}
	
}

