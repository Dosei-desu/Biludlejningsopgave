import cars.Car;

import java.util.ArrayList;

public class Garage {
    private String garageName;
    private ArrayList<Car> carsInGarage = new ArrayList<>();

    public Garage(String garageName){
        this.garageName = garageName;
    }

    public void addCar(Car car){
        carsInGarage.add(car);
    }

    public double calcGreenTaxSum(){
        double sum = 0;

        for (Car car: carsInGarage) {
            sum += car.calcGreenTax();
        }

        return sum;
    }

    @Override
    public String toString(){
        StringBuilder string = new StringBuilder();
        for (Car car: carsInGarage) {
            string.append("--------------\n").append(car).append("\n").
                    append(car.calcGreenTax()).append(" kr. in green tax\n");
        }
        return string.toString().trim()+"\n--------------";
    }

    public String getGarageName() {
        return garageName;
    }

    public ArrayList<Car> getCarsInGarage() {
        return carsInGarage;
    }
}
