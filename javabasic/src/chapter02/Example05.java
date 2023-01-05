package chapter02;

import java.util.ArrayList;
import java.util.List;

// 생성자 & 오버로딩
// 오버로딩 : 같은 이름의 메서드를 매개변수의 상태를 다르게 하여 여러개를 생성 할 수 있또록 함 
class Juice{
	private String name;
	private String company;
	private int Kcal; // 칼로리 
	private int volume; // 양
	
	Juice(){
		
	}
	
	Juice(String name, String company, int Kcal, int volume){ 
		// 여기서 this();를 하면 인자값이 없는 형태의 생성자를 호출함 / 쉽게 말해서 생성자를 호출한다고 생각하면 됨
		
		this.name = name;
		this.company = company;
		this.Kcal = Kcal;
		this.volume = volume;
	}
	
	

	void drink(int ml) {
		System.out.println("int drink");
		volume -= ml;
	}

	void drink(float ml) {
		System.out.println("float drink");
		volume -= ml;
	}
	
	void drink(int ml1, int ml2) {
		System.out.println("int int drink");
		volume -= (ml1 + ml2);
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getKcal() {
		return Kcal;
	}

	public void setKcal(int kcal) {
		this.Kcal = kcal;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	
	

}

public class Example05 {
	
	
	
	public static void main(String[] args) {
		Juice juice = new Juice("콜라", "코카콜라", 200, 1000);  
		System.out.println(juice.getName());
		System.out.println(juice.getCompany());
		System.out.println(juice.getKcal());
		System.out.println(juice.getVolume());
		
		//System.out.println();
		/*
		juice.name = "보성홍차";
		juice.company = "동원";
		juice.Kcal = 0;
		juice.volume = 500;
		
		
		Juice cola = new Juice();
		juice.name = "coke";
		juice.company = "coca-cola";
		juice.Kcal = 0;
		juice.volume = 500;
		*/
		
		List<Juice> jc = new ArrayList<>();
		System.out.println(jc.contains());
				
				
		juice.drink(100);
		juice.drink(20, 30);
		juice.drink(50.5F);
	
	}
	
	

}
