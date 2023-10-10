package oop5.Control;

import oop5.AutoMat.HotDrink;
import oop5.Inter.VendingMachine;

public class HotDrinksMachine implements VendingMachine {

  @Override
  public HotDrink getProduct(int name, int volume, int temperature) {

    int price = 0;

    if (name == 1) {
      price = 30;
      return new HotDrink("Чай", volume, temperature, price);

    } else if (name == 2) {
      price = 50;
      return new HotDrink("Кофе", volume, temperature, price);
    }

    return null;
  }

}
