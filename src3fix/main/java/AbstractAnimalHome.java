

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




    protected abstract int calculateCostPerMonth();




}
