package Database.Entity;

public class UserEntity {
	
	private int id;
	private String passwrod;
	private String name;
	private String telNumber;
		
	
	// ** 생성자
	public UserEntity(int id, String passwrod, String name, String telNumber) {
		this.id = id;
		this.passwrod = passwrod;
		this.name = name;
		this.telNumber = telNumber;
	}
	

	// ** toString 메서드 
	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", passwrod=" + passwrod + ", name=" + name + ", telNumber=" + telNumber + "]";
	}
	
	
	// ** Getter / Setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPasswrod() {
		return passwrod;
	}
	public void setPasswrod(String passwrod) {
		this.passwrod = passwrod;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTelNumber() {
		return telNumber;
	}
	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

	
	


}
