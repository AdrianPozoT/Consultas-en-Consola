package demo_jdbc.models;

public class Lap_Times {

	private int raceId;
	private int driverId;
	private int lap;
	private int position;
	private String time;
	private int milliseconds;
	
	public Lap_Times(int raceId, int driverId, int lap, int position, String time, int milliseconds) {
		super();
		this.raceId = raceId;
		this.driverId = driverId;
		this.lap = lap;
		this.position = position;
		this.time = time;
		this.milliseconds = milliseconds;
	}

	public int getRaceId() {
		return raceId;
	}

	public void setRaceId(int raceId) {
		this.raceId = raceId;
	}

	public int getDriverId() {
		return driverId;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}

	public int getLap() {
		return lap;
	}

	public void setLap(int lap) {
		this.lap = lap;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getMilliseconds() {
		return milliseconds;
	}

	public void setMilliseconds(int milliseconds) {
		this.milliseconds = milliseconds;
	}

	@Override
	public String toString() {
		return "Lap_Times [raceId=" + raceId + ", driverId=" + driverId + ", lap=" + lap + ", position=" + position
				+ ", time=" + time + ", milliseconds=" + milliseconds + "]";
	}
	
	
	
}
