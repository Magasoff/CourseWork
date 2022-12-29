public class Employee {
    private String FIO;
    private int Department;
    private float Salary;
    private static int id;

    public Employee(String FIO, int department, float salary) {
        this.FIO = FIO;
        Department = department;
        Salary = salary;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public int getDepartment() {
        return Department;
    }

    public void setDepartment(int department) {
        Department = department;
    }

    public float getSalary() {
        return Salary;
    }

    public void setSalary(float salary) {
        Salary = salary;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Employee.id = id;
    }

    @Override
    public String toString() {
        return "Fio: " + FIO + " Dept: " + Department + " Salary: " + Salary;
    }
}

