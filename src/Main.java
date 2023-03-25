public class Main {
    public static void main(String[] args) {

        EmployeeBook employeesBook;
        employeesBook = new EmployeeBook();

        // добавляем новых сотрудников
        employeesBook.addEmployee("Иван", "Иванович", "Иванов", 130_000, 1);
        employeesBook.addEmployee("Петр", "Петрович", "Петров", 120_000, 2);
        employeesBook.addEmployee("Семен", "Семенович", "Семенов", 110_000, 3);
        employeesBook.addEmployee("Владимир", "Владимирович", "Владимиров", 140_000, 4);
        employeesBook.addEmployee("Сергей", "Сергеевич", "Сергеев", 150_000, 5);
        employeesBook.addEmployee("Юрий", "Юрьевич", "Юрий", 160_000, 1);
        employeesBook.addEmployee("Александр", "Александрович", "Александров", 170_000, 2);
        employeesBook.addEmployee("Игорь", "Игоревич", "Игорев", 200_000, 3);
        employeesBook.addEmployee("Михаил", "Михайлович", "Михаилов", 190_000, 4);
        employeesBook.addEmployee("Роман", "Романович", "Романов", 180_000, 5);
        employeesBook.addEmployee("Егор", "Егорович", "Егоров", 210_000, 1);  // лишний сотрудник
        employeesBook.addEmployee("Алексей", "Алексеевич", "Алексеев", 220_000, 2);  // лишний сотрудник
        System.out.println();

        // печатаем данные по всем сотрудникам
        employeesBook.printAllEmployeesData();
        System.out.println();

        // ищем сотрудников по фимилии и выводим их данные, смотрим ID
        employeesBook.findEmployeesByLastName("Петров");
        System.out.println();

        // удалаяем сотрудников по ID, ID сомтрим по методу findEmployeesByLastName
        employeesBook.deleteEmployee(2);
        employeesBook.deleteEmployee(10);
        System.out.println();

        // печатаем данные по всем сотрудникам
        employeesBook.printAllEmployeesData();
        System.out.println();

        // добавляем новых сотрудников вместо удаленнох
        employeesBook.addEmployee("Егор", "Егорович", "Егоров", 210_000, 1);
        employeesBook.addEmployee("Алексей", "Алексеевич", "Алексеев", 220_000, 2);
        System.out.println();

        // печатаем данные по всем сотрудникам
        employeesBook.printAllEmployeesData();
        System.out.println();

        //меняем ЗП сотруднику по ID
        employeesBook.changeSalary(3, 333_333);
        employeesBook.changeSalary(4, 444_444);
        System.out.println();

        // меняем отдел сотрудника по ID, ID сомтрим по методу findEmployeesByLastName
        employeesBook.changeDepartment(3, 1);
        employeesBook.changeDepartment(1, 5);
        System.out.println();

        // печатаем сотрудников по департаментам
        employeesBook.printEmployeesByDepartments();
        System.out.println();


    } // end of main
} // end of Main

