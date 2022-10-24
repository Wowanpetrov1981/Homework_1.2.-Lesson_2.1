public class CarService {
    public static String validationCheck(String value, String defaultValue) {
        if (value == null || value.isEmpty() || value.isBlank()) {
            return defaultValue;
        } else {
            return value;
        }
        }
}
