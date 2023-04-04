package ua.lviv.iot.algo.part1.lab2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

package ua.lviv.iot.algo.part1.lab1;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

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
