import java.util.ArrayList;
import java.util.Date;
import java.*;

public class Project {
	private int clientID;
	private String startDate = "20th of November"; 
	private String endDate = "12th of December";	
	private String projectManager = "Fergus Hollway";		  
	private double studioCost;		
	private double staffCost;		
	private double materialCost;   //photos,music etc.
	private double spaceCost;	   //newspapers, air-time, advertising hoardings etc.
	private ArrayList<AdvertType> marketinngPromos;
	private int numberOfAds;
	
	//CONSTRUCTORs
	public Project(String stDate, String enDate, String mainStaff) {
	super();
	this.clientID = (int)Math.floor(Math.random()*1000001);
	this.startDate = stDate;
	this.endDate = enDate;
	this.projectManager = mainStaff;
	}
	
	public Project(){

		Manager askManager = new Manager();
		
	}

	//GETTERS
	public int getClientID() {
		return clientID;
	}
	public String getStartDate() {
		return startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public String getProjectManager() {
		return projectManager;
	}
	public double getStudioCost() {
		return studioCost;
	}
	public double getSpaceCost() {
		return spaceCost;
	}
	public double getStaffCost() {
		return staffCost;
	}
	public double getMaterialCost() {
		return materialCost;
	}
	
	
	//SETTERS
	public void setProjectManager(String projectManager) {
		this.projectManager = projectManager;
	}
	public void setStudioCost(double studioCost) {
		this.studioCost = studioCost;
	}
	public void setStaffCost(double staffCost) {
		this.staffCost = staffCost;
	}
	public void setMaterialCost(double materialCost) {
		this.materialCost = materialCost;
	}
	public void setSpaceCost(double spaceCost) {
		this.spaceCost = spaceCost;
	}	
}
