package empapp;

public interface EmployeeDaoIntrf {
     void createEmployee(Employee emp);
    void showAllEmployee();
    void employeeBasedOnId(int id);
    void updateEmployee(int id,String name);
     void deleteEmployee(int id);

}
