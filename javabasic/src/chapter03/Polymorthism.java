package chapter03;

class Animal{
	String ears; // 눈
	String eyes; // 귀
	String legs; // 다리
	 
}

class Bird extends Animal{
	 String wings; // 날개
	
}

class Monkey extends Animal{
	private String arms; // 팔
	
	Monkey(){
		
	}
	
	Monkey(String arms, String eyes, String ears, String legs){
		this.arms = arms; // this : 해당클래스
		super.eyes = eyes; // super : 상위클래스
		super.ears = ears;
		super.legs = legs;
	}
}


public class Polymorthism {
public static void main(String[] args) {
	Animal bird = new Bird(); // Bird 생성자로 생성되었기 때문에 다 가지고 있지만 쳐다보고 있는 (참조)변수는 Animal임
								// 근데 이렇게 bird를 생성했을 때는 bird 속성은 볼 수 없고 Animal의 속성만 볼 수 있다고 함 왜 그런거지?
	bird.eyes = "ear";
	bird.legs = "eye";
	bird.legs = "leg"; 
	//Animal animal = new Animal();
	//animal.
	// Bird bird2 = bird; // 이렇게는 못씀
	Bird bird2 = (Bird)bird; // 강제로 지정해줌
	bird2.wings ="wing";
	
	//Bird bird3 = new Bird();
	
	Monkey monkey1 = new Monkey("arm", "eyes", "ears", "legs");
	System.out.println(monkey1);
	System.out.println(monkey1.ears);
	System.out.println(monkey1.eyes);
	System.out.println(monkey1.legs);
	
	Animal animal1 = monkey1; // monkey1을 animal1에 넣었음
	
	
	System.out.println(animal1); // 이렇게  하면 메모리주소가 나옴
	System.out.println(animal1.ears); // chapter03.Monkey@2133c8f8 : chapter03에 Monkey클래스로 만들어진 얘(메모리주소)다하고 알려줌
	System.out.println(animal1.eyes);
	System.out.println(animal1.legs);

	System.out.println(animal1 instanceof Monkey);
	System.out.println(animal1 instanceof Animal);
	
	Monkey monkey2 = (Monkey) animal1;
	System.out.println(monkey2.ears);
	System.out.println(monkey2.eyes);
	System.out.println(monkey2.legs);
}
	
}
