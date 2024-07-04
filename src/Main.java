public class Main {
    public static void main(String[] args) {
        EmployeeBook.addEmployee("Максос Решетников", 1, 100_000.0);
        EmployeeBook.addEmployee("Дональд Трамп", 1, 130_000.0);
        EmployeeBook.addEmployee("Niggaдяй Иванов", 2, 123_000.0);
        EmployeeBook.addEmployee("Джорш Пуш", 2, 134_345.0);
        EmployeeBook.printAllEmployees();
        EmployeeBook.removeEmployee("Максос Решетников");
        EmployeeBook.printAllEmployees();
        EmployeeBook.findEmployee("Максос Решетников");
        EmployeeBook.findEmployee("Niggaдяй Иванов");
        System.out.println(EmployeeBook.calculateTotalSalaryExpenses());
        System.out.println(EmployeeBook.findEmployeeWithMaxSalary());
        System.out.println(EmployeeBook.findEmployeeWithMinSalary());
        System.out.println(EmployeeBook.calculateAverageSalary());
        EmployeeBook.printFullNamesOfEmployees();
        EmployeeBook.changeAllSalary(10.0);
        EmployeeBook.printAllEmployees();
        System.out.println(EmployeeBook.calculateAverageSalaryInDepartment(1));
        EmployeeBook.changeAllSalaryInDepartment(20,1);
        EmployeeBook.printAllEmployees();
        System.out.println(EmployeeBook.calculateTotalSalaryExpensesInDepartment(2));
        System.out.println(EmployeeBook.findEmployeeWithMaxSalaryInDepartment(1));
        System.out.println(EmployeeBook.findMinSalaryEmployeeInDepartment(2));
        EmployeeBook.printEmployeesInDepartment(1);
        EmployeeBook.printEmployeesWithSalaryBelow(100_000.0);
        EmployeeBook.printEmployeesWithSalaryAbove(100_000.0);
    }
}