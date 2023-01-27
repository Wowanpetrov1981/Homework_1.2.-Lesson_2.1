package Homework3Part3OOP;

public class Mammals extends Animals {

    private String livingEnvironment;
    private double movementSpeed;

    public void walk() {

    }


    public Mammals(String nickname, int age, String livingEnvironment, double movementSpeed) {
        super(nickname, age);
        this.livingEnvironment = livingEnvironment;
        this.movementSpeed = movementSpeed;
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = validationCheck(livingEnvironment, DEFAULT_STRING_VALUE);
    }

    public double getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(double movementSpeed) {
        this.movementSpeed = movementSpeed > 0 ? movementSpeed : 5;
    }
}
