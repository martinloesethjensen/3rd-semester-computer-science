package CasinoCopenhagen.FileHandlers;

import CasinoCopenhagen.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class UserFileHandler extends FileHandler {

	public UserFileHandler() {
		super.setFilename("users.txt");
		try {
			super.setScanner(new Scanner(new File(getPath() + getFilename())).useDelimiter(";"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void saveUserToFile(User user, ArrayList<User> usersArrayList){
		String[] users = new String[usersArrayList.size()];

		try {
			int counter = 0;


			while (getScanner().hasNextLine()) {
				users[counter] = getScanner().next() + ";" + getScanner().next() + ";" + getScanner().nextBoolean() + ";";
				counter++;
			}


			PrintStream printStream = new PrintStream(new FileOutputStream(getPath() + getFilename()), true);

			for (String s : users) {
				printStream.println(s);
			}


			printStream.println(user.getName() +";"+user.getCpr()+";"+user.isDealer()+";");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public ArrayList<User> loadUsers() {
		ArrayList<User> users = new ArrayList<>();
		try {
			Scanner read = new Scanner(new File(getPath() + getFilename()));
			while (read.hasNextLine()) {
				Scanner readOnLine = new Scanner((new File(getPath() + getFilename()))).useDelimiter(";");
				String name = readOnLine.next();
				String cpr = readOnLine.next();
				Boolean isDealer = readOnLine.nextBoolean();

				users.add(new User(name, cpr, isDealer));

				read.hasNextLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println("Filen blev ikke fundet");
		}

		return users;
	}
}
