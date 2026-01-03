public class Car extends Vehicle implements Servicable {

    public Car(String model, int year, double basePrice) {
        super(model, year, basePrice);
    }

    @Override
    public double calculateInsuranceFee() {
        return basePrice * 0.05;
    }

    @Override
    public void performService() {
        System.out.println("Car " + model + " serviced");
    }
}
