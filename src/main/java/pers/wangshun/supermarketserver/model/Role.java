package pers.wangshun.supermarketserver.model;

import java.util.List;

/**
 * @author WangShun
 */
public class Role {
    private Integer id;

    private String name;

    private String description;

    private List<EmployeeUser> employeeUsers;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public List<EmployeeUser> getEmployeeUsers() {
        return employeeUsers;
    }

    public void setEmployeeUsers(List<EmployeeUser> employeeUsers) {
        this.employeeUsers = employeeUsers;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", employeeUsers=" + employeeUsers +
                '}';
    }
}