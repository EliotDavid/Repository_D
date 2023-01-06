package chapter02.entity;

//import chapter02.entity.PersonalInfo;

public class Developer {

		private PersonalInfo personalInfo;
		
		String languageSkill; // 어떤 언어를 다룰 수 있는지 언어 스킬
		String company; // 회사명
		String developerPosition; // 개발 포지션
		
		Developer(){
			
		}
		
		Developer(String gender,
				String name,
				int age,
				String address,
				String email,
				String languageSkill,
				String company,
				String developerPosition){
			//super(gender, name, age, address, email);
			new PersonalInfo(gender, name, age, address, email);
			this.languageSkill = languageSkill;
			this.company = company;
			this.developerPosition = developerPosition; 
			
			// 일반적으로 
			// 같은 데이터타입에 같은 변수명으로 new 연산자명으로 계속해서 새로운 객체들을 생성할 수 있는 이유는 
			// 만약 Developer dv = new Developer();로 객체로 계속해서 생성할 수 있는 이유는
			// dv라는 변수명의 객체가 생성되는데 이 dv라는 변수명은 메서드가 실행될 때 메서드영역에만 잠시 존재하는거고
			// dv라는 변수가 메서드를 빠져나가면(메서드가 종료되면) 이 dv라는 이름의 변수명은 사라진다고 함
			// 근데 그 dv라는 변수명으로 만든 인스턴스는 heap 영역에 남아있다고 함 
			// 그래서 또 dv라는 변수명으로 객체를 만들면 이 dv는 다시 새로운 변수명으로 인식하는거고 
			// 이 dv라는 이름으로 다시 new 인스턴스해서 객체를 만들면 이 객체는 이전에 dv이름으로 만든 객체와는 다른 새로운 객체가 되는거고 
			// 이 2회차 dv 객체 또한 변수명은 메서드가 실행될 때만 존재하는거고 메서드가 종료되면 dv라는 변수이름은 사라지지만 dv이름으로 2회차 객체를 만든 그 인스턴스는 heap영역에 또 다른 인스턴스로 저장된다고 함
			// 그래서 2회차 객체 인스턴스는 1회차 객체 인스턴스와는 서로 다른 속성을 가진 객체?인스턴스?로 남게 됨
			// 1회차 인스턴스 옆에 2회차 인스턴스 저장되는 식임. 그러면 힙영역에는 현재 2개의 서로 다른 속성을 가진 객체가 존재하고 있는 상태임
			// 그래서 이 1회차 인스턴스오 ㅏ2회차 인스턴스는 서로 다른 속성을 가지고 있으므로 서로 다른 객체임
			// 일단 이 설명은 : 그래서 heap영역에는 현재 2개의 인스턴스가 존재하는 상태임
		
		}
		
		// ** getter / setter
		public String getLanguageSkill() {
			return languageSkill;
		}

		public void setLanguageSkill(String languageSkill) {
			this.languageSkill = languageSkill;
		}

		public String getCompany() {
			
			return company;
		}

		public void setCompany(String company) {
			this.company = company;
		}

		public String getDeveloperPosition() {
			return developerPosition;
		}

		public void setDeveloperPosition(String developerPosition) {
			this.developerPosition = developerPosition;
		}

		
		// * 일반 메서드 
		// 이거는 오버라이딩 된 게 아니라 오버로딩 된 상태라고 함
		void eatBreakfast(int time) { // 상속관계에서 오버라이딩을 해줄 땐 부모클래스의 메서드이름과 같아야 함 그리고 출력결과는 자식 메서드의 내용이 나옴 // 오버라이딩 : 똑같이 덮어씌운다라는 의미임
			System.out.println(personalInfo.getName() + "은 " + time + "시에 밥을 먹습니다.");
		}
		
		public List<Developer> print(){
			return 
		}
		
		/*
		public String getLanguageSkill() {
			return languageSkill;
		}
		public void setLanguageSkill(String languageSkill) {
			this.languageSkill = languageSkill;
		}
		public String getCompany() {
			return company;
		}
		public void setCompany(String company) {
			this.company = company;
		}
		public String getDeveloperPosition() {
			return developerPosition;
		}
		public void setDeveloperPosition(String developerPosition) {
			this.developerPosition = developerPosition;
		}
		*/
		

		/*
		Developer(String gender, String name, int age, String address, String email, String company){
			// super() : 슈퍼클래스의 생성자
			super(String gender, String name, int age, String address, String email, String company);
			this.company = company;
		}
		*/
	}
