package chapter02;

class Manufacturer{
	// 제조사명
	String name;
	// 제조사 국가
	String nation;
	// 제조사 홈페이지 주소
	String webUrl;
	
	void print() {
		System.out.println("name : " + name + " nation : " + nation + " webUrl : " + webUrl);
		print();
	}
}


class Car{
	// ** Car에 어떤 속성들이 있는지 보자
	
	// 제조사
	Manufacturer manufacturer; // String brand에서 클래스 데이터타입으로 Manufacturer로 바꿨음 == has a 관계 
	
	// 외장컬러
	String exteriorColor;
	// 내장컬러
	String interiorColor;
	// 모델명
	String modelName;
	
	Manufacturer creatManufacturer( // 실행이 되면 메모리에 나타났다가 메모리에서 사라짐
			String name,
			String nation,
			String webUrl)
	{
		Manufacturer manufacturer = new Manufacturer(); // 변수 이름은 똑같이 선언이 안되는데 여러개의 객체를 만들 떄 하나의 객체 이름으로 계속해서 만들 수 있는거는 함수 실행 및 종료 원리(실행될 떄 잠시 나타났다가 종료될 때 다시 사라짐 그래서 이 manufacturer이라는 객체가 heap? 메모리?에 계속해서 남아있지 않음)때문에와 new 인스턴스() 원리 때문임
														// 함수는 실행되면 실행될 때만 메모리에 나타났다가 함수가 종료되는 시점에는 메모리에서 사라지기 때문에 하나의 변수이름만으로도 여러 객체를 생성할 수 있는건가?
		manufacturer.name = name;
		manufacturer.nation = nation;
		manufacturer.webUrl = webUrl;
		
		System.out.println(manufacturer); // 객체는 참조데이터타입이므로 메모리주소가 뜸
		return manufacturer;
	}
	
	
}

public class Example04 {

	public static void main(String[] args) { // 그럼 여기 메모리의 manufacturer 객체는 어떤 상태인가? 
											 // 밑에 hyundai, korea, hyundai.com이라고 주입시켜놨기 때문에 fix된 상태라고 볼 수 있는데
											 // 이 영역에서는 manufacturer라는 이름으로 더 이상 객체를 만들 수 없다
											 // 그 이유는 main이라는 함수의 특성상 때문이고 
										   	 // manufacturer이라는 이름으로 계속해서 새로운 객체를 만들고 싶으면 
											 // 다른 형태(인자형태가 달라야함)의 함수와 메서드가 메모리에 나타났다가 다시 사라지는 형태로 아예 종료되는 메서드로 써야한다
		Car myCar = new Car();
		Manufacturer manufacturer;
		manufacturer = myCar.creatManufacturer("Hyundai", "Korea", "hyundai.com"); // 패킹되었음
		System.out.println("======");
		System.out.println(manufacturer);
		System.out.println(manufacturer.name);
		System.out.println("==========");
		System.out.println();
		//myCar.manufacturer.print();
		
		//Manufacturer manufacturer; // 객체 : 하나의 이름으로 된 객체로 여러 개의 객체를 가지고 싶다할 떄는 배열을 사용해야 한다고 함

	}

}
