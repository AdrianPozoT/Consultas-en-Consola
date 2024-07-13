package demo_jdbc.models;

public class Circuit {
	
	private int circuit_id;
	private String circuit_ref;
	private String name;
	private String location;
	private String country;
	private float lat;
	private float lng;
	private int alt;
	private String url;
	
	
	
	
	public Circuit(int circuit_id, String circuit_ref, String name, String location, String country, float lat, float lng,
			int alt, String url) {
		super();
		this.circuit_id = circuit_id;
		this.circuit_ref = circuit_ref;
		this.name = name;
		this.location = location;
		this.country = country;
		this.lat = lat;
		this.lng = lng;
		this.alt = alt;
		this.url = url;
	}




	public int getCircuitid() {
		return circuit_id;
	}




	public void setCircuitid(int circuit_id) {
		this.circuit_id = circuit_id;
	}




	public String getCircuitref() {
		return circuit_ref;
	}




	public void setCircuitref(String circuit_ref) {
		this.circuit_ref = circuit_ref;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getLocation() {
		return location;
	}




	public void setLocation(String location) {
		this.location = location;
	}




	public String getCountry() {
		return country;
	}




	public void setCountry(String country) {
		this.country = country;
	}




	public float getLat() {
		return lat;
	}




	public void setLat(float lat) {
		this.lat = lat;
	}




	public float getLng() {
		return lng;
	}




	public void setLng(float lng) {
		this.lng = lng;
	}




	public int getAlt() {
		return alt;
	}




	public void setAlt(int alt) {
		this.alt = alt;
	}




	public String getUrl() {
		return url;
	}




	public void setUrl(String url) {
		this.url = url;
	}




	@Override
	public String toString() {
		return "Circuit [circuit_id=" + circuit_id + ", circuit_ref=" + circuit_ref + ", name=" + name + ", location="
				+ location + ", country=" + country + ", lat=" + lat + ", lng=" + lng + ", alt=" + alt + ", url=" + url
				+ "]";
	}

	

	

}
