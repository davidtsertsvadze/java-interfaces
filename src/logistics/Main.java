package logistics;

import logistics.interfaces.Package;
import logistics.packageTypes.ClothingPackage;
import logistics.packageTypes.ElectronicsPackage;
import logistics.packageTypes.FoodPackage;

public class Main {
    public static void main(String[] args) {
        logistics.interfaces.Package food = new FoodPackage();
        logistics.interfaces.Package clothing = new ClothingPackage();
        Package electronics = new ElectronicsPackage();

        food.load();
        clothing.load();
        electronics.load();

        food.deliver();
        clothing.deliver();
        electronics.deliver();

    }
}
