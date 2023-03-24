public class Main {
    public static void main(String[] args) {
        int headsCount = 0;

        Employee[] employees;
        employees = new Employee[10];
        employees[0] = new Employee(++headsCount, "Иван", "Иванович", "Иванов", 130_000, 1);
        employees[1] = new Employee(++headsCount, "Петр", "Петрович", "Петров", 120_000, 2);
        employees[2] = new Employee(++headsCount, "Семен", "Семенович", "Семенов", 110_000, 3);
        employees[3] = new Employee(++headsCount, "Владимир", "Владимирович", "Владимиров", 140_000, 4);
        employees[4] = new Employee(++headsCount, "Сергей", "Сергеевич", "Сергеев", 150_000, 5);
        employees[5] = new Employee(++headsCount, "Юрий", "Юрьевич", "Юрьев", 160_000, 1);
        employees[6] = new Employee(++headsCount, "Александр", "Александрович", "Александров", 170_000, 2);
        employees[7] = new Employee(++headsCount, "Игорь", "Игоревич", "Игорев", 200_000, 3);
        employees[8] = new Employee(++headsCount, "Михаил", "Михайлович", "Михаилов", 190_000, 4);
        employees[9] = new Employee(++headsCount, "Роман", "Романович", "Романов", 180_000, 5);



        // проиндексировать ЗП в отделе 1-5, если отдел = 0 => во всех отделах
        int department = 0;
        float salaryIncreaseRate = 0.1f; // размер увеличения ЗП в %
        increaseSalary(employees, salaryIncreaseRate, department);
        // поиск сотрудника с минимальной зарплатой в отделе 1-5, если 0 то во всех отделах
        department = 5;
        System.out.println("Сотрудник с минимальной ЗП в отделе " + department + " : " + findEmployeeWithMinSalary(employees, department));
        System.out.println();
        // поиск сотрудника с максимальной зарплатой в отделе 1-5, если 0 то во всех отделах
        department = 5;
        System.out.println("Сотрудник с максимальной ЗП в отделе " + department + " : " + findEmployeeWithMaxSalary(employees, department));
        System.out.println();
        // подсчет суммурного значения зарплат в отделе 1-5, если 0 то во всех отделах
        department = 1;
        System.out.println("Суммарная ЗП в отделе " + department + " = " + calculateTotalSalary(employees, department));
        // подсчет среднего значения зарплат в отделе 1-5, если 0 то во всех отделах
        department = 1;
        System.out.println("Средняя ЗП в отделе " + department + " = " + calculateAverageSalary(employees, department));
        System.out.println();
        // список всех сотрудников в отделе 1-5, если 0 то во всех отделах
        department = 2;
        printAllEmployeesData(employees,department);
        System.out.println();
        // список всех сотрудников c ЗП ниже чем
        int salaryLimit = 150_000;
        findEmployeesWithLowerSalary(employees, salaryLimit);
        System.out.println();
        // список всех сотрудников c ЗП выше чем
        salaryLimit = 150_000;
        findEmployeesWithHigherSalary(employees, salaryLimit);
        System.out.println();

    } // end of main

    public static void findEmployeesWithLowerSalary(Employee[] employees, int salaryLimit) {
        for (Employee person:employees) {
            if(person != null  && person.getSalary() < salaryLimit ) {
                System.out.println("ФИО=" + person.getLastName() + " " + person.getFirstName() + " " + person.getMiddleName() + ", id=" + person.getID() + ", ФЗП=" + person.getSalary());
            }
        }
    } // end of method


    public static void findEmployeesWithHigherSalary(Employee[] employees, int salaryLimit) {
        for (Employee person:employees) {
            if(person != null  && person.getSalary() > salaryLimit ) {
                System.out.println("ФИО=" + person.getLastName() + " " + person.getFirstName() + " " + person.getMiddleName() + ", id=" + person.getID() + ", ФЗП=" + person.getSalary());
            }
        }
    } // end of method

    public static void printAllEmployeesData(Employee[] employees, int department) {
        for (Employee person:employees) {
            if(person != null  && (department == 0 || person.getDepartment() == department)) {
                System.out.println("ФИО=" + person.getLastName() + " " + person.getFirstName() + " " + person.getMiddleName() + ", id=" + person.getID() + ", ФЗП=" + person.getSalary());
            }
        }
    } // end of method

    public static Employee findEmployeeWithMinSalary(Employee[] employees, int department) {
        int minSalary = 1_000_000_000;
        int indexMinSalary = -1;

        for (int i=0; i < employees.length; i++) {
            if(employees[i] != null && (department == 0 || employees[i].getDepartment() == department)) {
                if(minSalary > employees[i].getSalary()) {
                    minSalary = employees[i].getSalary();
                    indexMinSalary = i;
                }
            }
        }
       return employees[indexMinSalary];
    } // end of method

    public static int calculateTotalSalary (Employee[] employees, int department) {
        int averageSalary = 0;
        int numberOfEmployees = 0;

        for (int i=0; i < employees.length; i++) {
            if(employees[i] != null && (department == 0 || employees[i].getDepartment() == department)) {
                averageSalary += employees[i].getSalary();
                numberOfEmployees++;
            }
        }
        return averageSalary;
    } // end of method

    public static int calculateAverageSalary (Employee[] employees, int department) {
        int averageSalary = 0;
        int numberOfEmployees = 0;

        for (int i=0; i < employees.length; i++) {
            if(employees[i] != null && (department == 0 || employees[i].getDepartment() == department)) {
                averageSalary += employees[i].getSalary();
                numberOfEmployees++;
                }
            }
        if(numberOfEmployees != 0) {
            averageSalary /= numberOfEmployees;
        }
        return averageSalary;
    } // end of method

    public static Employee findEmployeeWithMaxSalary(Employee[] employees, int department) {
        int maxSalary = -1;
        int indexMaxSalary = -1;

        for (int i=0; i < employees.length; i++) {
            if(employees[i] != null && (department == 0 || employees[i].getDepartment() == department)) {
                if(maxSalary < employees[i].getSalary()) {
                    maxSalary = employees[i].getSalary();
                    indexMaxSalary = i;
                }
            }
        }
        return employees[indexMaxSalary];
    } // end of method

    public static void increaseSalary(Employee[] employees, float salaryIncreaseRate, int department) {

        for (int i=0; i < employees.length; i++) {
            if(employees[i] != null && (department == 0 || employees[i].getDepartment() == department)) {
                employees[i].setSalary((int) (employees[i].getSalary() * (1.0f + salaryIncreaseRate)));
            }
        }

    } // end of method



} // end of Main

