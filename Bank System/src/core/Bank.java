package core;

public class Bank {

	private Client[] clients;
	private Logger logService;
//	private account updater;
	private Logger logger;
	private final int CLIENT_MAX_NUM = 100;

	public Bank() {
		clients = new Client[CLIENT_MAX_NUM];
	}

	public void setBalance() {
		// calculate client balance and total accounts balance and return bank balance
		// use client.getFourtune() for each client.
	}
//	public float getBalance() {
//		returns bank current value. 
//	}

	public void addClient(Client[] client) {
		for (int i = 0; i < CLIENT_MAX_NUM; i++) {
			if (clients[i] == null) {
				clients[i] = new Client(id, name, balance);
			}
		}
	}

	public void removeClient(int id) {
		// remove client with the same id from the array and assign null in its
		// position.
	}

	public Client[] getClients() {
		return 
	}
}
