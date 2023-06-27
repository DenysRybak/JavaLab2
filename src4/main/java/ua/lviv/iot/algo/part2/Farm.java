package ua.lviv.iot.algo.part2;
public class Farm extends AbstractAnimalHome {


    private String typeFarm;
    private int moneyOnDayFarm;

    public Farm(String name, String location,int area, String typeFarm, int moneyOnDayFarm){
        super(name,location,area);
        this.typeFarm = typeFarm;
        this.moneyOnDayFarm = moneyOnDayFarm;
    }

    public String getHeaders() {
        return  super.getHeaders()+ ", " + "TypeFarm, MoneyOnDayFarm";
    }


    public String toCSV() {
        return  super.toCSV()+ ", " + typeFarm + ", " + moneyOnDayFarm;
    }



    @Override
    public String toString() {
        return "Farm{" +
                "typeFarm='" + typeFarm + '\'' +
                ", MoneyOnDayFarm=" + moneyOnDayFarm +
                '}' + super.toString();
    }


    @Override
    protected int calculateCostPerMonth() {
            System.out.print("Zoo: 180 000; Farm: 147 000");
            return 0;
        }



}
