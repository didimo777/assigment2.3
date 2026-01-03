public class Bus extends Vehicle implements Servicable {

    public Bus(String model, int year, double basePrice) {

        super(model, year, basePrice);
    }

    @Override
    public double calculateInsuranceFee() {

        return basePrice * 0.08;
    }

    @Override
    public void performService() {
        System.out.println("Bus " + model + " serviced");
    }
}
