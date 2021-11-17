package Project;

import java.util.ArrayList;
import java.util.Scanner;

public class RunProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Mammals> mammals = new ArrayList<>();
        ArrayList<Reptiles> reptiles = new ArrayList<>();
        ArrayList<Fishes> fishes = new ArrayList<>();

        ArrayList<Employees> employees = new ArrayList<>();

        Store myStore = new Store("Animal Store", "Ivan", "Georgi Dimitrov 57", mammals, reptiles, fishes, employees);


        myStore.HireEmployees();


        //myStore.FireEmployee();


        myStore.addMammals(mammals);
        myStore.addReptiles(reptiles);
        myStore.addFishes(fishes);


        myStore.SupplyAnimals(0);
        while(myStore.quantity > 20) {
            myStore.Sell(0);
            if(myStore.quantity < 20){
                myStore.ReSupply(0);
            }
        }
    }
}
