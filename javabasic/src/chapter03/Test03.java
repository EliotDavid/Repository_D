package chapter03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Test03 {

	public static void main(String[] args) {
		// Set 클래스 (Set은 클래스가 아니라고 함 Set은 인터페이스라고함) 
		//java.util에 있는 Set 클래스임
		//가운데<E>가 제네릭임
		// Set<E> set = new Set(); : 얘가 안되는 이유는 Set이 Collection이란 인터페이스를 상속받고 있어서 클래스여도 결국 인터페이스로부터 상속을받고 있어서 결국 Set도 인터페이스여서 생성을 할 수 없음
		//Set<E> set = new Set<E>();
	
		// HashSet : 정렬기능이 없고 
		// TreeSet : 정렬기능이 들어있다
		
		Set<String> set = new HashSet<String>(); // 임폴트해줘야함

		// set 구조에 데이터를 추가
		
		set.add("apple");
		set.add("carrot");
		set.add("apple");
		set.add("banana");
		set.add("apple");
		
		//Array나 배열 같은 경우 순서가 존재하기 때문에 인덱스로 접근할수 있는데
		//set은 순서가 없기 때문에 인덱스로 접근불가능함
		//set[0]; //에러
		
		// 그러면 어떻게 접근해야되냐?
		// ** Iterator로 set 컬렉션에 접근해줘야함
		// Set(HashSet이든 TreeSet이든 Set자체는 중복되어있는 데이터를 제거하고 한개의 값으로만 출력을함
		Iterator<String> hashSetIterator = set.iterator();//컬렉션 인터페이스에있는 이터리에터로 
		
		// ** Iterator의 hasNext() 메서드로 다음 요소가 있는지 확인하는데, 지금 이 코드는 메서드로 다음 요소가 있으면 반복
		while(hashSetIterator.hasNext()) { //hasNext():
			// **Iterator의 next() 메서드로 다음 요소를 가져옴
			System.out.println(hashSetIterator.next());
		} // banana, apple, carrot이 뜸. 순서가 없이 무작위로 들어감  

		
		
		System.out.println("====================");
	
		Set<String> treeSet = new TreeSet<String>();
		
		treeSet.add("hello");
		treeSet.add("apple");
		treeSet.add("carrot");
		treeSet.add("apple");
		treeSet.add("banana");
		treeSet.add("apple");
	
		Iterator<String> treeSetIterator = treeSet.iterator();
		while(treeSetIterator.hasNext()) {
			System.out.println(treeSetIterator.next());
		} // ** 실행하면 정렬이되어있는상태로 출력이됨 (이렇게 위에서 treeset에 무작위로 넣어도 알파벳순으로 정렬되어 출력이되는거 같은데 맞나? 일단 정렬되어서 출력되는건 맞음) 
		
		//  size()메서드로 길이 혹은 크기를 가져옴
		System.out.println(treeSet.size());
		
		System.out.println("============");
		
		
		// ** List Interface(List는 인터페이스임)
		// java.util에 있는 List인터페이스 임폴트해줘야함
		List<Integer> numbers = new ArrayList<Integer>(); // 제네릭위치 : 특정한 객체 타입을 쓰겠다하고 넣어주는 자리 
												  // 제네릭자리에는 기본형 타입을 넣을 수 없음
												  // 만약 기본형 int를 쓰고 싶으면 Integer를 써야함 	
		numbers.add(2);
		numbers.add(9);
		numbers.add(-1);
		numbers.add(50);
		
		// 특정한 위치에 특정 데이터를 원하는 위치에 넣을수 있음
		numbers.add(2, 100); // 2번인덱스에 100이란 값을 삽입한다는 뜻
		
		// 특정한 위치에 데이터를 변경할 수 있음
		// 만약 -1 값이 들어있는 1로 바꿔라라고 하고 싶다면
		numbers.set(3, 1); // 3번인덱스의 값을 1이란 값으로 변경해라는 뜻
							// 그러면 2, 9, 100, 1, 50인 상태가 됨
		
		// 특정한 위치에 있는 데이터를 제거도 가능함
		// 만약 0번 인덱스에있는 2의 값을 제거하고 싶다면
		numbers.remove(0);
		System.out.println(numbers.size());
		
		
		
		
		// ** List는 순서가 존재함
		for(Integer number : numbers) {
			System.out.println(number);
		} // ** 넣은대로 출력됨
		
		
		
		// ** ArrayList : 요소를 추가하면 0번 인덱스부터 차례대로 배정이됨 
		// 원하는 위치에 요소를 추가하거나 삭제 또는 반환할 수 있음 
		
		// LinkedList : 인터페이스임
		// List 인터페이스를 구현하면서 Queue 인터페이스도 함께 구현
		// 각 요소가 자신의 이전 요소의 주소와 다음 요소의 주소를 가지고 있음(요소들이 유기적으로 연결되어 있음) 
		
		 
		
		// ** LinkedList
		/*
		List<String> arraylist = new ArrayList<String>();
		List<String> linkedlist = new LinkedList<String>();
		
		long start = System.currentTimeMillis();
		
		for(int i = 0; i < 200000; i++) {
			arraylist.add(0, String.valueOf(i));
		}
	
		long end = System.currentTimeMillis();
		System.out.println("ArrayList 작업시간 : " + (end - start));
		
		
		start = System.currentTimeMillis();
		
		for(int i = 0; i < 2000000000; i++) {
			linkedlist.add(0, String.valueOf(i));
		}
	
		end = System.currentTimeMillis();
		System.out.println("LinkedList 작업시간 : " + (end - start));
		
		*/
		
		
		// ** ArrayList
		
		
		
		// ** List하고 Map은 자주 쓰인다고 함
	
		// * Map : 키와 값을 쌍으로 저장하는 구조 
		// * key / value 
		// 일반 배열같은 경우에는 순서로 저장
		// 열쇠, 나이, 주소 : key
		
		// key가 만약
		// 열쇠
		// 나이
		// 주소
		// 있으면 
		// 중복되는 key값은 제거하고 한개의 key로 알려줌
		
		// * Map도 순서가 없음
		// 그래서 인덱스를 사용해서 접근불가능
		
		
		
		// ** Map Interface
		// Map은 제네릭을 2개를 받아야함
		//Map도 java.util에 있음
		Map<String, String> hashMap = new HashMap<String, String>();
		
		// hash map에 데이터를 추가할 땐 put 메서드임
		hashMap.put("key", "value"); // 첫번째 인자값 : key, 두번째 인자값 : value
		hashMap.put("name", "John Doe"); // 이렇게 하면 하나의 쌍으로 들어감
		hashMap.put("address", "united stated");
		
		
		// 얘들을 출력을 하면 아래처럼 하면됨
		// hash map에서 특정한 키에 해당하는 값을 가져옴
		System.out.println(hashMap.get("name")); // key가 name에 해당하는 애의 value를 가져올거다라는 의미
		
		Set<String> keys = hashMap.keySet(); // 
		Iterator<String> keyIterator = keys.iterator(); // keys의 iterator로 가져옴
		
		while(keyIterator.hasNext()) { // keyIterator에 다음값이 존재한다면
			System.out.println(keyIterator.next());
		}
		
		if(hashMap.containsKey("age")) {
			System.out.println(hashMap.get("age")); // age는 존재하지않는 key라서 null이 나옴
													// age라는 이름의 key가 존재하지않는다면 null이 나옴
		}
		
		
		
		
	}
}
