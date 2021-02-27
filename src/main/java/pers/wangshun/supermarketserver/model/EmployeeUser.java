package pers.wangshun.supermarketserver.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author WangShun
 */
@Data
public class EmployeeUser {
    private Integer id;

    private String username;

    private String password;

    private Long employeeCode;

    private String employeeGender;

    private String employeePhone;

    private String employeeLocation;

    private Date employeeBirthday;

    private Date employeeEntryDate;

    private String employeeBankcard;

    private String employeeIsHeadquarter;

    private BigDecimal employeeSalary;

    private Long employeeShopId;

    private Boolean enabled;

    private Boolean locked;

    private List<Role> roles;

}