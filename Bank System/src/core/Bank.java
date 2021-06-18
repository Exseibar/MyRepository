package core;

public class Bank {

	private Client[] clients;
	private Logger logService;
//	private account updater;
	private Logger logger;
	private final int CLIENT_MAX_NUM = 100;
	float fortune;


	public Bank() {
		clients = new Client[CLIENT_MAX_NUM];
	}

	public void setBalance() {
		fortune = 0;
		for(int i = 0; i < clients.length; i++) {
			Client client = clients[i];
			if(client != null) {
				fortune += client.getFortune();
			}
		}
	}
	public float getBalance() {
		setBalance();
		return fortune;
	}

	public void addClient(Client[] client) {
		for (int i = 0; i < CLIENT_MAX_NUM; i++) {
			Client newClient = clients[i];
			if (clients[i] == null) {
				clients[i] = new Client(newClient.getId(), newClient.getName(), newClient.getBalance());
				fortune += newClient.getFortune();
				return;
			}
		}
	}

	public void removeClient(int id) {
		for (int i = 0; i < clients.length; i++) {
			Client removeClient = clients[i];
			if(removeClient != null && removeClient.getId() == id) {
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
}
