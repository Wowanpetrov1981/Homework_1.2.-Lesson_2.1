package Transport;

import java.awt.image.Kernel;
import java.security.Key;
import java.time.LocalDate;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int productionYear;
    private final String productionCountry;
    private String gearbox;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean winterTires;
    private static final String DEFAULT_STRING_VALUE = "default";
    private final Key key;
    private final Insurance insurance;


    public Car(String brand,
               String model,
               int productionYear,
               String productionCountry,
               String color,
               double engineVolume,
               String gearbox,
               String bodyType,
               String registrationNumber,
               int numberOfSeats,
               boolean winterTires,
               Key key,
               Insurance insurance) {
        this.brand = validationCheck(brand, DEFAULT_STRING_VALUE);
        this.model = validationCheck(model, DEFAULT_STRING_VALUE);
        this.productionCountry = validationCheck(productionCountry, DEFAULT_STRING_VALUE);
        this.productionYear = productionYear > 0 ? productionYear : 2000;
        this.bodyType = validationCheck(bodyType, DEFAULT_STRING_VALUE);
        this.numberOfSeats = numberOfSeats > 0 ? numberOfSeats : 5;
        this.key = key;
        this.insurance = insurance;
        setEngineVolume(engineVolume);
        setColor(color);
        setGearbox(gearbox);
        setRegistrationNumber(registrationNumber);
        setWinterTires(winterTires);

    }

    public void setSeasonTires() {
        int currentMonth = LocalDate.now().getMonthValue();
        this.winterTires = currentMonth <= 4 || currentMonth >= 11;

    }

    public boolean isRegNumberValid() {
        if (this.registrationNumber.length() != 9) {
            return false;
        }
        char[] regNumberChars = this.registrationNumber.toCharArray();
        return isNumberLetter(regNumberChars[1])
                && isNumber(regNumberChars[2])
                && isNumber(regNumberChars[3])
                && isNumber(regNumberChars[4])
                && isNumberLetter(regNumberChars[5])
                && isNumberLetter(regNumberChars[6])
                && isNumber(regNumberChars[7])
                && isNumber(regNumberChars[8])
                && isNumber(regNumberChars[9]);


    }

    private boolean isNumber(char symbol) {
        return Character.isDigit(symbol);
    }

    private boolean isNumberLetter(char symbol) {
        String allowedSymbols = "ABEKМНОРСТУХ";
        return allowedSymbols.contains("" + symbol);
    }
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume > 0.0f ? engineVolume : 1.5f;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = validationCheck(color, "белый");
    }

    public String getGearbox() {
        return gearbox;
    }

    public void setGearbox(String gearbox) {
        this.gearbox = validationCheck(gearbox, DEFAULT_STRING_VALUE);
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = validationCheck(registrationNumber, DEFAULT_STRING_VALUE);
    }

    public boolean isWinterTires() {
        return winterTires;
    }

    public void setWinterTires(boolean winterTires) {
        this.winterTires = winterTires;
    }

    public static String validationCheck(String value, String defaultValue) {
        if (value == null || value.isEmpty() || value.isBlank()) {
            return defaultValue;
        } else {
            return value;
        }
    }

    public Key getKey() {
        return key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    //    void informationAboutTheCar() {
//        System.out.println(brand + " " + model + ", " + productionYear + " год выпуска, страна сборки - " + productionCountry + ", цвет - " + color + ", объем двигателя — " + engineVolume + " л.");
//
//    }
    @Override
    public String toString() {
        return brand + '\''
                + model + ", "
                + productionYear + " год выпуска, страна сборки - " + productionCountry + ", цвет - "
                + color + ", объем двигателя — "
                + engineVolume + " л., коробка передач - "
                + gearbox + ", тип кузова"
                + bodyType + ", регистрационный номер"
                + registrationNumber + ", количество посадочных мест - "
                + numberOfSeats + ", тип шин "
                + winterTires;
    }

    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }
    }

    public static class Insurance {
        private final LocalDate validUntil;
        private final float cost;
        private final String number;

        public Insurance(LocalDate validUntil, float cost, String number) {
            this.validUntil = validUntil != null ? validUntil : LocalDate.now().plusDays(10);
            this.cost = Math.max(cost, 1f);
            this.number = validationCheck(number, DEFAULT_STRING_VALUE);
        }

        public boolean isNumberValid() {
            return number.length() == 9;
        }

        public boolean isInsuranceValid() {
            return LocalDate.now().isBefore(this.validUntil);
        }
    }




}
