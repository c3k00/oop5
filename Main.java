package oop5;

import oop5.AutoMat.Beverage;
import oop5.AutoMat.HotDrink;
import oop5.Control.HotDrinksMachine;
import oop5.Control.VendingMachineController;
import oop5.Inter.ConsoleView;
import oop5.Inter.VendingMachine;

public class Main {

    public static void main(String[] args) {

        HotDrinksMachine machine = new HotDrinksMachine();

        HotDrink tea = machine.getProduct(1, 200, 80);
        HotDrink coffee = machine.getProduct(2, 150, 90);

        System.out.println(tea.getName() + " " + tea.getVolume() + " мл. " + tea.getTemperature() + "°C" + "\n\tЦена: " + tea.getPrice() + " ₽");
        System.out.println(coffee.getName() + " " + coffee.getVolume() + " мл. " + coffee.getTemperature() + "°C" + "\n\tЦена: " + coffee.getPrice() + " ₽");
    }

}
  
