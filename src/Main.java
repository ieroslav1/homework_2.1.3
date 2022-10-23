import Transport.Car;

public class Main {
    public static void main(String[] args) {

        Car lada = new Car(null, "Granta", 1.7, null, 2015,
                "Россия", "механика", "хетчбэк", "e222xx05",
                5, true);
        Car audi = new Car("Audi", "A8", 3.0, "чёрный", 2020,
                "Германия", "автомат", "седан", "a111mp198",
                0, false);
        Car bmw = new Car("BMW", "Z8", 3.0, "чёрный", 2021,
                "Германия", "автомат", "седан", "o666aa157",
                5, false);
        Car kia = new Car("Kia", "Sportage", 2.4, "голубой", 2018,
                "Южная Корея", "механика", "кроссовер", "a985mm345",
                0, true);
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016,
                "Южная Корея", "механика", "седан", "999mp545",
                5, true);

        lada.car();
        audi.car();

        bmw.changeTyres();
        System.out.println(bmw.isSummerTyre());

        kia.checkNumber();
        System.out.println(kia.getRegNumber());

        hyundai.checkNumber();
        System.out.println(hyundai.getRegNumber());

    }
}