package chapter03;


// ** 인터페이스
// 추상도가 가장 큰 설계도
// 일반 메서드, 멤버 변수는 사용 불가능
// static final로 선언된 상수와 abstract로 선언된 추상 메서드만 가질 수 있음


public interface IExample01 {
	// 인터페이스에서는 static final로 선언된 상수만 선언가능
	public static final int NUMBER = 0;
	
	/* 이렇게 선언 불가능
	void hello(){{
		System.out.println("Hello");
	}
	*/
	
	
	// static : 인스턴스없이 메모리로 올라감
	// 그리고 static으로 선언된 것은 갖다 쓰는 건 됨
	// 인터페이스에서는 추상메서드만 선언가능
	
	
	void hello(); // 구현부가 없으면 무조건 추상메서드라고 인식함
	
	
}


// 인터페이슨느 인터페이스만 상속가능
// ** 인터페이스의 상속
// ** 추상화가 되어있는 애이기 때문에 무조건 상속을 해줄 수 있음
// 인터페이스에 상속을 하려면 extends 써서 상속을 해줄수 있음
// 인터페이스는 다중상속이 가능
// 인터페이스는 모든게 추상적인 애라서 인스턴스 그 자체로 생성을 할 수 없음
// 인터페이스를 생성하려면 인터페이스를 구현하는 클래스를 만들어야 생성할 수 있음
interface IExample02 extends IExample01, IExample03{ // 이렇게 2개를 상속받을 수도 있음
	// 이렇게 하면 IExample01에 선언되어있던 int NUMBER값도 포함할 수 있고 IExample02가 가지고 있던 decimal값도 가질 수 있음
	public static final double decimal = 10.5;
	
}

interface IExample03{
	public static final String STRING = "string";
	
}
// 인터페이스 구현
// 인터페이스를 클래스에 구현할 떄는 implements를 씀
// 얘도 똑같이 얘가 요구하는 모든거를 완성시키지 않았따해서 빨간줄이 뜨는데 여기서 완성해야 될거는 hello밖에없음
class Example implements IExample02{
	int index;
	// 인터페이스에 작성된 추상메서드는 반드시 모두 구현해야함
	public void hello() {
		System.out.println("hello");
		
	}
	
}

// 이렇게 IExample02를 상속받는 클래스를 하나 만들었고
class Example2 implements IExample02{
	
	public void hello() {
		System.out.println("hello");
		
	}
}

class Example3{
	public static void main(String[] args) {
		IExample02 exem1 = new Example();
		IExample02 exem2 = new Example2();
		//exem1.index; // 이런식으로 사용불가능함
					// 인터페이스에 선언된 애만 사용가능함
	
		
	}
}
