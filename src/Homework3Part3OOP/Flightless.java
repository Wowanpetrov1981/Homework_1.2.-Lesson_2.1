package Homework3Part3OOP;

public class Flightless extends Birds {
    private String typeOfMovement;

    public void walk() {

    }

    public Flightless(String nickname, int age, String livingEnvironment, String typeOfMovement) {
        super(nickname, age, livingEnvironment);
        this.typeOfMovement = typeOfMovement;
    }

    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    public void setTypeOfMovement(String typeOfMovement) {
        this.typeOfMovement = validationCheck(typeOfMovement, DEFAULT_STRING_VALUE);
    }

    @Override
    public String toString() {
        return "Нелетающие {" + getNickname() + ", " +
                "возраст - " + getAge() + " лет, " +
                "среда проживания - " + getLivingEnvironment() + ", " +
                "тип передвижения - " + typeOfMovement +
                '}';
    }

    @Override
    public void go() {
        super.go();
//        System.out.println("Перемещаются по земле, но может летать на небольшие расстояния");
    }

    @Override
    public void eat() {
        super.eat();
//        System.out.println("Ест семена, ягоды, плоды");

    }
}
