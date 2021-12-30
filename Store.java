package Project;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    Scanner scan = new Scanner(System.in);

    private String name;
    private String owner;
    private String adress;

    public Store(String name, String owner, String adress) {
        this.name = name;
        this.owner = owner;
        this.adress = adress;

    }

    Owner newOwner = new Owner("Ivan", "Ivanov", 42,"M", "University");

    int myAnimals;
    int maxAnimals = 160;
    int quantity;

    public void SupplyAnimals(){
        //int supplyQuantity;
        quantity = 0;
        myAnimals = 0;

        System.out.println("My Animals: " + myAnimals);

        System.out.println("You have: " + (maxAnimals - quantity) + " storage space!");

        //System.out.println("Input supply quantity: ");
        //supplyQuantity = scan.nextInt();

        System.out.println("Input how much dogs you want to supply: ");
        int dogs = scan.nextInt();

        System.out.println("Input how much cats you want to supply: ");
        int cats = scan.nextInt();

        System.out.println("Input how much rabbits you want to supply: ");
        int rabbits = scan.nextInt();

        System.out.println("Input how much snakes you want to supply: ");
        int snakes = scan.nextInt();

        System.out.println("Input how much lizards you want to supply: ");
        int lizards = scan.nextInt();

        System.out.println("Input how much hellers you want to supply: ");
        int hellers = scan.nextInt();

        System.out.println("Input how much gupas you want to supply: ");
        int gupas = scan.nextInt();

        System.out.println("Input how much golden fishes you want to supply: ");
        int goldenFishes = scan.nextInt();

        if((dogs + cats + rabbits + snakes + lizards + hellers + gupas + goldenFishes) > (maxAnimals - quantity)){
            System.out.println("You don't have " + (dogs + cats + rabbits + snakes + lizards + hellers + gupas + goldenFishes) + " space!");
            System.out.println("You have " + (maxAnimals - quantity) + " space left!");

            //System.out.println("Input supply quantity: ");
            //supplyQuantity = scan.nextInt();

            System.out.println("Input how much dogs you want to supply: ");
            dogs = scan.nextInt();

            System.out.println("Input how much cats you want to supply: ");
            cats = scan.nextInt();

            System.out.println("Input how much rabbits you want to supply: ");
            rabbits = scan.nextInt();

            System.out.println("Input how much snakes you want to supply: ");
            snakes = scan.nextInt();

            System.out.println("Input how much lizards you want to supply: ");
            lizards = scan.nextInt();

            System.out.println("Input how much hellers you want to supply: ");
            hellers = scan.nextInt();

            System.out.println("Input how much gupas you want to supply: ");
            gupas = scan.nextInt();

            System.out.println("Input how much golden fishes you want to supply: ");
            goldenFishes = scan.nextInt();


            quantity = myAnimals + (dogs + cats + rabbits + snakes + lizards + hellers + gupas + goldenFishes);

        }else if((dogs + cats + rabbits + snakes + lizards + hellers + gupas + goldenFishes) < (maxAnimals - quantity)){
            quantity = myAnimals + (dogs + cats + rabbits + snakes + lizards + hellers + gupas + goldenFishes);
        }

        System.out.println("You have: " + quantity + " animals!");
        System.out.println();

        if(quantity < 20){
            System.out.println("You have: " + quantity + " animals!");
            System.out.println("Do you want to resupply?");
            String answer = scan.nextLine();
            if(answer.equals("yes")){
                ReSupply(maxAnimals - quantity);
            }else{
                System.out.println("You must resupply later!");
            }
        }
    }


    public void Sell(){
        int sellQuantity;

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


    /*SupplyAnimals();
    while(quantity > 20) {
        Sell();
        if(quantity < 20){
            ReSupply(0);
        }
    }*/


}
