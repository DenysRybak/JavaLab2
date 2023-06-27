package ua.lviv.iot.algo.part2;

import lombok.*;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public abstract class AbstractAnimalHome {

    private String name;
    private String location;
    private int area;

    public String getHeaders() {
        return "Name, Location, Area";
    }

    public String toCSV() {
        return getName() + ", " + getLocation() + ", " + getArea();
    }

    protected abstract int calculateCostPerMonth();




}
