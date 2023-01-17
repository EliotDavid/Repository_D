package chapter03;

//import chapter03.util.UtilExample01;

import chapter03.util.*;
import static java.lang.Math.PI; // static으로 되어있는 변수를 불러오려고 할 때 앞에 import static을 해서 불러올수 있음
import static java.lang.Math.*;

//import static final chapter03.util.UtilExample01.NUMBER;

// import.chapter03.util.* : chapter03의 util에 있는(chapter03.util) 모든 클래스를 다 끌어다쓸 수 있음 

public class Example01 {

	public static void main(String[] args) {
		UtilExample01 util = new UtilExample01();
		System.out.println(PI);
		System.out.println(E);
	}

}
