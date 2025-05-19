package logistics.packageTypes;

import logistics.interfaces.Package;

public class ElectronicsPackage implements Package {
    @Override
    public void load() {
        System.out.println("ელექტრონული პაკეტი შეიფუტოს ფრთხილად და იყოს დაცული!");
    }
    @Override
    public void deliver() {
        System.out.println("ელექტრონული პაკეტი გაიგზავნოს სპეციალური ტრანსპორტით!");
    }
}
