package Project;

import java.util.ArrayList;

public class RunProgram {
    public static void main(String[] args) {

        ArrayList<Mammals> mammals = new ArrayList<>();
        ArrayList<Reptiles> reptiles = new ArrayList<>();
        ArrayList<Fishes> fishes = new ArrayList<>();

        ArrayList<Employees> employees = new ArrayList<>();

        Store myStore = new Store("Animal Store", "Ivan", "Georgi Dimitrov 57", mammals, reptiles, fishes, employees);

        myStore.HireEmployee(25, 5, "University");
        myStore.HireEmployee(23, 2, "Secondary education");
        myStore.HireEmployee(27, 1, "Secondary education");

        myStore.FireEmployee("Stealing", "Petur");

        myStore.addMammals(mammals);
        myStore.addReptiles(reptiles);
        myStore.addFishes(fishes);

        myStore.SupplyAnimals(30, 30);
        myStore.Sell(60, 22);
        myStore.ReSupply(10);
    }
}
