package chapter03;

// ** 추상 클래스

// 추상 클래스 : 클래스를 추상적으로만 표현해둔 클래스
// abstract 제어자를 포함
abstract class Animal2{
	String eyes;
	String ears;
	String legs;
	
	// ** 추상 메서드 
	// 해당 메서드에 대해서 abstract 접근제한자 붙여주고 구현부없이 선언부만 적어둔 메서드
	abstract void eat(); 
	
}
	
class Dog extends Animal2{ // eat메서드를 구현하지 않았을 때 Dog 클래스명에 빨간줄 뜨는 이유: eat이라는 메서드를 무조건 구현해라는 의미에서 컴파일 오류가나는거라고함
	String tail;
	
	void eat() {
		System.out.println("사료를 먹습니다.");
	}
}


public class Abstract {

	public static void main(String[] args) {
		
		//Animal2 animal = new Animal2(); // 이렇게 하면 컴파일 오류나는데 그 이유는 완성되지 않았기 떄문이라고하는데 뭐가 완성되지 않았다는 뜻이지?
		// 
		Dog dog = new Dog();
		dog.eat();
		
	}

}
