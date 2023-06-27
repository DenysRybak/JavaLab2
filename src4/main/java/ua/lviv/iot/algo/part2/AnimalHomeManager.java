package ua.lviv.iot.algo.part2;

import lombok.Getter;

import lombok.Setter;
import lombok.ToString;


import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.io.File;



@ToString
@Getter
@Setter



public class AnimalHomeManager {


    public static AbstractAnimalHome addAbstractAnimalHome(final AbstractAnimalHome abstractAnimalHome, List<AbstractAnimalHome> abstractAnimalHomes)
    {
        abstractAnimalHomes.add(abstractAnimalHome);
        return abstractAnimalHome;
    }




    private static final List<AbstractAnimalHome> abstractAnimalHome = new LinkedList<>();



    public static void main(String... args) throws FileNotFoundException {


        List<AbstractAnimalHome> abstractAnimalHomes = new ArrayList<>();

        Reserve reserve1 = new Reserve("Domashur", "Lviv",130,6210,26,9);
        Reserve reserve2 = new Reserve("Askania-nova","Khreson",345,14000,41,18);

        Zoo zoo1 = new Zoo("Znecinia","Lviv",150,78,12,566);
        Zoo zoo2 = new Zoo("Ibroshino","Lviv",254,84,9,789);

        Farm farm1 = new Farm("Sobi", "Lviv", 56, "Pigs", 4900);
        Farm farm2 = new Farm("Nove Pole", "Uzhhorod", 23, "Sheeps", 3750);

        AnimalShelter animalShelter1 = new AnimalShelter("HomeAnimal","Lviv",67,"Dog,cats,hamster","9:00-21:00",8);
        AnimalShelter animalShelter2 = new AnimalShelter("PetsPlace","Kyiv",46,"Dog,cats","8:00-22:00",17);




        addAbstractAnimalHome(farm1, abstractAnimalHomes);
        addAbstractAnimalHome(animalShelter1, abstractAnimalHomes);
        addAbstractAnimalHome(zoo1, abstractAnimalHomes);
        addAbstractAnimalHome(reserve1, abstractAnimalHomes);


        for (AbstractAnimalHome animalHome : abstractAnimalHomes) {
            System.out.println(animalHome.toString());
            System.out.println();
        }

        AnimalHomeWriter animalHomeWriter = new AnimalHomeWriter(); //викликаємо AnimalHomeWriter
        animalHomeWriter.writeToFile(abstractAnimalHomes);

        System.out.println(findMoreThat100Area());
        System.out.println(findName());
        }

    public static List<AbstractAnimalHome> findMoreThat100Area() {
        return abstractAnimalHome.stream()
                .filter(c -> c.getArea() > 100)
                .collect(Collectors.toList());
    }

    public static List<AbstractAnimalHome> findName() {
        return abstractAnimalHome.stream()
                .filter(g -> g.getName() .startsWith("Lviv"))
                .collect(Collectors.toList());
    }
    }



