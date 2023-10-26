package cars;

public class ElectricCar extends Car{
    private int batteryCapacityKWH;
    private int maxKm;
    private int whPerKm;

    public ElectricCar(String registrationNumber, String brand, String model, int year, int numberOfDoors,
                       int batteryCapacityKWH, int maxKm, int whPerKm) {
        super(registrationNumber, brand, model, year, numberOfDoors);
        this.batteryCapacityKWH = batteryCapacityKWH;
        this.maxKm = maxKm;
        this.whPerKm = whPerKm;
    }

    /*
    For en Elbil gælder de samme regler som for benzinbilen,
    blot skal man først omregne whPrKm til kmPrL. Det gøres
    ved at dividere whPrKm med 91,25 og dernæst dividere 100 med dette tal.
     */

    @Override
    public double calcGreenTax() {
        double kmPerL = 100 / (whPerKm/91.25);
        if (kmPerL >= 50){
            return 0;
        }
        if(kmPerL >= 20){
            return 330;
        }
        if(kmPerL >= 15){
            return 1050;
        }
        if(kmPerL >= 10){
            return 2340;
        }
        if(kmPerL >= 5){
            return 5500;
        }
        return 10470;
    }

    @Override
    public String toString(){
        return "RegNum: "+getRegistrationNumber()+
                "\n\'"+getBrand()+"\' "+getModel()+" ("+getYear()+")\n"+
                getNumberOfDoors()+"-door\n"+
                getBatteryCapacityKWH()+" KWH capacity\n"+
                getMaxKm()+" max km : "+ getWhPerKm()+ " WH per km";
    }

    public int getBatteryCapacityKWH() {
        return batteryCapacityKWH;
    }

    public void setBatteryCapacityKWH(int batteryCapacityKWH) {
        this.batteryCapacityKWH = batteryCapacityKWH;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public int getWhPerKm() {
        return whPerKm;
    }

    public void setWhPerKm(int whPerKm) {
        this.whPerKm = whPerKm;
    }
}
