class Employee extends Person {
    protected double salary;

    public Employee(String name, int id, double salary) {
        super(name, id);
        this.salary = salary;
    }

    @Override
    public double calculatePay() {
        return salary;
    }

    @Override
    public void displayInfo() {
        System.out.println("Employee: " + name + ", ID: " + id);
        System.out.println("Monthly Pay: Rs " + calculatePay());
    }
}
