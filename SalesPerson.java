package INHERITANCE;

import java.util.Scanner;

public class SalesPerson extends WageEmpEmployee {
    int sales = 0, commission = 0;

    void ComputeSalary() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your sales  ");
        sales = scanner.nextInt();
        System.out.println("Enter Your commission ");
        commission = scanner.nextInt();
        super.computeSalary = this.sales * this.commission;
        System.out.println("computeSalary = " + super.computeSalary);
    }

}
