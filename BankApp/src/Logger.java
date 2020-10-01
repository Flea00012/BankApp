import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public abstract class Logger {
	
	public <E extends File> E writeToFile(E file) {
		
		try(Scanner scanner = new Scanner(new BufferedReader(new FileReader(file)));
				PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("Resources/Data.txt")))){
			
			
		}catch (Exception e) {
			System.err.println("error in Logger catch");
			e.getStackTrace();
		}
		
		
		return file;
		
	}

}
