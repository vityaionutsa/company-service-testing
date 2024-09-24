package edu.pzks;


/*
  @author   george
  @project   company-service
  @class  Company
  @version  1.0.0 
  @since 02.09.24 - 11.46
*/

public class Company {
    // parent for this company nullable, when there is no parent for this
    // company
    private Company parent;
    private long employeesCount;

    public Company(Company parent, long employeesCount) {
        this.parent = parent;
        this.employeesCount = employeesCount;
    }

    public Company getParent() {
        return parent;
    }

    public long getEmployeesCount() {
        return employeesCount;
    }
}
