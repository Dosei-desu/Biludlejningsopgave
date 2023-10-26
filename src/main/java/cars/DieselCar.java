package cars;

public class DieselCar extends Car{
    private boolean hasParticleFilter;
    private int kmPerL;

    public DieselCar(String registrationNumber, String brand, String model, int year, int numberOfDoors,
                     boolean hasParticleFilter, int kmPerL) {
        super(registrationNumber, brand, model, year, numberOfDoors);
        this.hasParticleFilter = hasParticleFilter;
        this.kmPerL = kmPerL;
    }

    /*
    For en Dieselbil er der samme afgift som for benzinbilen,
    plus en udligningsafgift, som også afhængig af kmPrL. Hvis
    den er mellem 20 og 50 er udligningsafgiften 130kr, mellem
    15 og 20 er den 1390 kr, mellem 10 og 15 er den 1850kr, mellem
    5 og 10 er den 2770kr, og under 5 er den 15260kr. Der er desuden
    en partikeludledningsafgift på 1000 kr hvis bilen ikke har partikelfilter monteret.
     */

    @Override
    public double calcGreenTax() {
        int filterTax = 0;
        if(!hasParticleFilter){
            filterTax = 1000;
        }

        if (kmPerL >= 50){
            return filterTax;
        }
        if(kmPerL >= 20){
            return 330 + 130 + filterTax;
        }
        if(kmPerL >= 15){
            return 1050 + 1390 + filterTax;
        }
        if(kmPerL >= 10){
            return 2340 + 1850 + filterTax;
        }
        if(kmPerL >= 5){
            return 5500 + 2770 + filterTax;
        }
        return 10470 + 15260 + filterTax;
    }

    @Override
    public String toString(){
        return "RegNum: "+getRegistrationNumber()+
                "\n\'"+getBrand()+"\' "+getModel()+" ("+getYear()+")\n"+
                getNumberOfDoors()+"-door\n"+
                "Has particle filter: "+getHasParticleFilter()+
                "\n"+kmPerL+" km per litre";
    }

    public boolean getHasParticleFilter() {
        return hasParticleFilter;
    }

    public void setHasParticleFilter(boolean hasParticleFilter) {
        this.hasParticleFilter = hasParticleFilter;
    }

    public int getKmPerL() {
        return kmPerL;
    }

    public void setKmPerL(int kmPerL) {
        this.kmPerL = kmPerL;
    }
}
