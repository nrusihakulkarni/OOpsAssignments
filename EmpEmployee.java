package INHERITANCE;

import java.util.Scanner;

public class EmpEmployee {
    int hrs =0, rate=0, computeSalary=0;
}

class WageEmpEmployee extends EmpEmployee {


    void ComputeSalary() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Worked  Hour ");
        int hrs = scanner.nextInt();
        System.out.println("Enter Rate per Hour ");
        int rate = scanner.nextInt();
        super.computeSalary = this.hrs * this.rate;
        System.out.println("computeSalary = " + super.computeSalary);
    }
}
