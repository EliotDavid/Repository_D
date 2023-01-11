package chapter02;

class MyMath{
	// 정삼각형넓이 공식 함수 
	static double getEquilateralTriangleArea(double side) {
		// 매개변수 검증
		if(side <= 0) { // side에 0과 음수는 올 수 없다고 함
			return 0;
		}
		double result = (Math.sqrt(3) / 4) * Math.pow(side, 2);  
		return result;
	}
	
	// 정삼각형의 높이 구하는 공식 메서드
	static double getEquilateralTriangleHeight(double side) {
		// 매개변수 검증
		if(side <= 0) return 0;
		
		double equilateralTriangleHeight = (Math.sqrt(3) / 2) * side;
		return equilateralTriangleHeight;
	}
	
	// 1증가
	static int increase(int number) {
		number++;
		System.out.println("In of Method");
		System.out.println(number);
		return number;
	}
	
	static void increaseTriangle(Triangle triangle) {
		triangle.base++;
		triangle.height++;
		triangle.diagonal++;
	}
}


public class Example03 {

	public static void main(String[] args) {
		double side = 10.0;
		double equilateralTriangleArea = MyMath.getEquilateralTriangleArea(side);
		System.out.println(equilateralTriangleArea);
		double equilateralTriangleHeight = MyMath.getEquilateralTriangleHeight(-10);
		System.out.println(equilateralTriangleHeight);

		int number = 10;
		int afterNumber = MyMath.increase(number);
		System.out.println("Out of Method");
		System.out.println(number);
		number = MyMath.increase(number);
		
		Triangle triangle = new Triangle();
		triangle.createAndPrint();
		
		MyMath.increaseTriangle(triangle);
		System.out.println(triangle.base); // 참조변수가 참조하고 있는 메모리주소는 바뀌지 않았지만 참조변수가 참조하고 있는 메모리주소에 있는 값들은 실제로 변경되었음
		System.out.println(triangle.height);
		System.out.println(triangle.diagonal);
						
	
	}
	

}
