import lombok.Getter;

import lombok.Setter;
import lombok.ToString;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@ToString
@Getter
@Setter


public class AnimalHomeManager {


    public static void main(String... args) {
        List myList = new ArrayList();
        List list = new ArrayList();
        list.add(new Farm("Sobi", "Lviv", 56, "Pigs", 4900));
        list.add(new Zoo("Znecinia", "Lviv", 150, 78, 12, 6000));

        for (int i=0; i < 1; i++) {
            System.out.println("Info : " + list.toString());
        }

    }

}
