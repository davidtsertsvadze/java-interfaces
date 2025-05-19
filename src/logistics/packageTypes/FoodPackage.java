package logistics.packageTypes;

import logistics.interfaces.Package;

public class FoodPackage implements Package {
    @Override
    public void load() {
        System.out.println("საკვები პაკეტი ჩაიტვირთოს მაცივარში!");
    }

    @Override
    public void deliver() {
        System.out.println("საკვები პაკეთი გაიგზავნოს სწრაფი მიწოდებით!");
    }
}
