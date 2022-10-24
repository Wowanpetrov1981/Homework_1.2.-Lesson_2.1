
public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    Car(String brand, String model, int productionYear, String productionCountry, String color, double engineVolume) {
        this.brand = CarService.validationCheck(brand, "default");
        this.model = CarService.validationCheck(model, "default");
        this.productionCountry = CarService.validationCheck(productionCountry, "default");
        this.engineVolume = engineVolume > 0.0f ? engineVolume : 1.5f;
        this.color = CarService.validationCheck(color, "белый");
        this.productionYear = productionYear > 0 ? productionYear : 2000;
    }


    void informationAboutTheCar() {
        System.out.println(brand + " " + model + ", " + productionYear + " год выпуска, страна сборки - " + productionCountry + ", цвет - " + color + ", объем двигателя — " + engineVolume + " л.");

    }
}
