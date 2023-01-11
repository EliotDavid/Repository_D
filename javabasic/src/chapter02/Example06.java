package chapter02;

// ** 상속에 들어가기전에 상속을 적용하는 이유를 알아야 되서 일단 날코딩을 한 번 해봄


// 직업들에 관련된 클래스를 만듬(서로 완전 반대되는 직군들임)

// 유지 / 보수 / 변경 / 삭제




public class Example06 {

	public static void main(String[] args) {
	
		Developer developer = new Developer("남자", "홍길동", 43, "부산시 서면", "1005@email.com", "영어", "삼성", "소프트웨어 엔지니어");
		Police police = new Police("남자", "임꺽정", 33, "양산시 중부동", "angel@hanmail.com", "중부동", "경사");
		BusDriver busDriver = new BusDriver("남자", "이순신", 53, "양산시 남부동", "busdriverdosa@hanmail.com", "시내버스", "128-1");
		//Developer developer = new Developer(null, null, null); // 얘랑 밑에랑 무슨 차이지? 똑같은 코드 아닌가? 아 위에는 필드만 null값으로 해준다는거고 밑에는 아예 인스턴스 자체의 모든 데이터를 없앤다는 뜻인가?
		//developer = null; // ** 이걸 실행시키면 코드상에는 문제가 없지만 예외가 발생함 (널포인트익셉션) : 얘가 실제로 가리키고 있는 주소가 없기 때문에  
		developer.languageSkill ="";
		System.out.println(developer.getGender());
		System.out.println(developer.getName());
		System.out.println(developer.getAge());
		System.out.println(developer.getAddress());
		System.out.println(developer.getEmail());
		System.out.println(developer.getLanguageSkill());
		System.out.println(developer.getCompany());
		System.out.println(developer.getDeveloperPosition());
		
		
		
		
		System.out.println(police.getGender());
		System.out.println(police.getName());
		System.out.println(police.getAge());
		System.out.println(police.getAddress());
		System.out.println(police.getEmail());
		System.out.println(police.getDistrict());
		System.out.println(police.getOfficePosition());
		/*
		System.out.println(police.getLanguageSkill());
		System.out.println(developer.getEmail());
		System.out.println(developer.getEmail());
		
		
		
		
		System.out.println(developer.getGender());
		System.out.println(developer.getName());
		System.out.println(developer.getAge());
		System.out.println(developer.getAddress());
		System.out.println(developer.getLanguageSkill());
		System.out.println(developer.getEmail());
		System.out.println(developer.getEmail());
		*/
	}

}
