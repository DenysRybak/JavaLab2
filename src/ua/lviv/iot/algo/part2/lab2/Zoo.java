public class Zoo extends AbstractAnimalHome{


    private int capacity;

    private int timeWork;

    private int CostsZooOnDay;


    public Zoo(String name, String location,int area, int capacity, int timeWork, int CostsZooOnDay){
        super(name,location,area);
        this.capacity = capacity;
        this.timeWork = timeWork;
        this.CostsZooOnDay = CostsZooOnDay;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "capacity=" + capacity +
                ", timeWork=" + timeWork +
                ", CostsZooOnDay=" + CostsZooOnDay +
                '}' + super.toString();
    }

    @Override
    int calculateCostPerMonth() {
        System.out.print("Zoo: 180 000; Farm: 147 000");
        return 0;
    }


}

