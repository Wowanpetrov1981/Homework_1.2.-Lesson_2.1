
public abstract class Transport {
    private String brand;
    private String model;
    private int productionYear;
    private String productionCountry;
    private String color;
    private double maximumMovementSpeed;
    private static final String DEFAULT_STRING_VALUE = "default";

    public Transport(String brand) {
        this.brand = brand;
    }

    public Transport(String brand, String model, int productionYear, String productionCountry, String color, double maximumMovementSpeed) {
        this.brand = brand;
        this.model = model;
        this.productionCountry = validationCheck(productionCountry, DEFAULT_STRING_VALUE);
        this.productionYear = productionYear > 0 ? productionYear : 2000;
        this.color = color;
        this.maximumMovementSpeed = maximumMovementSpeed;
        this.refill();
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = validationCheck(brand, DEFAULT_STRING_VALUE);;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = validationCheck(model, DEFAULT_STRING_VALUE);
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = validationCheck(color, "белый");
    }

    public double getMaximumMovementSpeed() {
        return maximumMovementSpeed;
    }

    public void setMaximumMovementSpeed(double maximumMovementSpeed) {
        this.maximumMovementSpeed = maximumMovementSpeed > 0 ? maximumMovementSpeed : 180;
        this.maximumMovementSpeed = maximumMovementSpeed;
    }
    public static String validationCheck(String value, String defaultValue) {
        if (value == null || value.isEmpty() || value.isBlank()) {
            return defaultValue;
        } else {
            return value;
        }

    }

    public abstract void refill();

}
