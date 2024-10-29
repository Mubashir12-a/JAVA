

class Employee {                                            // Only single class can be Public in java file.
    int id;
    String name;
    int Salary;
    int bonus = 10000;

    void PrintInfo(){
        System.out.println("Employee id is = " + id);
        System.out.println("Employee Name is = " + name);
    }

    int getSalary(){
        return Salary + bonus;
    }
}


public class Custom_Class {
    public static void main(String[] args) {

        // For Employee-1:
        Employee Em_1 = new Employee();

        Em_1.id = 445141;
        Em_1.name = "Employee 01";

        System.out.println(Em_1.name + " ID is " + Em_1.id);
        Em_1.PrintInfo();

        Em_1.Salary = 20000;
        System.out.println("Salary is : " + Em_1.getSalary());



        System.out.println();


        // For Employee-2:
        Employee Em_2 = new Employee();

        Em_2.id = 445142;
        Em_2.name = "Employee 02";

        System.out.println(Em_2.name + " ID is " + Em_2.id);
        Em_2.PrintInfo();

        Em_2.Salary = 15000;
        System.out.println("Salary is : " + Em_2.getSalary());

    }
}
