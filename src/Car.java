public class Car {

    String brand;
    String model;
    float engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    public Car(String brand, String model, float engineVolume, String color,
               int productionYear, String productionCountry) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
    }

    void car() {
        System.out.println(brand + " " + model + ", " + productionYear + " года выпуска, сборка: "
                + productionCountry + ", цвет: " + color + ", объём двигателя: " + engineVolume);
    }
}
