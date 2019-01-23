package cwy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileUtil {

	public static void main(String args[]) {

		String fileName = "D:\\wooyeon\\share_folder_del.bat";

		//read file into stream, try-with-resources
		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

			stream.forEach(System.out::println);
			//20190123
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
