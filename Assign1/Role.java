package Assign1;

public class Role {
	private String roleName;

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	@Override
	public String toString() {
		return "Role [roleName=" + roleName + "]";
	}

	public Role(String roleName) {
		super();
		this.roleName = roleName;
	}

	

}
