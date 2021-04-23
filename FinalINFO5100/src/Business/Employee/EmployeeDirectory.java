package Business.Employee;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class EmployeeDirectory {

    private final ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public void AddEmployeeToDirectory(Employee employee) {
        this.employeeList.add(employee);
    }

    public boolean ValidateEmployeeLogin(String userName, String Password) {
        //User a doctor factory to return the obejct
        for (Employee employee : this.employeeList) {
            if (employee.getUserAccount().getUserName().equalsIgnoreCase(userName)
                    && employee.getUserAccount().getUserPassword().equalsIgnoreCase(Password)) {
                return true;
            }
        }
        return false;
    }
}
