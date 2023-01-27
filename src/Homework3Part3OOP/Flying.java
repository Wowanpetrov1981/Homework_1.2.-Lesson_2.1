package Homework3Part3OOP;

public class Flying extends Birds {

    private String typeOfMovement;

    public void toFly() {

    }

    public Flying(String nickname, int age, String livingEnvironment, String typeOfMovement) {
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
        return "Летающие {" + getNickname() + ", " +
                "возраст - " + getAge() + " лет, " +
                "среда проживания - " + getLivingEnvironment() + ", " +
                "тип передвижения - " + typeOfMovement +
                '}';
    }

    @Override
    public void go() {
        super.go();
//        System.out.println("Летают, великолепно плвают и передвигаются по земле");
    }

    @Override
    public void eat() {
        super.eat();
    }
}
