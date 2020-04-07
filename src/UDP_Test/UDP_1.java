package UDP_Test;

import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
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

		while (true) {
			byte[] data = new byte[1024];

			System.out.println("Please type you message: ");
			sentence = inFromKbd.nextLine().trim();
			if (sentence.equals("QUIT")) break;
			length = sentence.length();
			data = sentence.getBytes();
			DatagramPacket sendPacket = new DatagramPacket(data, length, IPAddress, 6710);
			sendingSocket.send(sendPacket);
			sentence = "                               ";
			data = sentence.getBytes();

			DatagramPacket receivePacket = new DatagramPacket(data, data.length);
			receivingSocket.receive(receivePacket);
			sentence = new String(receivePacket.getData(), StandardCharsets.UTF_8).trim();
			if (sentence.equals("QUIT")) break;
			System.out.println("FROM SERVER:" + sentence);

		}
	}
}
