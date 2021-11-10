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
        System.out.println("Hired employees: " + employees.size());
        System.out.println();
    }

    public void FireEmployee(String reason, String name){
        System.out.println("Input reason: ");
        reason = scan.nextLine();
        int employeeIndex = scan.nextInt();
        if(reason.equals("Stealing") && name.equals("Georgi") || name.equals("Katerina") || name.equals("Petur")){
            employees.remove(employeeIndex);
        }
        System.out.println("Employees: " + employees.size());
        System.out.println();
    }

    public void addMammals(ArrayList<Mammals> mammals){
        mammals.add(new Dog(300, 10, 1, "M", 0.3));
        mammals.add(new Dog(300, 10, 2, "F", 0.3));
        mammals.add(new Cat(150, 10, 3, "M", 0.3));
        mammals.add(new Cat(150, 10, 4, "F", 0.3));
        mammals.add(new Rabbit(80, 10, 5, "M", 0.3));
        mammals.add(new Rabbit(80, 10, 6, "F", 0.3));
        System.out.println("Mammals: " + mammals.size() + " species!");
        System.out.println();
    }

    public void addReptiles(ArrayList<Reptiles> reptiles) {
        reptiles.add(new Snake(400, 10, 1, "M", 1));
        reptiles.add(new Snake(400, 10, 2, "F", 1));
        reptiles.add(new Lizard(200, 10, 3, "M", 1));
        reptiles.add(new Lizard(200, 10, 4, "F", 1));
        System.out.println("Reptiles: " + reptiles.size() + " species!");
        System.out.println();
    }

    public void addFishes(ArrayList<Fishes> fishes){
        fishes.add(new GoldenFish(60, 10, 1, "M", 0.5));
        fishes.add(new GoldenFish(60, 10, 2, "F", 0.5));
        fishes.add(new Gupa(50, 10, 3, "M", 0.5));
        fishes.add(new Gupa(50, 10, 4, "F", 0.5));
        fishes.add(new Heller(30, 10, 5, "M", 0.5));
        fishes.add(new Heller(30, 10, 6, "F", 0.5));
        System.out.println("Fishes: " + fishes.size() + " species!");
        System.out.println();
    }

    int myAnimals;
    int maxAnimals = 60;
    int quantity;

    public void SupplyAnimals(int supplyQuantity){
        quantity = 0;
        myAnimals = 0;

        System.out.println("My Animals: " + myAnimals);

        System.out.println("You have: " + (maxAnimals - quantity) + " space!");

        System.out.println("Input supply quantity: ");
        supplyQuantity = scan.nextInt();

        if(supplyQuantity > (maxAnimals - quantity)){
            System.out.println("No available space!");
            System.out.println("You have " + (maxAnimals - quantity) + " space left!");

            System.out.println("Input supply quantity: ");
            supplyQuantity = scan.nextInt();
            quantity = myAnimals + supplyQuantity;

        }else if(supplyQuantity < (maxAnimals - quantity)){
            quantity = myAnimals + supplyQuantity;
        }

        System.out.println("You have: " + quantity + " animals!");
        System.out.println();

        if(quantity < 20){
            ReSupply(maxAnimals - quantity);
        }
    }


    public void Sell(int sellQuantity){
        System.out.println("Input sell quantity: ");
        sellQuantity = scan.nextInt();

        if(sellQuantity > quantity){
            System.out.println("You don't have that much animals!");
            System.out.println("Input sell quantity: ");

            sellQuantity = scan.nextInt();
            quantity = quantity - sellQuantity;
        } else if(sellQuantity >= 1){
            quantity = quantity - sellQuantity;
        }

        System.out.println("You have left: " + quantity + " animals!");
        System.out.println();
    }


    int freeSpace;
    public void ReSupply(int quantity1){
        freeSpace = maxAnimals - quantity;
        System.out.println("You have: " + freeSpace + " free space!");

        System.out.println("Input resupply quantity: ");
        int reSupplyQuantity = scan.nextInt();

        if(reSupplyQuantity > (maxAnimals - quantity)){
            System.out.println("You don't have that much space!");
            System.out.println("Input resupply quantity in range: ");

            reSupplyQuantity = scan.nextInt();
            quantity = quantity + reSupplyQuantity;
        }else if(reSupplyQuantity < (maxAnimals - quantity)){
            quantity = quantity + reSupplyQuantity;
        }

        System.out.println("You have: " + quantity + " animals!" );
    }
}
