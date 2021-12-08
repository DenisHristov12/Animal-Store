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
        int supplyQuantity;
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

    public void WorkTime(){
        double startWorkTime = 8.00;
        double endWorkTime = 16.00;

        System.out.println("Input time of the day: ");
        double inputTime = scan.nextDouble();


        if(inputTime < 8 || inputTime > 16){
            System.out.println("The store is not working!");
        }else{
            SupplyAnimals();
            while(quantity > 20) {
                Sell();
                if(quantity < 20){
                    ReSupply(0);
                }
            }
        }
    }

}
