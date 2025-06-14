package com.hexaware.myspring;

public class Role {
	
	public Role() {};
	
	public Role(String roleName, String description) {
		super();
		this.roleName = roleName;
		this.description = description;
	}
	private String roleName;
	private String description;
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Role [roleName=" + roleName + ", description=" + description + "]";
	}
    
	

}
