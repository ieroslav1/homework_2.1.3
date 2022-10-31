package Transport;

public class Train extends Transport {

    private int priceOfTrip;
    private int timeOfTrip;
    private String stationOfDeparture;
    private String stationOfDestination;
    private int wagonsAmount;

    public Train(String brand, String model, int productionYear, String productionCountry, String color,
                 int maxSpeed, int priceOfTrip, int timeOfTrip, String stationOfDeparture,
                 String stationOfDestination, int wagonsAmount) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
        this.priceOfTrip = priceOfTrip;
        this.timeOfTrip = timeOfTrip;
        this.stationOfDeparture = stationOfDeparture;
        this.stationOfDestination = stationOfDestination;
        this.wagonsAmount = wagonsAmount;
    }

    public double getPriceOfTrip() {
        return priceOfTrip;
    }

    public void setPriceOfTrip(int priceOfTrip) {
        this.priceOfTrip = priceOfTrip;
    }

    public int getTimeOfTrip() {
        return timeOfTrip;
    }

    public void setTimeOfTrip(int timeOfTrip) {
        this.timeOfTrip = timeOfTrip;
    }

    public String getStationOfDeparture() {
        return stationOfDeparture;
    }

    public void setStationOfDeparture(String stationOfDeparture) {
        this.stationOfDeparture = stationOfDeparture;
    }

    public String getStationOfDestination() {
        return stationOfDestination;
    }

    public void setStationOfDestination(String stationOfDestination) {
        this.stationOfDestination = stationOfDestination;
    }

    public int getWagonsAmount() {
        return wagonsAmount;
    }

    public void setWagonsAmount(int wagonsAmount) {
        this.wagonsAmount = wagonsAmount;
    }

    @Override
    public String toString() {
        return super.toString() + "стоимость поездки: " + '\"' + priceOfTrip + '\"' +
                ", время поездки: " + '\"' + timeOfTrip + '\"' +
                ", год: " + '\"' + stationOfDeparture + '\"' +
                ", страна: " + '\"' + stationOfDestination + '\"' +
                ", цвет: " + '\"' + wagonsAmount + '\"';
    }
}
