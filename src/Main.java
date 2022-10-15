public class Main {
    public static void main(String[] args) {

        Car lada = new Car("Lada", "Granta", 1.7F, "жёлтый", 2015,
                "Россия");
        Car audi = new Car("Audi", "A8", 3.0F, "чёрный", 2020,
                "Германия");
        Car bmw = new Car("BMW", "Z8", 3.0F, "чёрный", 2021,
                "Германия");
        Car kia = new Car("Kia", "Sportage", 2.4F, "красный", 2018,
                "Южная Корея");
        Car hyundai = new Car("Hyundai", "Avante", 1.6F, "оранжевый", 2016,
                "Южная Корея");

        lada.car();
        audi.car();
        bmw.car();
        kia.car();
        hyundai.car();
    }
}