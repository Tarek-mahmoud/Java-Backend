
public class Demo {
    public static void main(String[] args) {

        //PersonalInfo personalInfo = new PersonalInfo("tarek", "mahmoud", 21); aggregation
        Department department = new Department(232, "demo");    // aggregation
        Employee employee = new Employee(342, 900, "amina", "sala7", 22, department);

        System.out.println(employee);
    }
}
