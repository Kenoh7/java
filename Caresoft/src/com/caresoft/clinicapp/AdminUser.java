package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantAdmin, HIPAACompliantUser {
//... imports class definition...
    
	// Inside class:
    private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents;
    
//	--------------------------------------------------------
    // TO DO: Implement a constructor that takes an ID and a role
    
    public AdminUser(Integer id, String role) {
    	super(id);
		this.role = role;
		this.securityIncidents = new ArrayList<String>();
		this.employeeID = id;
	}
//	--------------------------------------------------------
	// TO DO: Implement HIPAACompliantUser!
    
	@Override
	public boolean assignPin(int pin) {
		if(pin < 1000) {
    		return false;
    	}
    	else {
    		return true;
    	}
	}

	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		if(this.id == confirmedAuthID) {
			return true;
		}
		authIncident();
		return false;
	}

	@Override
	public ArrayList<String> reportSecurityIncidents() {
		return this.securityIncidents;
	}
//	--------------------------------------------------------
    // TO DO: Implement HIPAACompliantAdmin!
    
    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }
//	--------------------------------------------------------
    // TO DO: Getters
    
    public Integer getEmployeeID() {
		return employeeID;
	}
	
	public String getRole() {
		return role;
	}
	public ArrayList<String> getSecurityIncidents() {
		return securityIncidents;
	}
	
	//  TO DO:  Setter
	
	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public void setSecurityIncidents(ArrayList<String> securityIncidents) {
		this.securityIncidents = securityIncidents;
	}
   

}