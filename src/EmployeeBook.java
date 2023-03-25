public class EmployeeBook {
    private Employee[] employees;
    private int size;
    private int idCount;


    public EmployeeBook() {
        this.employees = new Employee[10];
        this.size = 0;
        this.idCount = 0;
    }

    // employeesBook.addEmployee("Иван", "Иванович", "Иванов", 130_000, 1);
    public void addEmployee(String firstName, String middleName, String lastName, int salary, int department) {
        if (size >= this.employees.length) {
            System.out.println("Нельзя добавить нового сотрудника, закончилось место");
        } else {
            Employee newEmployee = new Employee((idCount+1), firstName, middleName, lastName, salary, department);
            for (int i = 0; i < this.employees.length; i++) {
                if(this.employees[i] == null) {
                    this.employees[i] = newEmployee;
                    size++;
                    idCount++;
                    System.out.println("Добавлен новый сотрудник: " + this.employees[i]);
                    break;
                }
            }
        }
    } // end of method Add

    public void deleteEmployee(int id) {
        for (int i = 0; i < this.employees.length; i++) {
            if(this.employees[i] != null && employees[i].getID() == id) {
                System.out.println("Удален сотрудник: " + this.employees[i]);
                this.employees[i] = null;
                size--;
                break;
            }
        }
    } // end of method Delete


    public void changeSalary(int id, int newSalary) {
        for (int i = 0; i < this.employees.length; i++) {
            if(this.employees[i] != null && employees[i].getID() == id) {
                this.employees[i].setSalary(newSalary);
                System.out.println("Изменена ЗП сотруднику: " + this.employees[i]);
                break;
            }
        }
    } // end of method changeSalary

    public void changeDepartment(int id, int newDepartment) {
        for (int i = 0; i < this.employees.length; i++) {
            if(this.employees[i] != null && employees[i].getID() == id) {
                this.employees[i].setDepartment(newDepartment);
                System.out.println("Изменен отдел сотруднику: " + this.employees[i]);
                break;
            }
        }
    } // end of method changeDepartment

    public void printEmployeesByDepartments() {
        int numOfDepartments = 5;  // число отделов из условий 1-5

        for (int i = 1; i <= numOfDepartments; i++) {
            System.out.println("____ОТДЕЛ № " + i + " СПИСОК СОТРУДНИКОВ________________");
            for (int j = 0; j < this.employees.length; j++) {
                if(this.employees[j].getDepartment() == i)  {
                    System.out.println(this.employees[j].getLastName() + " " + this.employees[j].getFirstName() + " " + this.employees[j].getMiddleName());
                }
            }
            System.out.println();
        }

    } // end of method changeDepartment


    public void printAllEmployeesData() {
        for (int i = 0; i < this.employees.length; i++) {
            if(this.employees[i] != null) {
                System.out.println(this.employees[i]);
            }
        }
    } // end of method printAllEmployeesData

    public void findEmployeesByLastName(String lastName) {
        for (int i = 0; i < this.employees.length; i++) {
            if(employees[i].getLastName().equals(lastName)) {
                System.out.println(this.employees[i]);
            }
        }
    } // end of method indEmployeesByLastName

} // end of EmployeeBook

