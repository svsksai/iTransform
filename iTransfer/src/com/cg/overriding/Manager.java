package com.cg.overriding;

public class Manager extends Employee{
	double incentive=.2;
	 
    public Manager(int empId, String empName, double salary) {
        super(empId, empName,  salary);        
    }
 
    public double getSalary() {
 
        return salary+salary*incentive;
    }

}
