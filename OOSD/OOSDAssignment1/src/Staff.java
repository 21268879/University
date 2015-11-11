
public class Staff {
	private String staffName;
	private String staffId;
	private boolean hasProject = false;
	private boolean isMainContact = false;
	private int projectID;
	
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String getStaffId() {
		return staffId;
	}
	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}
	public boolean isHasProject() {
		return hasProject;
	}
	public void setHasProject(boolean hasProject) {
		this.hasProject = hasProject;
	}
	public boolean isMainContact() {
		return isMainContact;
	}
	public void setMainContact(boolean isMainContact) {
		this.isMainContact = isMainContact;
	}
}
