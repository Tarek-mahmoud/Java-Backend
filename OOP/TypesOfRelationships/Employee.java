
public class Employee {
    private int id;
    private float salary;
    private PersonalInfo personalInfo;  // relationship:  composition or aggregation
    private Department department;      // relationship:  composition or aggregation

    public Employee(int id, float salary, /*PersonalInfo personalInfo*/ String firstName, String lastName, int age, Department department) {
        this.id = id;
        this.salary = salary;
        // this.personalInfo = personalInfo;    if we passed personal info as a parameter the lifecycle of Employee will be different from lifecycle of Personal info
        this.personalInfo = new PersonalInfo(firstName, lastName, age); // composition ==> two classes have the same lifecycle
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                ", personalInfo=" + personalInfo +
                ", department=" + department +
                '}';
    }
}
