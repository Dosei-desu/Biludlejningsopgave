import cars.DieselCar;
import cars.ElectricCar;
import cars.GasolineCar;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage("Tom's Garage");
        garage.addCar(new GasolineCar("0001","Smurfle","L2",
                1993,4,93,12));
        garage.addCar(new DieselCar("0002","Smurfle","P7",
                2011,4,false,19));
        garage.addCar(new ElectricCar("0003","Meeple","SL02",
                2024,2,24,90,180));
        garage.addCar(new GasolineCar("0004","Höll","Smjäl",
                1822,2,100,2));

        System.out.println("Cars in "+garage.getGarageName()+":\n"+garage);
        System.out.println("Total green tax for all "+garage.getCarsInGarage().size()+
                " cars in "+garage.getGarageName()+": "+garage.calcGreenTaxSum()+" kr.");
    }
}
