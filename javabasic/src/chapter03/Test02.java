package chapter03;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;


class Batch1 extends TimerTask{ // TimerTask는 뭐 자바에서 제공하는 클래스인가?

	@Override
	public void run() { // run이라는 애를 오버라이드해서 받아와야 함
		System.out.println("Batch1 동작");
		
	}
	
}

class Batch2 extends TimerTask{

	@Override
	public void run() { // run이라는 애를 오버라이드해서 받아와야 함
		System.out.println("Batch2 동작");
		
	}
	
}



public class Test02 {

	public static void main(String[] args) {
		
		Date date = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.println(sdf1.format(date));
		System.out.println(sdf2.format(date));
		
		
		//java.time 패키지의 하위 패키지 
		
		
		// Date 클래스와 Calendar 클래스의 단점을 보완한 java.time 패키지의 클래스
		// * LocalDate는 이렇게 생성을 함 
		LocalDate localDate = LocalDate.now(); 
		System.out.println(localDate.toString()); 
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime); // 시 : 분 : 초.나노초단위
		LocalDateTime localDateTIme = LocalDateTime.now();
		System.out.println(localDateTIme); // 연-월-날짜/T:(타입의 약자)/ 시 : 분 : 초.나노초단위
		
		LocalDateTime localDateTimeOf = LocalDateTime.of(2022, 11, 25, 8, 20); // 이거는 11월을 11로 적으면 진짜 11월로 나옴
		System.out.println(localDateTimeOf.toString()); 
		
		
		System.out.println(localDateTIme.getMonth()); // getMonth()는 문자열로 나오고 getMonthValue()가 숫자로 나옴
		
		localDateTIme.minusYears(10).plusMonths(5); // minusYears()에서 연산된 값에서 또 한 번 저 메서드만큼 연산을 해라라는 뜻임 // 대신 맨 뒤의 메서드는 localDateTime객체가 내뱉는 인스턴스로 동일해야 됨
	
		// isAfter() 오늘이 이전의 날짜인지 비교하여 boolean값 반환
		
		
		
		
		
		//** Time / Time Task
		// 개발자가 원하는 특정한 시간에 코드를 실행하거나 특정 시간간격으로  반복되는 작업을 가능하게 함
	 	
		Batch1 batch1 = new Batch1();
		Batch2 batch2 = new Batch2();
		
		Timer timer = new Timer(true); // java.util에 있는 timer 임폴트
		timer.schedule(batch1, 5000); // 읽은 기준으로 5초 후에
		timer.schedule(batch2, 3000); // 읽은 기준으로 3초후에
		/*
		try {
			Thread.sleep(10000);// main이라는 스레드가 존재하는데 프로그램이 진행하지않고 10초동안 기다리고 있어야된다는 뜻 // 10초를 기다린다는 뜻 / 10000 밀리언초로 표기된건가?
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		*/
		
		
		// * Decimal Text Format
		// java.text에 있는 걸 임폴트해야됨
		DecimalFormat decimalFormat = new DecimalFormat("##,, ##.##");
		System.out.println(decimalFormat.format(50000.55));
	}

}
