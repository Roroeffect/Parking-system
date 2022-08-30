package ParkingSytem.Service;

public class Vehicle {
	 private String regNumber;
	    private String ownerName;
		private long phoneNumber;

	    public Vehicle(String regNumber, String ownerName, long phoneNumber) {
	        this.regNumber = regNumber;
	        this.ownerName = ownerName;
	        this.phoneNumber = phoneNumber;
	    }

	    public String getRegNumber() {
	        return regNumber;
	    }

	    public void setRegNumber(String regNumber) {
	        this.regNumber = regNumber;
	    }
	    
	    public String getOwnerName() {
	        return ownerName;
	    }

	    public void setOwnerName(String ownerName) {
	        this.ownerName = ownerName;
	    }

	    public long getMobileNo() {
	        return phoneNumber;
	    }

	    public void setMobileNo(long phoneNumber) {
	        this.phoneNumber = phoneNumber;
	    }

	    @Override
	    public String toString() {
	        return   "regNumber= " + regNumber + "   "+
	                 ", ownerName= " + ownerName + "   " +
	                 ", mobileNo=" + phoneNumber+ "   ";
	    }
}
