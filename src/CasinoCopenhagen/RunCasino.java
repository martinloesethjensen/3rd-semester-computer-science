package CasinoCopenhagen;

import CasinoCopenhagen.FileHandlers.FileHandler;
import CasinoCopenhagen.FileHandlers.SessionFileHandler;
import CasinoCopenhagen.FileHandlers.UserFileHandler;

import java.util.ArrayList;
import java.util.Scanner;

public class RunCasino {
	public static SessionFileHandler sessionFileHandler = new SessionFileHandler();
	public static ArrayList<Employee> employees = new ArrayList<>();
	public static ArrayList<User> users = new ArrayList<>();
	public static UserFileHandler userFileHandler = new UserFileHandler();

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);

		employees.add(new Employee("Martin", "1234567890", "martin1234", 1));
		employees.add(new Employee("Martin", "1234567890", "martin1234", 2));
		employees.add(new Employee("Martin", "1234567890", "martin1234", 3));

		//load employees from txt file
		userFileHandler.loadUsers();

		//intro(input, sessionFileHandler);

		menu(input);


//sessionFileHandler.saveLogin(new Session("martin", "2300"), employees);
//	    sessionFileHandler.saveLogin(new Session("main", "230"), employees);

	}

	public static void intro(Scanner input, SessionFileHandler sessionFileHandler) {

		System.out.print("Please login to continue.\nUsername: ");
		String typedUsername = input.next();
		System.out.print("Password: ");
		String typedPassword = input.next();
		System.out.println();
		if (sessionFileHandler.checkLogin(typedUsername, typedPassword)) {
			System.out.println("kom ind");
		} else {
			intro(input, sessionFileHandler);
		}
	}

	public static void menu(Scanner input) {
		System.out.println("Welcome!\nEnter \'1\' to add a new user\nEnter " +
			"\'2\' to add a new tournament\nEnter \'3\' to add a new game\nEnter \'-1\' to exit");

		boolean loop = true;
		while (loop) {
			switch (input.nextInt()) {
				case 1:
					System.out.print("First name: ");
					String firstName = input.next();
					System.out.print("Last name: ");
					String lastName = input.next();
					System.out.print("CPR: ");
					String cpr = input.next();
//						System.out.println("Enter 1 if new user is a dealer.\nEnter any other number to skip.");
//						int tempDealer = input.nextInt();
//						boolean dealer;
//
//						if (tempDealer == 1){
//							dealer = true;
//						}else dealer = false;
//
					User user = new User(firstName+", "+lastName, cpr);
					userFileHandler.saveUserToFile(user,users);
					users.add(user);

					System.out.println(user);


					break;
				case 2:
					break;
				case 3:
					break;
				case -1:
					loop = false;
					System.out.println("Thanks for visiting.");
					break;
				default:
					System.out.println("Try again: ");
					break;
			}
		}
	}
}
