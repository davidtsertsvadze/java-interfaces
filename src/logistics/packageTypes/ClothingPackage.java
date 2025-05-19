package logistics.packageTypes;

import logistics.interfaces.Package;

public class ClothingPackage implements Package {
    @Override
    public void load() {
        System.out.println("ტანსაცმლის პაკეტი შეიფუთოს ფრთხილად!");
    }

    @Override
    public void deliver() {
        System.out.println("ტანსაცმლის პაკეტი გაიგზავნოს კურიერის საშუალებით!");
    }
}
