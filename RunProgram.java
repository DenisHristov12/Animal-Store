package Project;

import java.util.ArrayList;
import java.util.Scanner;

public class RunProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Store myStore = new Store("Animal Store", "Ivan", "Georgi Dimitrov 57");

        Employees.addEmployees();

        //myStore.FireEmployee();

        Dog.addDogs();
        Cat.addCats();
        Rabbit.addRabbits();

        Lizard.addLizards();
        Snake.addSnakes();

        Heller.addHellers();
        Gupa.addGupas();
        GoldenFish.addGoldenFishes();

        myStore.WorkTime();
    }
}
