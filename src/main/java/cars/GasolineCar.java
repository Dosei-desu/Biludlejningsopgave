package cars;

public class GasolineCar extends Car{
    private int octaneNumber;
    private int kmPerL;

    public GasolineCar(String registrationNumber, String brand, String model, int year, int numberOfDoors,
                        int octaneNumber, int kmPerL) {
        super(registrationNumber, brand, model, year, numberOfDoors);
        this.octaneNumber = octaneNumber;
        this.kmPerL = kmPerL;
    }

    /*
    For en Benzinbil er afgiften afhængig af kmPrL.
    Hvis den er mellem 20 og 50 er den 330kr, mellem 15 og 20 er den 1050 kr,
    mellem 10 og 15 er den 2340kr, mellem 5 og 10 er den 5500kr, og under 5 er den 10470kr.
     */

    @Override
    public double calcGreenTax() {
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
               getOctaneNumber()+"-octane : "+kmPerL+" km per litre";
    }

    public int getOctaneNumber() {
        return octaneNumber;
    }

    public void setOctaneNumber(int octaneNumber) {
        this.octaneNumber = octaneNumber;
    }

    public int getKmPerL() {
        return kmPerL;
    }

    public void setKmPerL(int kmPerL) {
        this.kmPerL = kmPerL;
    }
}
