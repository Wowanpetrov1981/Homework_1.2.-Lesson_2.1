import Homework3Part3OOP.*;

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
                180,
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
        Car audi = new Car("Audi",
                "A8 50 L TDI quattro",
                2020,
                "Германия",
                "черный",
                260,
                3.0,
                "automatic",
                "sedan",
                "В872МА177",
                5,
                true,
                new Car.Key(true, true),
                new Car.Insurance(LocalDate.now().plusMonths(-2), 5000.0f, "987654321"));
        System.out.println(audi);

        if (audi.getInsurance().isInsuranceValid()) {
            System.out.println("Страховка просрочена");
//        Car bmw = new Car("BMW", "Z8", 2021, "Германия", "черный", 3.0);
//        System.out.println(bmw);
//        Car kia = new Car("Kia", "Sportage 4-го поколения", 2018, "Южная Корея", "красный", 2.4);
//        System.out.println(kia);
//        Car hyundai = new Car("Hyundai", "Avante", 2016, "Южная Корея", "оранжевый", 1.6);
//        System.out.println(hyundai);
        }
        System.out.println();
        System.out.println("ООП. Часть 3. Домашнее задание 1. Задание 2");
        Train train1 = new Train("Ласточка",
                "B-901",
                2011,
                "Россия",
                "красный",
                301,
                5,
                "Беларусского вокзала ",
                "Минск-Пассажирский",
                3500,
                11
        );
        System.out.println(train1);
        Train train2 = new Train("Ленинград",
                "D-125",
                2019,
                "Россия",
                "синий",
                270,
                7,
                "Ленинградского вокзала",
                "Ленинград-Пассажирский",
                1700,
                8
        );
        System.out.println(train2);
        System.out.println();
        System.out.println("ООП. Часть 3. Домашнее задание 1. Задание 3");
        Bus bus1 = new Bus("Ikarus",
                "256",
                1998,
                "Венгрии",
                "красный",
                106,
                true);
        System.out.println(bus1);
        Bus bus2 = new Bus("Setra",
                "S315GT-HD",
                2000,
                "Германии",
                "белый",
                160,
                false
        );
        System.out.println(bus2);
        Bus bus3 = new Bus("Scania",
                "113",
                2001,
                "Шведции",
                "серый",
                140,
                false);
        System.out.println(bus3);
        System.out.println();
        System.out.println("ООП. Часть 3. Домашнее задание 3. Задание 1");
        Herbivores gazelle = new Herbivores("Газель", 3, "лес", 105, "трава");
        System.out.println(gazelle);
        gazelle.go();
        gazelle.eat();
        Herbivores giraffe = new Herbivores("Жираф", 4, "саванна", 55, "трава");
        System.out.println(giraffe);
        giraffe.go();
        giraffe.eat();

        Herbivores horse = new Herbivores("Лошадь", 6, "домашнее подворье", 69, "сено");
        System.out.println(horse);
        horse.go();
        horse.eat();
        System.out.println();

        Predators hyena = new Predators("Hyena", 5, "саванна",
                65, "падаль");
        System.out.println(hyena);
        hyena.go();
        hyena.eat();

        Predators tiger = new Predators("Tiger", 11, "тропические леса",
                60, "копытные животный");
        System.out.println(tiger);
        tiger.go();
        tiger.eat();

        Predators bear = new Predators("Bear", 9, "леса", 50, "рыба");
        System.out.println(bear);
        bear.go();
        bear.eat();
        System.out.println();

        Amphibians frog = new Amphibians("Лягушка", 3, "болото");
        System.out.println(frog);
        frog.go();
        frog.eat();

        Amphibians alreadyFreshwater = new Amphibians("Уж пресноводный", 4, "водоёмы");
        System.out.println(alreadyFreshwater);
        alreadyFreshwater.go();
        alreadyFreshwater.eat();
        System.out.println();

        Flightless peacock = new Flightless("Павлин", 12, "леса и саванны", "наземный");
        System.out.println(peacock);
        peacock.go();
        System.out.println("Павлины перемещаются по земле, но могут летать на небольшие расстояния");
        peacock.eat();
        System.out.println("Ест семена, ягоды, плоды");

        Flightless penguin = new Flightless("Пингвин", 8, "в прибрежных водах Антарктики", "водный");
        System.out.println(penguin);
        penguin.go();
        System.out.println("Пингвины хорошо перемещаются в воде. По суше ходят в развалку");
        penguin.eat();
        System.out.println("В основу рациона питания пингвинов входит рыба, ракообразные, планктон, а также небольшие представители головоногих моллюсков.");
        System.out.println();

        Flightless dodoBird = new Flightless("Птица додо", 7, "остров Маврикий", "наземный");
        System.out.println(dodoBird);
        dodoBird.go();
        System.out.println("Перемещается только по земле");
        dodoBird.eat();
        System.out.println("Птица додо питается пальмовыми плодами, почами, листьями, орехами, маллюсками.");
        System.out.println();

        Flying seagull = new Flying("Чайка",
                12,
                "на территории России, Евразии и побережьях Канады",
                "воздушный и наземный");
        System.out.println(seagull);
        seagull.go();
        System.out.println("Чайки прекрасные летуны, но и по суше ходят хорошо");
        seagull.eat();
        System.out.println("Чайки охотятся на крабов, рыбу, насекомых, грызунов, моллюсков");
        System.out.println();

        Flying albatross = new Flying("Альбатрос",
                50,
                "ледяные воды Антарктиды, и Южное полушарие",
                "воздушный");
        System.out.println(albatross);
        albatross.go();
        System.out.println("Альбатросы способны совершать длительные перелеты, " +
                "погружаться за своей добычей в воду на глубину до пяти метров");
        albatross.eat();
        System.out.println("Рацион альботросов состоит из небольших кальмаров, рыбы, креветок, криля");
        System.out.println();

        Flying falcon = new Flying("Сокол",
                5,
                "характеризуются обширным ареалом распространения," +
                        " который охватывает практически всю Землю, исключая полюсные области",
                "воздушный");
        System.out.println(falcon);
        falcon.go();
        System.out.println("Соколы могут летать со скоростью больше 300 км/час");
        falcon.eat();
        System.out.println("Соколы употребляют в пищу объекты животного происхождения в виде мелких пернатых," +
                " грызунов, насекомых и т.д., включая лягушек, змей, а также рыбу.");
    }







}