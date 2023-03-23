public class Main {
    public static void main(String[] args) {
        int headsCount = 0;

        Employee[] employees;
        employees = new Employee[10];
        employees[0] = new Employee(++headsCount, "Иван", "Иванович", "Иванов", 130_000, "1");
        employees[1] = new Employee(++headsCount, "Петр", "Петрович", "Петров", 120_000, "2");
        employees[2] = new Employee(++headsCount, "Семен", "Семенович", "Семенов", 110_000, "3");
        employees[3] = new Employee(++headsCount, "Владимир", "Владимирович", "Владимиров", 140_000, "4");
        employees[4] = new Employee(++headsCount, "Сергей", "Сергеевич", "Сергеев", 150_000, "5");
        employees[5] = new Employee(++headsCount, "Юрий", "Юрьевич", "Юрьев", 160_000, "1");
        employees[6] = new Employee(++headsCount, "Александр", "Александрович", "Александров", 170_000, "2");
        employees[7] = new Employee(++headsCount, "Игорь", "Игоревич", "Игорев", 200_000, "3");
        employees[8] = new Employee(++headsCount, "Михаил", "Михайлович", "Михаилов", 190_000, "4");
        employees[9] = new Employee(++headsCount, "Роман", "Романович", "Романов", 180_000, "5");


        // список всех сотрудников со всеми данными,
        printAllEmployeesData(employees);
        System.out.println();
        // поиск сотрудника с минимальной зарплатой
        System.out.println("Сотрудник с минимальной ЗП: " + findEmployeeWithMinSalary(employees));
        System.out.println();
        // поиск сотрудника с максимальной зарплатой
        System.out.println("Сотрудник с максимальной ЗП: " + findEmployeeWithMaxSalary(employees));
        System.out.println();
        // подсчет среднего значения зарплат
        System.out.println("Средняя ЗП = " + calculateAverageSalary(employees));
        System.out.println();
        // список Ф. И. О. всех сотрудников
        printAllEmployeesNames(employees);



    } // end of main
    public static void printAllEmployeesData(Employee[] employees) {
        for (Employee person:employees) {
            if(person != null) {
                System.out.println(person);
            }
        }
    } // end of method

    public static void printAllEmployeesNames(Employee[] employees) {
        for (Employee person:employees) {
            if(person != null) {
                System.out.println(person.getLastName() + " " + person.getFirstName() + " " + person.getMiddleName());
            }
        }
    } // end of method

    public static Employee findEmployeeWithMinSalary(Employee[] employees) {
        int minSalary = 1_000_000_000;
        int indexMinSalary = -1;

        for (int i=0; i < employees.length; i++) {
            if(employees[i] != null) {
                if(minSalary > employees[i].getSalary()) {
                    minSalary = employees[i].getSalary();
                    indexMinSalary = i;
                }
            }
        }
       return employees[indexMinSalary];
    } // end of method

    public static int calculateAverageSalary (Employee[] employees) {
        int averageSalary = 0;
        int numberOfEmployees = 0;

        for (int i=0; i < employees.length; i++) {
            if(employees[i] != null) {
                averageSalary += employees[i].getSalary();
                numberOfEmployees++;
                }
            }
        if(numberOfEmployees != 0) {
            averageSalary /= numberOfEmployees;
        }
        return averageSalary;
    } // end of method

    public static Employee findEmployeeWithMaxSalary(Employee[] employees) {
        int maxSalary = -1;
        int indexMaxSalary = -1;

        for (int i=0; i < employees.length; i++) {
            if(employees[i] != null) {
                if(maxSalary < employees[i].getSalary()) {
                    maxSalary = employees[i].getSalary();
                    indexMaxSalary = i;
                }
            }
        }
        return employees[indexMaxSalary];
    } // end of method



} // end of Main

