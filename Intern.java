class Intern extends Employee {
    public Intern(String name, int id, double stipend) {
        super(name, id, stipend);
    }

    @Override
    public void displayInfo() {
        System.out.println("Intern: " + name + ", ID: " + id);
        System.out.println("Monthly Pay: Rs " + calculatePay());
    }
}
