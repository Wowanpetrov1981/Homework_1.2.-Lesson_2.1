public class Train extends Transport {
    double t0hePriceOfTheTrip;
    int travelTime;
    String nameOfTheDepartureStation;
    String finalStop;
    int numberOfWagons;
    private static final String DEFAULT_STRING_VALUE = "default";

//    public Train(String brand, double t0hePriceOfTheTrip, String travelTime, String nameOfTheDepartureStation, String finalStop, int numberOfWagons) {
//        super(brand);
//        this.t0hePriceOfTheTrip = t0hePriceOfTheTrip;
//        this.travelTime = travelTime;
//        this.nameOfTheDepartureStation = nameOfTheDepartureStation;
//        this.finalStop = finalStop;
//        this.numberOfWagons = numberOfWagons;

    public Train (String brand,
                 String model,
                 int productionYear,
                 String productionCountry,
                 String color,
                 double maximumMovementSpeed,
                 int travelTime,
                 String nameOfTheDepartureStation,
                 String finalStop,
                 double t0hePriceOfTheTrip,
                 int numberOfWagons) {
        super(brand, model, productionYear, productionCountry, color, maximumMovementSpeed);
        this.t0hePriceOfTheTrip = t0hePriceOfTheTrip;
        this.travelTime = travelTime;
        this.nameOfTheDepartureStation = nameOfTheDepartureStation;
        this.finalStop = finalStop;
        this.numberOfWagons = numberOfWagons;
        setT0hePriceOfTheTrip(t0hePriceOfTheTrip);
    }

    public double getT0hePriceOfTheTrip() {
        return t0hePriceOfTheTrip;
    }

    public void setT0hePriceOfTheTrip(double t0hePriceOfTheTrip) {
        this.t0hePriceOfTheTrip = t0hePriceOfTheTrip > 0 ? t0hePriceOfTheTrip : 50;
    }

    public int getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(int travelTime) {
        this.travelTime = travelTime > 0 ? travelTime : 3;

    }

    public String getNameOfTheDepartureStation() {
        return nameOfTheDepartureStation;
    }

    public void setNameOfTheDepartureStation(String nameOfTheDepartureStation) {
        this.nameOfTheDepartureStation = validationCheck(nameOfTheDepartureStation, DEFAULT_STRING_VALUE);
    }

    public String getFinalStop() {
        return finalStop;
    }

    public void setFinalStop(String finalStop) {
        this.finalStop = validationCheck(finalStop, DEFAULT_STRING_VALUE);
        this.finalStop = finalStop;
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        this.numberOfWagons = numberOfWagons > 0 ? numberOfWagons : 5;
    }

    @Override
    public String toString() {
        return  "Поезд " + getBrand() + ", модель "
                + getModel() + ", цвет - "
                + getColor() + ", "
                + getProductionYear() + " года выпуска в "
                + getProductionCountry() + ", скорость передвижения - "
                + getMaximumMovementSpeed() + " км/ч, время поездки - "
                + travelTime + " часов, отходит от "
                + nameOfTheDepartureStation + " и следует до станции "
                + finalStop + ". Цена поездки - "
                + t0hePriceOfTheTrip + " рублей, в поезде "
                + numberOfWagons + " вагонов.";
    }

    @Override
    public void refill() {
        System.out.println("Заправлять дизелем");
    }
}
