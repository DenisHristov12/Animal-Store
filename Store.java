package Project;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    Scanner scan = new Scanner(System.in);

    private String name;
    private String owner;
    private String adress;

    private ArrayList<Mammals> mammals = new ArrayList<>();
    private ArrayList<Reptiles> reptiles = new ArrayList<>();
    private ArrayList<Fishes> fishes = new ArrayList<>();

    private ArrayList<Employees> employees = new ArrayList<>();

    public Store(String name, String owner, String adress, ArrayList<Mammals> mammals, ArrayList<Reptiles> reptiles, ArrayList<Fishes> fishes, ArrayList<Employees> employees) {
        this.name = name;
        this.owner = owner;
        this.adress = adress;
        this.mammals = mammals;
        this.reptiles = reptiles;
        this.fishes = fishes;
        this.employees = employees;
    }

    Employees employee1 = new Employees("Georgi", 800, 25, "University", "M", "Seller", 5);
    Employees employee2 = new Employees("Katerina", 700, 23, "Secondary education", "F", "Cleaner", 2);
    Employees employee3 = new Employees("Petur", 650, 27, "Secondary education", "M", "Feeder", 1);
    Employees employee4 = new Employees("Bilqna", 650, 20, "Elementary education", "F", "Cleaner", 0);


    public void HireEmployee(int age, int experience, String graduation){
        if(age > 20 && experience >= 1 && graduation.equals("Secondary education") || graduation.equals("University")){
            employees.add(employee1);
            employees.add(employee2);
            employees.add(employee3);
            employees.add(employee4);
        }
    }

    public void FireEmployee(String reason, String name){
        reason = scan.nextLine();
        int employeeIndex = scan.nextInt();
        if(reason.equals("Stealing") && name.equals("Georgi") || name.equals("Katerina") || name.equals("Petur")){
            employees.remove(employeeIndex);
        }
    }

    public void addMammals(ArrayList<Mammals> mammals){
        mammals.add(new Dog(300, 10, 1, "M", 0.3));
        mammals.add(new Dog(300, 10, 2, "F", 0.3));
        mammals.add(new Cat(150, 10, 3, "M", 0.3));
        mammals.add(new Cat(150, 10, 4, "F", 0.3));
        mammals.add(new Rabbit(80, 10, 5, "M", 0.3));
        mammals.add(new Rabbit(80, 10, 6, "F", 0.3));
    }

    public void addReptiles(ArrayList<Reptiles> reptiles) {
        reptiles.add(new Snake(400, 10, 1, "M", 1));
        reptiles.add(new Snake(400, 10, 2, "F", 1));
        reptiles.add(new Lizard(200, 10, 3, "M", 1));
        reptiles.add(new Lizard(200, 10, 4, "F", 1));
    }

    public void addFishes(ArrayList<Fishes> fishes){
        fishes.add(new GoldenFish(60, 10, 1, "M", 0.5));
        fishes.add(new GoldenFish(60, 10, 2, "F", 0.5));
        fishes.add(new Gupa(50, 10, 3, "M", 0.5));
        fishes.add(new Gupa(50, 10, 4, "F", 0.5));
        fishes.add(new Heller(30, 10, 5, "M", 0.5));
        fishes.add(new Heller(30, 10, 6, "F", 0.5));
    }


    int maxAnimals;
    public void SupplyAnimals(int quantity, int supplyQuantity){
        maxAnimals = 60;
        supplyQuantity = scan.nextInt();

        if(supplyQuantity > 60){
            System.out.println("No available space!");
        }else{
            quantity+=supplyQuantity;
        }

        if(quantity < 20 ){
            ReSupply(maxAnimals - quantity);
        }
    }


    public void Sell(int quantity, int sellQuantity){
        String animalType = scan.nextLine();
        sellQuantity = scan.nextInt();

        if      (animalType.equals("Dogs") ||
                animalType.equals("Cats") ||
                animalType.equals("Rabbits") ||
                animalType.equals("Snakes") ||
                animalType.equals("Lizards") ||
                animalType.equals("GoldenFish") ||
                animalType.equals("Heller") ||
                animalType.equals("Gupa") && sellQuantity >= 1){
            quantity -= sellQuantity;
        }
    }



    public void ReSupply(int quantity){
        String animalType = scan.nextLine();
        int reSupplyQuantity = scan.nextInt();

        if      (animalType.equals("Dogs") ||
                animalType.equals("Cats") ||
                animalType.equals("Rabbits") ||
                animalType.equals("Snakes") ||
                animalType.equals("Lizards") ||
                animalType.equals("GoldenFish") ||
                animalType.equals("Heller") ||
                animalType.equals("Gupa") && reSupplyQuantity <= 20){
            quantity += reSupplyQuantity;
        }
    }
}
