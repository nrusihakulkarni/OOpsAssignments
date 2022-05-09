package INHERITANCE;

/*

1. Create class WageEmpEmployee extending Employee class with attributes as hrs (int)and
        rate(int) and method computeSalary() to calculate the salary Print the salary and details of
        WageEmployee_ (Note: use the previous Employee classes Accept the values from the
        user. Default, Parameterised Constructor and toString() to be written in all the classes)
2. Create SalesPerson class extending WageEmployee with attributes as sales(int) and
        commission (int). Override the ComputeSalary() in Salesperson class and print the salary and
        details of SalesPerson
3. Create Manager class extending Employee class with attributes as fixedsalary(int) and
        incentives(int) and method computeSalary() to calculate the salary of Manager Print the salary
        and details of Manager
4. Write a TestEmployee class to print the details of all types of employees (use array[] of
        Employee class)

*/


public class InheritanceDriver {
    public static void main(String[] args) {

        SalesPerson salesPerson = new SalesPerson();
        salesPerson.ComputeSalary();

    }
}
