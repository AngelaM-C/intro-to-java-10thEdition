package chapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class RemoveText {

	public static void main(String[] args) throws FileNotFoundException {

		if (args.length != 2) {
			System.out.println("Input argurments are invalid.");
			System.exit(0);
		}

		File f1 = new File(args[1]);
		if (!f1.exists()) {
			System.out.println("Source file " + args[1] + " does not exist.");
			System.exit(1);
		}
		String s1="";
		try (
			Scanner input = new Scanner(f1);
		) {
			while (input.hasNext()) {
				s1 += input.nextLine();
			}
			
			s1= s1.replaceAll(args[0],"");
		
			PrintWriter output= new PrintWriter(f1);
			output.write(s1);
			output.close();
		
		
			
			
		}
	}

}
