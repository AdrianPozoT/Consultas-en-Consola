package demo_jdbc.models;

import java.time.Year;

public class Race {
	private int race_Id;
	private int year;
	private int round;
	private int circuit_Id;
	private String name;
	private String date;
	private String time;
	private String url;
	
	public Race(int race_Id, int year, int round, int circuit_Id, String name, String date, String time, String url) {
		super();
		this.race_Id = race_Id;
		this.year = year;
		this.round = round;
		this.circuit_Id = circuit_Id;
		this.name = name;
		this.date = date;
		this.time = time;
		this.url = url;
	}

	public int getRaceId() {
		return race_Id;
	}

	public void setRaceId(int raceId) {
		this.race_Id = race_Id;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getRound() {
		return round;
	}

	public void setRound(int round) {
		this.round = round;
	}

	public int getCircuit_Id() {
		return circuit_Id;
	}

	public void setCircuitId(int circuit_Id) {
		this.circuit_Id = circuit_Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Race [race_Id=" + race_Id + ", year=" + year + ", round=" + round + ", circuit_Id=" + circuit_Id + ", name="
				+ name + ", date=" + date + ", time=" + time + ", url=" + url + "]";
	}
	
	
	
	
	
	
}
