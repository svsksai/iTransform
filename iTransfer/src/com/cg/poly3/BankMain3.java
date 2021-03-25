package com.cg.poly3;

public class BankMain3 {
    public static void main(String[] args) {
        CurrentAccount c1 = new CurrentAccount("svsk" ,5200);
        CurrentAccount c2 = new CurrentAccount("sai" ,20000);
        SavingsAccount s1 = new SavingsAccount("kumar",10000);
        SavingsAccount s2 = new SavingsAccount("Ram" ,50000);
        c1.cashcredit=100;
        c2.cashcredit=1000;
        s1.fixeddeposit=1000;
        s2.fixeddeposit=2000;
        System.out.println("Name of Coustmer:" +c1.getName()+"---"+"Balance:"+c1.getBalance());
        System.out.println("Name of Coustmer:" +c2.getName()+"---"+"Balance:"+c2.getBalance());
        System.out.println("Name of Coustmer:" +s1.getName()+"---"+"Balance:"+s1.getBalance());
        System.out.println("Name of Coustmer:" +s2.getName()+"---"+"Balance:"+s2.getBalance());
    }

    
}