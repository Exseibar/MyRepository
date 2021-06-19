package core;

import java.util.Iterator;

public abstract class Client {
	    
	private final int MAX_SIZE = 5;
		private int id;
	    private String name;
	    private float balance;
	    private Account[] accounts;
	    protected float commissionRate = 0;
	    protected float interestRate = 0;
	    private Logger logger;

	    public Client(int id, String name, float balance){
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
	                return;
	            }
	        }
	    }

	    public Account getAccount(int index) {
	        for(int i = 0 ; i < accounts.length; i++) {
	            if (i == index){
	                return accounts[index];
	            }
	        }
	       return null;
	    }

	    public void removeAccount(Account acc) {
	        for(int i = 0; i < accounts.length; i++){
	            Account account = accounts[i];		
	            if(account != null && account.equals(acc)){	
	                balance += account.getBalance();
	                accounts[i] = null;
	                return;							
	            }
	        }
	    }

	    public void deposit(float amount) {
	    	this.balance += amount;
	    }

	    public void withdraw(float amount) { 
	    	this.balance -= amount;
	    	float commission = amount * commissionRate;
	    	Bank.addCommission(commission);
	    	this.balance -= commission;
	    }

	    public void autoUpdateAccount() {
	        // run over the accounts and calculate the amount to according to client
	        // interest.
	    }
		public float getFortune() {
			float fortune = this.balance;
			for (int i = 0; i < accounts.length; i++) {
				Account account = accounts[i];
				if(account != null) {
					fortune += account.getBalance();
				}
			}
			return fortune;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj) {
				return true;
			}
			if (obj == null || !(obj instanceof Client)){
				return false;
			}
			Client other = (Client) obj;
			if (id != other.id) {
				return false;
			}
			return true;
		}
		

	}