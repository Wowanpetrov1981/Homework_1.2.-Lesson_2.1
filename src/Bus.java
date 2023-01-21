public class Bus extends Transport {
    public Bus(String brand) {
        super(brand);
    }

    public Boolean istDieselEngine() {
        return dieselEngine;
    }

//    public void setDieselEngine(Boolean dieselEngine) {
//        this.dieselEngine = dieselEngine;
//    }

    private Boolean dieselEngine;
//    private Boolean petrolEngine = false;

    public Bus(String brand, String model, int productionYear, String productionCountry, String color, double maximumMovementSpeed, boolean dieselEngine) {
        super(brand, model, productionYear, productionCountry, color, maximumMovementSpeed);
//        setDieselEngine(dieselEngine);
    }


    @Override
    public String toString () {
        return "Автобус " + getBrand() + ", модель "
                + getModel() + ", цвет - "
                + getColor() + ", "
                + getProductionYear() + " года выпуска в "
                + getProductionCountry() + ", скорость передвижения - "
                + getMaximumMovementSpeed() + " км/ч, "
                + istDieselEngine();

    }
    @Override
    public void refill() {
            System.out.println("На заправке заправлять дизелем или бензином");

        }

}
