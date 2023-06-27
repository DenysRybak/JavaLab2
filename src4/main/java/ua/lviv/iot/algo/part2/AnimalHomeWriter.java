package ua.lviv.iot.algo.part2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class AnimalHomeWriter {

    public static void writeToFile(List<AbstractAnimalHome> abstractAnimalHomes) {
        try {
            FileWriter writer = new FileWriter("animal_homes.csv");
            writer.write("Name,Location,Area,Animals,ExtraInfo\n"); // Записуємо заголовок у CSV файл
            for (AbstractAnimalHome animalHome : abstractAnimalHomes) {
                writer.write(animalHome.getName() + ",");
                writer.write(animalHome.getLocation() + ",");
                writer.write(animalHome.getArea() + ",");
            }
            writer.close();
            System.out.println("Дані успішно записані у файл animal_homes.csv");
        } catch (IOException e) {
            System.err.println("Помилка запису у файл: " + e.getMessage());
        }
    }
}

