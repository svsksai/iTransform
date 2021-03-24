package com.cg.overriding;

public class EmployeeMain2 {
	public static void main(String[] args) {
        Labour l1=new Labour(101,"Sai" ,40000);
        Labour l2=new Labour(102,"Kumar" ,15000);
        Manager m1=new Manager(103,"Svsk" ,60000);
        Manager m2=new Manager(104,"Ram" ,50000);
 
        System.out.println("Name of Employee:" +l1.getEmpName()+"---"+"Salary:"+l1.getSalary());
        System.out.println("Name of Employee:" +l2.getEmpName()+"---"+"Salary:"+l2.getSalary());
        System.out.println("Name of Employee:" +m1.getEmpName()+"---"+"Salary:"+m1.getSalary());
        System.out.println("Name of Employee:" +m2.getEmpName()+"---"+"Salary:"+m2.getSalary());
    }
}


