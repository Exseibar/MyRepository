package udp.server;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPServer {

	public static final int PORT = 8888;

	public UDPServer() {
		DatagramSocket serverSocket = null;

		try {
			serverSocket = new DatagramSocket(PORT);
		} catch (SocketException e) {
			e.printStackTrace();
		}
		while (true) {
			sendAndReceive(serverSocket);
		}
	}

	public void sendAndReceive(DatagramSocket serverSocket) {
		// receive from client
		byte[] receive = new byte[1024];
		DatagramPacket packet = new DatagramPacket(receive, receive.length);
		try {
			serverSocket.receive(packet);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String msg = new String(packet.getData()).substring(0, packet.getLength());
		// send to client
		int p = packet.getPort();
		InetAddress add = packet.getAddress();
		packet = new DatagramPacket(msg.getBytes(), msg.getBytes().length, add, p);
		try {
			serverSocket.send(packet);
		} catch (IOException e) {
			e.printStackTrace();
			serverSocket.close();
		}
	}

	public static void main(String[] args) {
		new UDPServer();
	}

}