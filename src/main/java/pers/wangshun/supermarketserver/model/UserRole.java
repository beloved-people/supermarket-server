package pers.wangshun.supermarketserver.model;

/**
 * @author WangShun
 */
public class UserRole {
    private EmployeeUser employeeUser;
    private Role role;

    public EmployeeUser getEmployeeUser() {
        return employeeUser;
    }

    public void setEmployeeUser(EmployeeUser employeeUser) {
        this.employeeUser = employeeUser;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
