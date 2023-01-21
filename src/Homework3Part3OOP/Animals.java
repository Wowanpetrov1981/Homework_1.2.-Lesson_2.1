package Homework3Part3OOP;

import java.time.LocalDate;

public class Animals {
    private String nickname;
    private int age;
    public static final String DEFAULT_STRING_VALUE = "default";

    public Animals(String nickname, int age) {
        this.nickname = nickname;
        this.age = age;
    }

    public void eat() {

    }

    public void sleep() {

    }

    public String getNickname()  {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = validationCheck(nickname, DEFAULT_STRING_VALUE);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age > 0 ? age : 180;
        this.age = age;
    }

    public void go() {

    }
    public static String validationCheck(String value, String defaultValue) {
        if (value == null || value.isEmpty() || value.isBlank()) {
            return defaultValue;
        } else {
            return value;
        }
    }


}
