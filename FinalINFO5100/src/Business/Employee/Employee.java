/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;
import Business.Enterprise.Person;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Name
 */
public class Employee extends Person {

    String employeeID;
    String employeeDepartment;
    UserAccount userAccount;

    public Employee(String userName, String password) {
        this.userAccount = new UserAccount(userName, password);
    }

    public Employee(String employeeDepartment) {
        this.userAccount = new UserAccount();
        this.employeeDepartment = employeeDepartment;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeDepartment() {
        return employeeDepartment;
    }

    public void setEmployeeDepartment(String employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }

}
