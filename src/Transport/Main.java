package Transport;

import Transport.Car;
import Transport.Car.Key;
import Transport.Car.Insurance;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car(null, "Granta", 1.7, null, 2015,
                "Россия", "механика", "хетчбэк", "х111ам05",
                5, true, 200);
        Car audi = new Car("Audi", "A8", 3.0, "чёрный", 2020,
                "Германия", "автомат", "седан", "а111мр198",
                0, false, 180);
        Car bmw = new Car("BMW", "Z8", 3.0, "чёрный", 2021,
                "Германия", "автомат", "седан", "о666аа157",
                5, false, 240);
        Car kia = new Car("Kia", "Sportage", 2.4, "голубой", 2018,
                "Южная Корея", "механика", "кроссовер", "а985мм345",
                0, true, 190);
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016,
                "Южная Корея", "механика", "седан", "999мр545",
                5, true, 0);

        lada.car();
        audi.car();

        System.out.println();

        bmw.changeTyres();
        System.out.println(bmw.isSummerTyre());

        kia.checkNumber();
        System.out.println(kia.getRegNumber());

        hyundai.checkNumber();
        System.out.println(hyundai.getRegNumber());

        System.out.println();

        Train martin = new Train("Ласточка", "В-901", 2001, "Россия",
                "голубой", 301, 3500, 10, "Белорусский вокзал",
                "Минск-Пассажирский", 11);
        Train leningrad = new Train("Ленинград", "D-125", 2019, "Россия",
                "красный", 270, 1700, 9, "Ленинград",
                "Ленинград-Пассажирский", 8);

        System.out.println(martin);
        System.out.println(leningrad);

        System.out.println();

        Bus ikarus = new Bus("Икарус", "И-25", 1980, "Венгрия", "жёлтый",
                150, 60, 30, "Купчино",
                "Московский вокзал", 1);
        Bus paz = new Bus("ПАЗ", "П-30", 1989, "Россия", "белый",
                120, 30, 10, "Звёздная",
                "Шушары", 1);
        Bus liaz = new Bus("ЛИАЗ", "Л-3", 1990, "Россия", "синий",
                100, 40, 20, "Ладожская",
                "Колтуши", 1);

        System.out.println(ikarus);
        System.out.println(paz);
        System.out.println(liaz);
    }
}