package a;

public class Client {

	private int id;
	private String name;
	private float balance;
	private Account[] accounts;
	private float commissionRate = 0;
	private float interestRate = 0;
	private Logger logger;
	private final int MAX_SIZE = 5;

	public Client(int id, String name, float balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
		accounts = new Account[MAX_SIZE];
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public float getBalance() {
		return balance;
	}

	public Account[] getAccount() {
		return accounts;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public void addAccount(Account[] accounts) {

		for (int i = 0; i < MAX_SIZE; i++) {
			if (accounts[i] == null) {
				accounts[i] = new Account(id, balance);
			}
		}
	}

	public Account getAccount(int index) {
		return accounts[index];
	}

	public void removeAccount(int id) {
		// remove specified account with the same id from the account array and assign
		// "null"
		// in the array[position] then transfer the money the client balance.
		// create a Log object with appropriate data and send it to Logger.log() method.
	}

	public void deposit(float money) {
		// add money to the client balance
	}

	public void withdraw(float money) {
		// remove money from the client balance.
	}

	public void autoUpdateAccount() {
		// run over the accounts and calculate the amount to according to client
		// interest.
	}
//	public float getFortune() { 
//		return // sum of the client balance + total account balance
//	}

}
