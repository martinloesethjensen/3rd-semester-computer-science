package CasinoCopenhagen.FileHandlers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandler {
	private String filename;
	private Scanner scanner;
	private String path = "./src/CasinoCopenhagen/TextFiles/";

	public FileHandler() {
	}

	public FileHandler(String filename) {
		this.filename = filename;
		try {
			this.scanner = new Scanner(new File(path + filename)).useDelimiter(";");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public Scanner getScanner() {
		return scanner;
	}

	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
}
