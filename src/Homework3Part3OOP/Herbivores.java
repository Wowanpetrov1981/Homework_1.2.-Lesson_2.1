package Homework3Part3OOP;

import java.util.Objects;

public class Herbivores extends Mammals {
    private String typeOfFood;

    public void graze() {

    }

    public Herbivores(String nickname, int age, String livingEnvironment, double movementSpeed, String typeOfFood) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Herbivores that = (Herbivores) o;
        return typeOfFood.equals(that.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfFood);
    }

    @Override
    public String toString() {
        return "Травоядное животное {" + getNickname() + ", " +
                "возраст - " + getAge() + " года, " +
                "среда проживания - " + getLivingEnvironment() + ", " +
                "скорость перемещения - " + getMovementSpeed() + " км/ч, " +
                "тип пищи - " + typeOfFood +
                '}';
    }

    @Override
    public void go() {
        super.go();
        System.out.println("Перемещается когда пасётся");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Ест траву");
    }
}
