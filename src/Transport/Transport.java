package Transport;

public class Transport {

    private final String brand;
    private final String model;
    private final int productionYear;
    private final String productionCountry;
    private String color;
    private int maxSpeed;

    public Transport(String brand,
                     String model,
                     int productionYear,
                     String productionCountry,
                     String color,
                     int maxSpeed) {

        if (nullOrEmpty(brand)) {
            this.brand = "бренд не указан";
        } else {
            this.brand = brand;
        }

        if (nullOrEmpty(model)) {
            this.model = "модель не указана";
        } else {
            this.model = model;
        }

        this.productionYear = productionYear;
        this.productionCountry = productionCountry;

        if (nullOrEmpty(color)) {
            this.color = "цвет не указан";
        } else {
            this.color = color;
        }

        if (nullOrEmpty(String.valueOf(maxSpeed))) {
            this.maxSpeed = Integer.parseInt("скорость не указана");
        } else {
            this.maxSpeed = maxSpeed;
        }
    }

    public static boolean nullOrEmpty(String value) {
        return value == null || value.isBlank();
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    @Override
    public String toString() {
        return "Бренд: " + '\"' + brand + '\"' +
                ", модель: " + '\"' + model + '\"' +
                ", год: " + '\"' + productionYear + '\"' +
                ", страна: " + '\"' + productionCountry + '\"' +
                ", цвет: " + '\"' + color + '\"' +
                ", максимальная скорость: " + '\"' + maxSpeed + '\"';
    }
}
