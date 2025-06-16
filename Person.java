abstract class Person implements Payable {
    protected String name;
    protected int id;
    private static int employeeCount = 0;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
        employeeCount++;
    }

    public abstract void displayInfo();

    public static int getEmployeeCount() {
        return employeeCount;
    }
}
