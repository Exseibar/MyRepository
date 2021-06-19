package core;

public class WithdrawException extends Exception {
	
	private int clientId;
	private float currentBalance;
	private float withdrawAmount;
	
	public WithdrawException(String Message, int clientId, float currBalance, float withdrawAmount) {
		
		this.clientId = clientId;
		this.currentBalance = currBalance;
		this.withdrawAmount = withdrawAmount;
	}
	public int getclientId() {
		return clientId;
	}
	public float getCurrentBalance() {
		return currentBalance;
	}
	public float getWithdrawAmount() {
		return withdrawAmount;
	}
}
