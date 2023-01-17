package chapter03;

class AnimalType{
	 String animalName;
	 String eyesNumber;
	 String legsNumber;
	
	void walk() {
		System.out.println("동물은 나는 동물도 있고 기어다니는 동물도 있고 걸어다니는 동물도 있습니다");
	}
	
	
}

class Eagle extends AnimalType{
	 AnimalType animaltype;
	 String wingsNumber;
	 
	 
	
	
	
	Eagle(){
		
	}
	
	void fly() {
		System.out.println("날아 다닙니다");
	}
}

class Lion extends AnimalType{
	 AnimalType animaltype;
	 String legsNumber;
	
	
	Lion(){
		
	}
	
	void walk() {
		System.out.println("기어 다닙니다");
	}
}




public class Test01 {
	public static void main(String[] args) {
		AnimalType eagle = new Eagle();
		eagle.
		
		
		
	}
}
