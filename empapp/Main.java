package empapp;

import java.util.Scanner;

public class Main {

	// write your code here
    public static void main(String[] args) {


                EmployeeDaoIntrf dao = new EmployeeDaoImpl();
                System.out.println("Welcome to the employee management System");
                Scanner sc = new Scanner(System.in);
                do {
                    System.out.println("1. Add Employee\n" +
                            "2. Show All Employee\n" +
                            "3. Show Employee Based on id \n"+
                            "4. Update the Employee\n");

                    System.out.println("Enter the choice: ");
                    int ch = sc.nextInt();
                    switch (ch) {
                        case 1:
                            Employee emp = new Employee();
                            System.out.println("Enter ID : ");
                            int id = sc.nextInt();
                            System.out.println("Enter name ");
                            String name = sc.next();
                            System.out.println("Enter salary");
                            double salary = sc.nextDouble();
                            System.out.println("Enter age ");
                            int age = sc.nextInt();
                            emp.setId(id);
                            emp.setName(name);
                            emp.setSalary(salary);
                            emp.setAge(age);
                            dao.createEmployee( emp );
                            break;
                        case 2:
                            dao.showAllEmployee();
                            break;
                        case 3:
                            System.out.println("Enter id to show the details ");
                            int empid1=sc.nextInt();
                            dao.employeeBasedOnId(empid1);
                            break;
                        case 4:
                            System.out.println("Enter id to update the details");
                            int empid=sc.nextInt();
                            System.out.println("Enter the new name");
                            name=sc.next();
                            dao.updateEmployee(empid,name);
                            break;

                        case 5:
                            System.out.println("Thank you for using our Application");
                            System.exit(0);
                        default:
                            System.out.println("Enter valid choice !");
                        break;
                    }

                }while (true);

            }
        }


