package oop5.Inter;

import oop5.AutoMat.Beverage;
import oop5.AutoMat.HotDrink;

public interface VendingMachine {
    HotDrink getProduct(int name, int volume, int temperature);
}

