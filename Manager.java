class Manager extends Employee {
    private double bonus;

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    @Override
    public double calculatePay() {
        return salary + bonus;
    }

    @Override
    public void displayInfo() {
        System.out.println("Manager: " + name + ", ID: " + id);
        System.out.println("Monthly Pay with Bonus: Rs " + calculatePay());
    }
}
