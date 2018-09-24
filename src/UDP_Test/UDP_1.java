package UDP_Test;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class UDP_1 {
	public static void main(String[] args) throws Exception {
		String sentence;
		int length;

		//BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
		Scanner inFromKbd = new Scanner(System.in);
		DatagramSocket receivingSocket = new DatagramSocket(6701);
		DatagramSocket sendingSocket = new DatagramSocket();
		InetAddress IPAddress = InetAddress.getByName("127.0.0.1");
		byte[] data = new byte[1024];

		System.out.println("Please type you message: ");
		//sentence = inFromUser.readLine();
		sentence = inFromKbd.nextLine();
		length = sentence.length();
		data = sentence.getBytes();
		DatagramPacket sendPacket = new DatagramPacket(data, length, IPAddress, 6710);
		sendingSocket.send(sendPacket);
		sentence = "                               ";
		data = sentence.getBytes();

		DatagramPacket receivePacket = new DatagramPacket(data, data.length);
		receivingSocket.receive(receivePacket);
		sentence = new String(receivePacket.getData());
		System.out.println("FROM SERVER:" + sentence);

	}
}
