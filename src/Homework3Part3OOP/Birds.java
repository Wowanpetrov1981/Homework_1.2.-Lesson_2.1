package Homework3Part3OOP;

public class Birds extends Animals {
    private String livingEnvironment;

    public void hunt() {

    }

    public Birds(String nickname, int age, String livingEnvironment) {
        super(nickname, age);
        this.livingEnvironment = livingEnvironment;
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = validationCheck(livingEnvironment, DEFAULT_STRING_VALUE);
    }
}
