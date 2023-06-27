public class Reserve extends AbstractAnimalHome{


    private int moneyOnReserveDay;

    private int numberOfTypesOfAnimals;

    private int numberOfSection;

    public Reserve(String name, String location,int area, int moneyOnReserveDay , int numberOfTypesOfAnimals, int numberOfSection){
        super(name,location,area);
        this.moneyOnReserveDay = moneyOnReserveDay;
        this. numberOfTypesOfAnimals  =  numberOfTypesOfAnimals;
        this. numberOfSection = numberOfSection;
    }

    public String toString() {
        return "Reserve{" +
                "moneyOnReserveDay'" + moneyOnReserveDay + '\'' +
                ",numberOfTypesOfAnimals: " + numberOfTypesOfAnimals +
                ",numberOfSection: " + numberOfSection +
                '}' + super.toString();

    }

    @Override
    protected int calculateCostPerMonth() {
        return 0;
    }

}
