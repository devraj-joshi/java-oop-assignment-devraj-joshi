public class Main {
    public static void main(String[] args) {
        Person emp1 = new Employee("Hari Prasad Khanal", 101, 3000.0);
        Person emp2 = new Manager("Fulkumari Ghaley", 102, 4000.0, 1000.0);
        Person emp3 = new Intern("Hari maya Tamang", 103, 1500.0);

        emp1.displayInfo();
        System.out.println();
        emp2.displayInfo();
        System.out.println();
        emp3.displayInfo();

        System.out.println("\nTotal Employees: " + Person.getEmployeeCount());
    }
}
