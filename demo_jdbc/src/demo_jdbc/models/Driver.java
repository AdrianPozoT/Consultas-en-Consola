package demo_jdbc.models;

public class Driver {

	private int driverId;
	private String driveRef;
	private int number;
	private String code;
	private String forename;
	private String surname;
	private String dob;
	private String nationality;
	private String url;
	
	
	public Driver(int driverId, String driveRef, int number, String code, String forename, String surname, String dob,
			String nationality, String url) {
		super();
		this.driverId = driverId;
		this.driveRef = driveRef;
		this.number = number;
		this.code = code;
		this.forename = forename;
		this.surname = surname;
		this.dob = dob;
		this.nationality = nationality;
		this.url = url;
	}


	public int getDriverId() {
		return driverId;
	}


	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}


	public String getDriveRef() {
		return driveRef;
	}


	public void setDriveRef(String driveRef) {
		this.driveRef = driveRef;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getForename() {
		return forename;
	}


	public void setForename(String forename) {
		this.forename = forename;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public String getNationality() {
		return nationality;
	}


	public void setNationality(String nationality) {
		this.nationality = nationality;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	@Override
	public String toString() {
		return "Driver [driverId=" + driverId + ", driveRef=" + driveRef + ", number=" + number + ", code=" + code
				+ ", forename=" + forename + ", surname=" + surname + ", dob=" + dob + ", nationality=" + nationality
				+ ", url=" + url + "]";
	}
	
	
	
	
	
	
	
	
}
