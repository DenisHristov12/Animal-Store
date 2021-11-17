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

    Owner newOwner = new Owner("Ivan", "Ivanov", 42,"M", "University");

    public void HireEmployees(){
        System.out.println("Input employee graduation: ");
        String graduation = scan.nextLine();
        System.out.println("Input employee age: ");
        int age = scan.nextInt();
        System.out.println("Input employee experience: ");
        int experience = scan.nextInt();


        if(graduation.equals("Secondary education") || graduation.equals("University")
                && age > 20 && experience >= 1){
            employees.add(new Employees("Georgi", 800, age, graduation, "M", "Seller", experience));
            employees.add(new Employees("Mariq", 700, age, graduation, "F", "Cleaner", experience));
            employees.add(new Employees("Petur", 500, age, graduation, "M", "Feeder", experience));
        }
        System.out.println("Hired employees: " + employees.size());
        System.out.println();
    }

    public void FireEmployee(){
        System.out.println("Input name: ");
        String name = scan.nextLine();
        System.out.println("Input reason: ");
        String reason = scan.nextLine();

        if((name.equals("Georgi") || name.equals("Mariq") || name.equals("Petur")) && reason.equals("Stealing")){
            System.out.println("Input employee index: ");
            int employeeIndex = scan.nextInt();
            employees.remove(employeeIndex);
        }
        System.out.println("Employees: " + employees.size());
        System.out.println();
    }

    public void addMammals(ArrayList<Mammals> mammals){
        mammals.add(new Dog(300, 10, 1, "M", 0.3, "German shepard"));
        mammals.add(new Dog(300, 10, 2, "F", 0.3, "Golden retriever"));
        mammals.add(new Cat(150, 10, 3, "M", 0.3, "Persian"));
        mammals.add(new Cat(150, 10, 4, "F", 0.3, "Scottish fold"));
        mammals.add(new Rabbit(80, 10, 5, "M", 0.3, "Holland lop"));
        mammals.add(new Rabbit(80, 10, 6, "F", 0.3, "Dutch lop"));
        System.out.println("Mammals: " + mammals.size() + " species!");
        System.out.println();
    }

    public void addReptiles(ArrayList<Reptiles> reptiles) {
        reptiles.add(new Snake(400, 10, 1, "M", 1, "Boa"));
        reptiles.add(new Snake(400, 10, 2, "F", 1, "Python"));
        reptiles.add(new Lizard(200, 10, 3, "M", 1, "Veiled chameleon"));
        reptiles.add(new Lizard(200, 10, 4, "F", 1, "Leoprard gecko"));
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
    int maxAnimals = 160;
    int quantity;

    public void SupplyAnimals(int supplyQuantity){
        quantity = 0;
        myAnimals = 0;

        System.out.println("My Animals: " + myAnimals);

        System.out.println("You have: " + (maxAnimals - quantity) + " storage space!");

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
