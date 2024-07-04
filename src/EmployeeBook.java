import java.util.HashMap;
import java.util.Map;

public class EmployeeBook {
    private static HashMap<String, Employee> employees = new HashMap<>();


    public static void addEmployee(String fullName, Integer department, Double salary) {
        if (employees.isEmpty()) {
            Employee employee = new Employee(fullName, salary, department);
            employees.put(employee.getFullName(), employee);
            System.out.println("Сотрудник добавлен");
        } else {
            if (employees.containsKey(fullName)) {
                System.out.println("Сотрудник уже есть в списке");
            } else {
                Employee employee = new Employee(fullName, salary, department);
                employees.put(employee.getFullName(), employee);
                System.out.println("Сотрудник добавлен");

            }
        }
    }

    public static void removeEmployee(String fullName) {
        if (employees.containsKey(fullName)) {
            employees.remove(fullName);
            System.out.println("Сотрудник удален");
        } else {
            System.out.println("Такого сотрудника нет в списке");
        }
    }

    public static void findEmployee(String fullName) {
        if (employees.containsKey(fullName)) {
            System.out.println("Сотрудник: " + employees.get(fullName));
        } else {
            System.out.println("Такого сотрудника нет в списке");
        }
    }

    public static void printAllEmployees() {
        System.out.println(employees + "\n");
    }

    public static double calculateTotalSalaryExpenses() {
        double totalSalary = 0;
        for (var entry : employees.entrySet()) {
            totalSalary += entry.getValue().getSalary();
        }
        return totalSalary;
    }

    public static Employee findEmployeeWithMinSalary() {
        if (employees.isEmpty()) {
            return null;
        }
        Employee minSalaryEmployee = null;
        for (Employee employee : employees.values()) {
            if (minSalaryEmployee == null || employee.getSalary() < minSalaryEmployee.getSalary()) {
                minSalaryEmployee = employee;
            }
        }
        return minSalaryEmployee;
    }


    public static Employee findEmployeeWithMaxSalary() {
        if (employees.isEmpty()) {
            return null;
        }
        Employee maxSalaryEmployee = null;
        for (Employee employee : employees.values()) {
            if (maxSalaryEmployee == null || employee.getSalary() > maxSalaryEmployee.getSalary()) {
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee;
    }


    public static double calculateAverageSalary() {
        // Если карта пуста, возвращаем 0 или можно выбросить исключение
        if (employees.isEmpty()) {
            return 0.0;
        }
        double totalSalary = 0.0;
        int count = 0;
        for (Employee employee : employees.values()) {
            totalSalary += employee.getSalary();
            count++;
        }

        return totalSalary / count;
    }

    public static void printFullNamesOfEmployees() {
        for (Employee employee : employees.values()) {
            System.out.println(employee.getFullName());
        }
    }

    public static void changeAllSalary(double percent) {
        for (Employee emp : employees.values()) {
            double currentSalary = emp.getSalary();
            double changedSalary = currentSalary * percent / 100 + currentSalary;
            emp.setSalary(changedSalary);
        }
    }

    public static double calculateTotalSalaryExpensesInDepartment(int department) {
        double totalSalary = 0;
        for (Employee emp : employees.values()) {
            if (emp.getDepartment() == department) {
                totalSalary += emp.getSalary();
            }
        }
        return totalSalary;
    }

    public static Employee findMinSalaryEmployeeInDepartment(int department) {
        Employee minSalaryEmployee = null;
        double minSalary = Double.MAX_VALUE;
        for (Employee emp : employees.values()) {
            if (emp.getDepartment() == department && emp.getSalary() < minSalary) {
                minSalary = emp.getSalary();
                minSalaryEmployee = emp;
            }
        }
        return minSalaryEmployee;
    }

    public static Employee findEmployeeWithMaxSalaryInDepartment(int department) {
        Employee maxSalaryEmployee = null;
        double maxSalary = Double.MIN_VALUE;
        for (Employee emp : employees.values()) {
            if (emp.getDepartment() == department && emp.getSalary() > maxSalary) {
                maxSalary = emp.getSalary();
                maxSalaryEmployee = emp;
            }
        }
        return maxSalaryEmployee;
    }

    public static double calculateAverageSalaryInDepartment(int department) {
        double totalSalary = 0;
        int count = 0;
        for (Employee emp : employees.values()) {
            if (emp.getDepartment() == department) {
                totalSalary += emp.getSalary();
                count++;
            }
        }
        if (count == 0) {
            return 0;
        }
        return totalSalary / count;
    }

    public static void changeAllSalaryInDepartment(double percent, int department) {
        for (Employee emp : employees.values()) {
            if (emp.getDepartment() == department) {
                double changedSalary = emp.getSalary() * (1 + percent / 100);
                emp.setSalary(changedSalary);
            }
        }
    }

    public static void printEmployeesInDepartment(int department) {
        for (Employee emp : employees.values()) {
            if (emp.getDepartment() == department) {
                System.out.println("ФИО " + emp.getFullName() + ", ЗП: " + emp.getSalary());
            }
        }
    }

    public static void printEmployeesWithSalaryBelow(double threshold) {
        for (Employee emp : employees.values()) {
            if (emp.getSalary() < threshold) {
                System.out.println("ФИО " + emp.getFullName() + ", ЗП: " + emp.getSalary());
            }
        }
    }

    public static void printEmployeesWithSalaryAbove(double threshold) {
        for (Employee emp : employees.values()) {
            if (emp.getSalary() >= threshold) {
                System.out.println("ФИО " + emp.getFullName() + ", ЗП: " + emp.getSalary());
            }
        }
    }

    //МЕГА ТУПАНУЛ
}
