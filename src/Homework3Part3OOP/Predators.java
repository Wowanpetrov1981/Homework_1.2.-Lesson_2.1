package Homework3Part3OOP;

public class Predators extends Mammals {
    private String typeOfFood;

    public void hunt() {

    }

    public Predators(String nickname, int age, String livingEnvironment, double movementSpeed, String typeOfFood) {
        super(nickname, age, livingEnvironment, movementSpeed);
        this.typeOfFood = typeOfFood;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = validationCheck(typeOfFood, DEFAULT_STRING_VALUE);
    }

    @Override
    public String toString() {
        return "Хищник {" + getNickname() + ", " +
                "возраст - " + getAge() + " лет, " +
                "среда проживания - " + getLivingEnvironment() + ", " +
                "скорость перемещения - " + getMovementSpeed() + " км/ч, " +
                "тип пищи - " + typeOfFood +
                '}';
    }

    @Override
    public void go() {
        super.go();
        System.out.println("Перемещаестя когда охотиться");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Ест мясо");
    }
}
