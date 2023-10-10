package oop5.AutoMat;

public class HotDrink extends Beverage {

    private int temperature;

    public HotDrink(String name, int volume, int temperature, int price) {
        super(name, volume, price);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

}
