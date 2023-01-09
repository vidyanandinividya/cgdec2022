package session6;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CheckedExceptionDemo {

	public static void main(String[] args) throws IOException {
		Path path=Paths.get("newFile.txt");
		try {
			Files.createFile(path);
			System.out.println("File  created: "+path);
		} catch (FileAlreadyExistsException e) {
			System.out.println(e.getMessage());
			System.out.println("File arleady exist");
		}

	}

}
