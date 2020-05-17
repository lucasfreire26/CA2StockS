package Viewer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class UserInterface {

	
	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	
	String[] types = { "1", "2", "3", "4", "0" };
	List<String> operations = Arrays.asList(types);// { "1", "2", "3", "4", "5", "0" };		
	
	String operation = "";
	while (operation.equals("")) {
		try {
			//calling method to print main menu
			printMainMenu();
			operation = reader.readLine();
			if (!operations.contains(operation)) {
				System.out.println("Please select a valid operation.");
				
				//setting cases and calling methods
			} else {
				switch (operation) {
				case "1":
					highestCompanies();
					break;
				case "2":
					lowestCompanies();
					break;
				case "3":
					highestInvestors();
					break;
				case "4":
					lowestInvestors();
					break;
				case "0":
					//end program if reaches to this point
					System.exit(0);
					break;
				default:
					
					break;
				}
			}
			//set operation to blank to avoid infinite loop
			operation = "";				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	System.out.println("END");


// method to print main menu
private static void printMainMenu() {
	System.out.println("***** MAIN MENU *****");
	System.out.println(". Please enter an option below to see:");
	System.out.println("1. Company(s) with highest capital");
	System.out.println("2. Company(s) with lowest capital");
	System.out.println("3. Investor(s) with the highest number of shares");
	System.out.println("4. Investor(s) with the lowest number of shares");
	System.out.println("0. Finish and close");
	
	}
}
}
private static void highestCompanies() {
	
}

private static void lowestCompanies() {

}

private static void highestInvestors() {

}

private static void lowestInvestors() {

}

}
