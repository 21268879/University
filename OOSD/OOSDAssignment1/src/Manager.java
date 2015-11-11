import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
public class Manager extends Staff {
		
	public static void main(String[] args) {
		ArrayList<AdvertType> clientAds = new ArrayList<>();	
		Scanner sc = new Scanner(System.in);					
								
		
		System.out.println("Enter the start date of the project(format MMM dd yyyy)");		
		String stDate = sc.nextLine();								
		
		System.out.println("Please enter the end date of the project(format MMM dd yyyy)");		
		String enDate = sc.nextLine();		

		System.out.println("Please enter the name of the project manager.");		
		String projectManager = sc.nextLine();		
		
	/*	Project newPr = new Project(clID, stDate, enDate, projectManager);    
			String testDate = newPr.getStartDate();				
			int testClID = newPr.getClientID();			*/
		Project newPr = new Project(stDate, enDate, projectManager);
			String testDate = newPr.getStartDate(); String testEndDate = newPr.getEndDate(); int testClID = newPr.getClientID(); String testManagernName = newPr.getProjectManager();
		
			System.out.println("TEST Project Start Date: " + testDate + "\nTEST Project End Date: " + testEndDate + "\nTEST ClientID: " + testClID + "\nTEST Project Manager Name: " + testManagernName); 		
	}	
			
	public static double calculateCosts(){		
		double estimate = 0;		
		return estimate;
	}
}
