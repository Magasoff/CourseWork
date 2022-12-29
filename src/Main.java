public class Main {
    public static void main(String[] args) {
        Employee[] empl = new Employee[10];
        empl[0] = new Employee(1, "Иванов Алексей Иванович", 1, 25550f);
        empl[1] = new Employee(2, "Алексеев Алексей Алексеевич", 2, 35000f);
        empl[2] = new Employee(3, "Антонов Андрей Иванович", 3, 43200f);
        empl[3] = new Employee(4, "Сидоров Андрей Иванович", 4, 62000f);
        empl[4] = new Employee(5, "Петров Аркадий Аркадьевич", 5, 60430f);
        for (Employee e : empl) {
            System.out.println(e);

    }
}