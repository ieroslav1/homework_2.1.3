package Transport;

import java.security.Key;
import java.time.LocalDate;

public class Car extends Transport {
    private Double engineVolume;
    private String transmission;
    private String bodyType;
    private String regNumber = "х000хх000";
    private int seatNumber;
    private boolean summerTyre;

    private Key key;
    private Insurance insurance;

    public Car(String brand, String model, Double engineVolume, String color, int productionYear,
               String productionCountry, String transmission, String bodyType, String regNumber,
               int seatNumber, boolean summerTyre, int maxSpeed) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
        this.engineVolume = engineVolume;

        if (nullOrEmpty(transmission)) {
            this.transmission = "тип трансмиссии не указан";
        } else {
            this.transmission = transmission;
        }

        if (nullOrEmpty(bodyType)) {
            this.bodyType = "тип кузова не указан";
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
        System.out.println(getBrand() + ", " + getModel() + ", " + getProductionYear() + " года выпуска, сборка: "
                + getProductionCountry() + ", цвет: " + getColor() + ", объём двигателя: " + engineVolume +
                ", трансмиссия: " + transmission + ", кузов: " + bodyType + ", регистрационный номер: "
                + regNumber + ", кол-во мест: " + seatNumber + ", шины: " + summerTyre +
                ", максимальная скорость: " + getMaxSpeed());
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

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public void checkNumber() {

        if (this.regNumber.matches("[а-я]\\d{3}[а-я]{2}\\d{3}")) {
            this.regNumber = this.regNumber;
        } else {
            this.regNumber = "неверный формат номера";
        }

    }

    public static class Key {
        private final boolean remoteStartEngine;
        private final boolean noKeyAccess;

        public Key(boolean remoteStartEngine, boolean noKeyAccess) {
            this.remoteStartEngine = remoteStartEngine;
            this.noKeyAccess = noKeyAccess;
        }
    }

    public static class Insurance {
        private final LocalDate insValidity;
        private final double insPrice;
        private final String insNumber;

        public Insurance(LocalDate insValidity, double insPrice, String insNumber) {
            this.insValidity = insValidity;
            if (insValidity.isBefore(LocalDate.now())) {
                System.out.println("Страховка заканчивается");
            }
            if (insNumber.length() != 9) {
                System.out.println("неправильный формат номера");
            }
            this.insPrice = insPrice;
            this.insNumber = insNumber;
        }
    }
}

