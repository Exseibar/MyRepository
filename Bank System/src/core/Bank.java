package core;

public class Bank {

<<<<<<< HEAD
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
=======
	private final int CLIENT_MAX_NUM = 100;
	private Client[] clients;
	private Logger logService;
//	private account updater;
	private Logger logger;
	private float fortune;
	private static float commissionSum = 0;

///////////////////////////////////////Singleton////////////////////////////////////////////////////////////////////
	
	private Bank() {
		clients = new Client[CLIENT_MAX_NUM];
	}
	
	
	
	private static Bank instance = new Bank();
	
	
	
	
	public static Bank getBank() {
		return instance;
	}

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void setBalance() {
		fortune = 0;
		for(int i = 0; i < clients.length; i++) {
			Client client = clients[i];
			if(client != null) {
				fortune += client.getFortune();
			}
		}
		fortune += commissionSum;
	}
	public float getBalance() {
		setBalance();
		return fortune;
	}
	
		public static void addCommission(float commission) {
			commissionSum += commission;
		}

	public void addClient(Client client) {
		for (int i = 0; i < CLIENT_MAX_NUM; i++) {
			Client newClient = clients[i];
			if (clients[i] == null) {
				clients[i] = client;
				fortune += newClient.getFortune();
				return;
			}
		}
	}

	public void removeClient(Client client) {
		for (int i = 0; i < clients.length; i++) {
			Client removeClient = clients[i];
			if(removeClient != null && removeClient.equals(client)) {
				fortune -= removeClient.getFortune();
				clients[i] = null;
				return;
			}	
		}
	}

	public Client[] getClients() {
		int length = 0;
		for (int i = 0;i < clients.length; i++) {
			if(clients[i] != null) {
				length++;
			}
		}
		Client[] allClients = new Client[length];
		int index = 0;
		for (int i = 0; i < clients.length; i++) {
			if(clients[i] != null) {
				allClients[index] = clients[i];
				i++;
			}
		}
		return allClients;
	}
	
	public void printClientList() {
		System.out.println("-----------CLIENT LIST-------------");
		for(int i = 0 ; i < clients.length; i++) {
			if(clients[i] != null) {
				System.out.println(clients[i]);
			}
		}
		System.out.println("-----------------------------------");
	}
	
>>>>>>> branch 'master' of https://github.com/Exseibar/MyRepository.git
}
