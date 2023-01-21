package Homework3Part3OOP;

public class Amphibians extends Animals {
    private String livingEnvironment;

    public void hunt() {

    }
    public Amphibians(String nickname, int age, String livingEnvironment) {
        super(nickname, age);
        this.livingEnvironment = livingEnvironment;
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = validationCheck(livingEnvironment, DEFAULT_STRING_VALUE);
    }

    @Override
    public String toString() {
        return "Земноводные {" + getNickname() + ", " +
                "возраст - " + getAge() + " года, " +
                "среда обитания - " + livingEnvironment +
                '}';
    }

    @Override
    public void go() {
        super.go();
        System.out.println("Перемещается в воде");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Ест мелких рыб");
    }
}
