package com.cg.overriding;

public class Labour extends Employee{
	double overtime=4;
	 
    public Labour(int empId, String empName, double salary) {
        super(empId, empName,  salary);        
    }
 
    public double getSalary() {
 
    return salary+overtime*400;
    }

}
	


