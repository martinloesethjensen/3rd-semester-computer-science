package CasinoCopenhagen.FileHandlers;

import CasinoCopenhagen.Employee;
import CasinoCopenhagen.Session;
import CasinoCopenhagen.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class SessionFileHandler extends FileHandler {
	public SessionFileHandler() {
		super.setFilename("login.txt");
		try {
			super.setScanner(new Scanner(new File(getPath() + getFilename())).useDelimiter(";"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public boolean checkLogin(String username, String password) {
		try {
			Scanner scanner = getScanner();

			while (scanner.hasNextLine()) {
				String usernameTemp = scanner.next();
				String passwordTemp = scanner.next();

				if (usernameTemp.equals(username) && passwordTemp.equals(password)) {
					return true;
				}

				scanner.nextLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	public void saveLogin(Session session, ArrayList<Employee> employees) {
		String[] logins = new String[employees.size()];

		try {
			int counter = 0;


			while (getScanner().hasNextLine()) {
				logins[counter] = getScanner().next() + ";" + getScanner().next() + ";";
				System.out.println(logins[counter]);
				counter++;
			}


			PrintStream printStream = new PrintStream(new FileOutputStream(getPath() + getFilename()), true);

			for (String s : logins) {
				printStream.println(s);
			}


			printStream.println(session.getUsername() + ";" + session.getPassword() + ";");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
