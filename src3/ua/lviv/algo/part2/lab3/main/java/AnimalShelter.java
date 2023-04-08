public class AnimalShelter extends AbstractAnimalHome {

    private int numberOfSeats;

    private String typeAnimals;

    private String workSchedule;


    public AnimalShelter(String name, String location,int area, String typeAnimals, String workSchedule, int numberOfSeats){
        super(name,location,area);
        this. typeAnimals= typeAnimals;
        this.workSchedule = workSchedule;
        this.numberOfSeats = numberOfSeats;
    }



    @Override
    public String toString() {
        return "AnimalShelter{" +
                "typeAnimals:'" + typeAnimals + '\'' +
                ",workSchedule:" + workSchedule +
                ",numberOfSeats:" + numberOfSeats +
                '}' + super.toString();
    }


    @Override
    protected int calculateCostPerMonth() {
        return 0;
    }
}
