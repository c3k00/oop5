package oop5.Inter;

import oop5.AutoMat.Beverage;

public class ConsoleView {

    public void printDrink(Beverage drink) {

        System.out.println(drink.getName() + " " + drink.getVolume() + " мл. " +
                drink.getTemperature() + "°C" + "\n\tЦена: " + drink.getPrice() + " ₽");

    }

}
