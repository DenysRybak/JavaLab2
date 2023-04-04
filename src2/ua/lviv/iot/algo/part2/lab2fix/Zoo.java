
import lombok.ToString;



@ToString
public class Zoo extends AbstractAnimalHome {


    private int capacity;

    private int timeWork;

    private int costsZooOnDay;


    public Zoo(String name, String location,int area, int capacity, int timeWork, int costsZooOnDay){
        super(name,location,area);
        this.capacity = capacity;
        this.timeWork = timeWork;
        this.costsZooOnDay = costsZooOnDay;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "capacity=" + capacity +
                ", timeWork=" + timeWork +
                ", CostsZooOnDay=" + costsZooOnDay +
                '}' + super.toString();
    }


    @Override
    protected int calculateCostPerMonth() {
            System.out.print("Zoo: 180 000; Farm: 147 000");
            return 0;
        }
    }

