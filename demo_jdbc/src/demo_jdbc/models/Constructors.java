package demo_jdbc.models;

public class Constructors {

	private int constructor_Id;
	private String constuctor_Ref;
	private String name;
	private  String nationality;
	private String url;
	
	
	public Constructors(int constructor_Id, String constuctor_Ref, String name, String nationality, String url) {
		super();
		this.constructor_Id = constructor_Id;
		this.constuctor_Ref = constuctor_Ref;
		this.name = name;
		this.nationality = nationality;
		this.url = url;
	}


	public int getConstructorId() {
		return constructor_Id;
	}


	public void setConstructorId(int constructor_Id) {
		this.constructor_Id = constructor_Id;
	}


	public String getConstuctorRef() {
		return constuctor_Ref;
	}


	public void setConstuctorRef(String constuctor_Ref) {
		this.constuctor_Ref = constuctor_Ref;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
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
		return "Constructors [constructorId=" + constructor_Id + ", constuctorRef=" + constuctor_Ref + ", name=" + name
				+ ", nationality=" + nationality + ", url=" + url + "]";
	}
	
	
	
}
