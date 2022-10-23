package Transport;

public class Car {

    private final String brand;
    private final String model;
    private Double engineVolume;
    private String color;
    private final Integer productionYear;
    private final String productionCountry;

    private String transmission;
    private final String bodyType;
    private String regNumber = "х000хх000";
    private final int seatNumber;
    private boolean summerTyre;

    public Car(String brand,
               String model,
               Double engineVolume,
               String color,
               Integer productionYear,
               String productionCountry,
               String transmission,
               String bodyType,
               String regNumber,
               int seatNumber,
               boolean summerTyre) {

        if (nullOrEmpty(brand)) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        this.model = model;
        this.engineVolume = engineVolume;

        if (nullOrEmpty(color)) {
            this.color = "белый";
        } else {
            this.color = color;
        }

        this.productionYear = productionYear;
        this.productionCountry = productionCountry;

        if (nullOrEmpty(transmission)) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }

        if (nullOrEmpty(bodyType)) {
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }

        this.regNumber = regNumber;

        if (seatNumber <= 0) {
            this.seatNumber = 2;
        } else {
            this.seatNumber = seatNumber;
        }
        this.summerTyre = summerTyre;

    }

    public static boolean nullOrEmpty(String value) {
        return value == null || value.isBlank();
    }

    public void changeTyres() {
        this.summerTyre = !this.summerTyre;
    }

    public void car() {
        System.out.println(brand + " " + model + ", " + productionYear + " года выпуска, сборка: "
                + productionCountry + ", цвет: " + color + ", объём двигателя: " + engineVolume +
                ", трансмиссия: " + transmission + ", кузов: " + bodyType + ", регистрационный номер: "
                + regNumber + ", кол-во мест: " + seatNumber + ", шины: " + summerTyre);
    }

/*     if (color == null) {
        this.color = "белый";
    } else {
        this.color = color;
    }
     if (regNumber.length() != 9) {
        System.out.println("неправильный формат номера");
    } else {
        System.out.println(regNumber);;
    }
        if (this.regNumber.matches("[a-z]\\d{3}[a-z]{2}\\d{3}")) {
        this.regNumber = regNumber;
    } else {
        this.regNumber = "неправильный формат номера";
    }
    char[] number = this.regNumber.toCharArray();
        if (!Character.isAlphabetic(number[0])) {
        System.out.println("неправильный формат номера");
    } else {
        this.regNumber = regNumber;
    }*/

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

    public String getBodyType() {
        return bodyType;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public Double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(Double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public boolean isSummerTyre() {
        return summerTyre;
    }

    public void setSummerTyre(boolean summerTyre) {
        this.summerTyre = summerTyre;
    }

    public void checkNumber() {

        if (this.regNumber.matches("[a-z]\\d{3}[a-z]{2}\\d{3}")) {
            this.regNumber = this.regNumber;
        } else {
            this.regNumber = "неверный формат номера";
        }

    }

}
