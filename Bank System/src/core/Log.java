package core;

public class Log {

	private long timeStamp;
	private int clientId;
	private String description;
	private float amount;

	public Log(long timeStamp, int clientId, String description, float amount) {
		this.timeStamp = timeStamp;
		this.clientId = clientId;
		this.description = description;
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Log [timeStamp=" + timeStamp + ", clientId=" + clientId + ", description=" + description + ", amount="
				+ amount + "]";
	}

}
