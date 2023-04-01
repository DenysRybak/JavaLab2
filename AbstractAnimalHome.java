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


    @Override
    public String toString() {
        return "AbstractAnimalHome{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", area=" + area +
                '}';
    }
    abstract int calculateCostPerMonth();




}
