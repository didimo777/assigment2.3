public abstract class Vehicle {

    protected String model;
    protected int year;
    protected double basePrice;

    public Vehicle(String model, int year, double basePrice) {
        this.model = model;
        this.year = year;
        this.basePrice = basePrice;
    }

    public int getAge() {
        return 2025 - year;
    }

    public abstract double calculateInsuranceFee();

    @Override
    public String toString() {
        return model + " (" + year + ")";
    }
}
