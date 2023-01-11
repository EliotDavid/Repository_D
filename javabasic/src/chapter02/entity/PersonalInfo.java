package chapter02.entity;

public class PersonalInfo {

	
	// ** 필드
		private String gender; // 성별
		private String name; // 이름
		private int age; // 나이
		private String address; // 사는 곳
		private String email; // 이메일
		
		// 기본생성자
		
		PersonalInfo(){
			
		}
		
		
		
		// 복사생성자
		PersonalInfo(String gender,
				String name,
				int age,
				String address,
				String email){
			this.gender = gender;
			this.name = name;
			this.age = age;
			this.address = address;
			this.email = email;
		}
		
		
		

		
		// ** Getter / Setter
		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
		

		// 일반 메서드
		void eatBreakfast() {
			System.out.println("7시에 아침밥을 먹습니다.");
		}
		
}
