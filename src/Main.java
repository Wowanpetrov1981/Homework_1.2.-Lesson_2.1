import Transport.Car;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание 1 задание 3 к уроку 2.1");
        System.out.println();

        Car lada = new Car("Lada",
                "Granta",
                2015,
                "Россия",
                "желтый",
                1.7,
                "mechanics",
                "седан",
                "А778АА177",
                5,
                true,
                new Car.Key(true, true),
                new Car.Insurance(LocalDate.now().plusMonths(3), 1000.0f, "123456789"));
        System.out.println(lada);

        if (lada.getInsurance().isInsuranceValid()) {
            System.out.println("Страховка просрочена");
        }
//        Car audi = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германия", "черный", 3.0);
//        System.out.println(audi);
//        Car bmw = new Car("BMW", "Z8", 2021, "Германия", "черный", 3.0);
//        System.out.println(bmw);
//        Car kia = new Car("Kia", "Sportage 4-го поколения", 2018, "Южная Корея", "красный", 2.4);
//        System.out.println(kia);
//        Car hyundai = new Car("Hyundai", "Avante", 2016, "Южная Корея", "оранжевый", 1.6);
//        System.out.println(hyundai);
    }

}