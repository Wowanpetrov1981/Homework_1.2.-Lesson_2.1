public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;
    String defaultValue = "default";
    double defaultEngineVolume = 1.5;
    String defaultColor = "белый";
    int defaultProductionYear = 2000;

    Car(String brand, String model, int productionYear, String productionCountry, String color, double engineVolume) {
        if (brand != "") {
            this.brand = brand;
        } else {
            this.brand = defaultValue;
        }
        if (model != "") {
            this.model = model;
        } else {
            this.model = defaultValue;
        }
        if (productionCountry != "") {
            this.productionCountry = productionCountry;
        } else {
            this.productionCountry = defaultValue;
        }
        if (engineVolume > 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = defaultEngineVolume;
        }
        if (color != "") {
            this.color = color;
        } else {
            this.color = defaultColor;
        }
        if (productionYear > 0) {
            this.productionYear = productionYear;
        } else {
            this.productionYear = defaultProductionYear;
        }
    }
    void informationAboutTheCar() {
        System.out.println(brand + " " + model + ", " + productionYear + " год выпуска, страна сборки - " + productionCountry + ", цвет - " + color + ", объем двигателя — " + engineVolume + " л.");

    }
}
