public class Farm extends AbstractAnimalHome{


    private String typeFarm;
    private int MoneyOnDayFarm;

    public Farm(String name, String location,int area, String typeFarm, int MoneyOnDayFarm){
        super(name,location,area);
        this.typeFarm = typeFarm;
        this.MoneyOnDayFarm = MoneyOnDayFarm;
    }



    @Override
    public String toString() {
        return "Farm{" +
                "typeFarm='" + typeFarm + '\'' +
                ", MoneyOnDayFarm=" + MoneyOnDayFarm +
                '}' + super.toString();
    }

    @Override
    int calculateCostPerMonth() {
        System.out.print("Zoo: 180 000; Farm: 147 000");
        return 0;
    }


}
