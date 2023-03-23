public class Employee {
    private String firstName;
    private String middleName;
    private String lastName;
    private int salary;   // тип int взят намерено, в предположении достаточности точности расчетов ЗП до рублей
    private String department;
    private int id;

    public Employee(int id, String firstName, String middleName, String lastName, int salary, String department) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.salary = salary;
        this.department = department;
    }
        // all getters
        public int getID() {
            return this.id;
        }
        public String getFirstName() {
            return firstName;
        }
        public String getMiddleName() {
            return middleName;
        }
        public String getLastName() {
            return lastName;
        }
        public int getSalary() {
            return salary;
        }
        public String getDepartment() {
            return department;
        }
        // all setters
        public void setID(int id) {
            this.id = id;
        }
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }
        public void setMiddleName(String middleName) {
            this.middleName = middleName;
        }
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
        public void setSalary(int salary) {
            this.salary = salary;
        }
        public void setDepartment(String department) {
            this.department = department;
        }


        @Override
        public String toString() {
            return "ФИО=" + this.lastName + " " + this.firstName + " " + this.middleName + ", id=" + this.id + ", ФЗП=" + salary + ", отдел=" + this.department;
        }


}
