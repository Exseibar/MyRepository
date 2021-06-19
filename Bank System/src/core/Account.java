package core;

public class Account {

	private int id;
	private float balance;

	public Account(int id, float balance) {
		this.id = id;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public float getBalance() {
		return balance;
	}
//	public void setBalance(Log l) { // log this operation
//		
//	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", balance=" + balance + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj == null || !(obj instanceof Account)) {
			return false;
		}
		Account other = (Account) obj;
		if(id != other.getId()) {
			return false;
		}
		return true;
	}

}
