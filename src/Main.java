public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание 1 задание 3 к уроку 2.1");
        System.out.println();

        Car lada = new Car("Lada ", "Granta", 2015, "Россия", "желтый", 1.7);
        lada.informationAboutTheCar();
        Car audi = new Car("Audi ", "A8 50 L TDI quattro", 2020, "Германия", "черный", 3.0);
        audi.informationAboutTheCar();
        Car bmw = new Car("BMW ", "Z8", 2021, "Германия", "черный", 3.0);
        bmw.informationAboutTheCar();
        Car kia = new Car("Kia ", "Sportage 4-го поколения", 2018, "Южная Корея", "красный", 2.4);
        kia.informationAboutTheCar();
        Car hyundai = new Car("Hyundai ", "Avante", 2016, "Южная Корея", "оранжевый", 1.6);
        hyundai.informationAboutTheCar();
    }
}