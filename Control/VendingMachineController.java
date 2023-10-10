package oop5.Control;

import oop5.AutoMat.Beverage;
import oop5.AutoMat.HotDrink;
import oop5.Inter.VendingMachine;

public class VendingMachineController {

    private VendingMachine machine;

    public VendingMachineController(VendingMachine machine) {
        this.machine = machine;
    }

    public Beverage getDrink(int name, int volume, int temp) {
        return machine.getProduct(name, volume, temp);
    }

}
