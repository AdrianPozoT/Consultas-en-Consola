package demo_jdbc.models;

public class Constructor_Standings {

	private int constructorStandingId;
	private int raceId;
	private int constructorId;
	private int points;
	private int position;
	private String positionText;
	private int wins;
	
	public Constructor_Standings(int constructorStandingId, int raceId, int constructorId, int points, int position,
			String positionText, int wins) {
		super();
		this.constructorStandingId = constructorStandingId;
		this.raceId = raceId;
		this.constructorId = constructorId;
		this.points = points;
		this.position = position;
		this.positionText = positionText;
		this.wins = wins;
	}

	public int getConstructorStandingId() {
		return constructorStandingId;
	}

	public void setConstructorStandingId(int constructorStandingId) {
		this.constructorStandingId = constructorStandingId;
	}

	public int getRaceId() {
		return raceId;
	}

	public void setRaceId(int raceId) {
		this.raceId = raceId;
	}

	public int getConstructorId() {
		return constructorId;
	}

	public void setConstructorId(int constructorId) {
		this.constructorId = constructorId;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public String getPositionText() {
		return positionText;
	}

	public void setPositionText(String positionText) {
		this.positionText = positionText;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	@Override
	public String toString() {
		return "Constructor_Standings [constructorStandingId=" + constructorStandingId + ", raceId=" + raceId
				+ ", constructorId=" + constructorId + ", points=" + points + ", position=" + position
				+ ", positionText=" + positionText + ", wins=" + wins + "]";
	}
	
	
	
	
}
