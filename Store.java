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
        Dog.addDogs();

        Cat.addCats();

        Rabbit.addRabbits();

        Snake.addSnakes();

        Lizard.addLizards();

        Fishes.addFishes();


        //int supplyQuantity;
        /*
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
        }*/
    }


    public void Sell(){


        /*
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
        */
    }


    int freeSpace;
    public void ReSupply() {

        System.out.println("Dogs:");
        System.out.println(Dog.dogs.toString());
        System.out.println();

        System.out.println("Cats:");
        System.out.println(Cat.cats.toString());
        System.out.println();

        System.out.println("Rabits:");
        System.out.println(Rabbit.rabits.toString());
        System.out.println();

        System.out.println("Snakes:");
        System.out.println(Snake.snakes.toString());
        System.out.println();

        System.out.println("Lizards:");
        System.out.println(Lizard.lizards.toString());
        System.out.println();

        System.out.println("Fishes:");
        System.out.println(Fishes.fishes.toString());

        System.out.println();

        System.out.println("Input what animal you want to resupply: ");
        String animal = scan.nextLine();

        if (animal.equals("Dog")) {
            System.out.println("Input how much dogs you want to resupply: ");
            int countAnimals = scan.nextInt();

            for (int i = 0; i < countAnimals; i++) {
                Dog newDogs = new Dog();

                System.out.println("Enter dog's price: ");
                newDogs.setPrice(scan.nextDouble());

                System.out.println("Enter dog's id: ");
                newDogs.setId(scan.nextInt());

                System.out.println("Enter dog's gender: ");
                newDogs.setGender(scan.nextLine());
                newDogs.setGender(scan.nextLine());

                System.out.println("Enter dog's age: ");
                newDogs.setAge(scan.nextDouble());

                System.out.println("Enter dog's breed: ");
                newDogs.setBreed(scan.nextLine());
                newDogs.setBreed(scan.nextLine());

                System.out.println("Dog added to the store!");
                System.out.println();

                Dog.dogs.add(newDogs);
            }
            System.out.println(Dog.dogs.toString());
        } else if (animal.equals("Cat")) {
            System.out.println("Input how much cats you want to resupply: ");
            int countAnimals = scan.nextInt();

            for (int i = 0; i < countAnimals; i++) {
                Cat newCats = new Cat();

                System.out.println("Enter cat's price: ");
                newCats.setPrice(scan.nextDouble());

                System.out.println("Enter cat's id: ");
                newCats.setId(scan.nextInt());

                System.out.println("Enter cat's gender: ");
                newCats.setGender(scan.nextLine());
                newCats.setGender(scan.nextLine());

                System.out.println("Enter cat's age: ");
                newCats.setAge(scan.nextDouble());

                System.out.println("Enter cat's breed: ");
                newCats.setBreed(scan.nextLine());
                newCats.setBreed(scan.nextLine());

                System.out.println("Cat added to the store!");
                System.out.println();

                Cat.cats.add(newCats);
            }
            System.out.println(Cat.cats.toString());
        }else if (animal.equals("Rabbit")) {
            System.out.println("Input how much rabbits you want to resupply: ");
            int countAnimals = scan.nextInt();

            for (int i = 0; i < countAnimals; i++) {
                Rabbit newRabbits = new Rabbit();

                System.out.println("Enter rabbit's price: ");
                newRabbits.setPrice(scan.nextDouble());

                System.out.println("Enter rabbit's id: ");
                newRabbits.setId(scan.nextInt());

                System.out.println("Enter rabbit's gender: ");
                newRabbits.setGender(scan.nextLine());
                newRabbits.setGender(scan.nextLine());

                System.out.println("Enter rabbit's age: ");
                newRabbits.setAge(scan.nextDouble());

                System.out.println("Enter rabbit's breed: ");
                newRabbits.setBreed(scan.nextLine());
                newRabbits.setBreed(scan.nextLine());

                System.out.println("Rabbit added to the store!");
                System.out.println();

                Rabbit.rabits.add(newRabbits);
            }
            System.out.println(Rabbit.rabits.toString());
        }else if (animal.equals("Snake")) {
            System.out.println("Input how much snakes you want to resupply: ");
            int countAnimals = scan.nextInt();

            for (int i = 0; i < countAnimals; i++) {
                Snake newSnakes = new Snake();

                System.out.println("Enter snake's price: ");
                newSnakes.setPrice(scan.nextDouble());

                System.out.println("Enter snake's id: ");
                newSnakes.setId(scan.nextInt());

                System.out.println("Enter snake's gender: ");
                newSnakes.setGender(scan.nextLine());
                newSnakes.setGender(scan.nextLine());

                System.out.println("Enter snake's age: ");
                newSnakes.setAge(scan.nextDouble());

                System.out.println("Enter snake's kind: ");
                newSnakes.setKind(scan.nextLine());
                newSnakes.setKind(scan.nextLine());

                System.out.println("Snake added to the store!");
                System.out.println();

                Snake.snakes.add(newSnakes);
            }
            System.out.println(Snake.snakes.toString());
        }else if (animal.equals("Lizard")) {
            System.out.println("Input how much lizards you want to resupply: ");
            int countAnimals = scan.nextInt();

            for (int i = 0; i < countAnimals; i++) {
                Lizard newLizards = new Lizard();

                System.out.println("Enter lizard's price: ");
                newLizards.setPrice(scan.nextDouble());

                System.out.println("Enter lizard's id: ");
                newLizards.setId(scan.nextInt());

                System.out.println("Enter lizard's gender: ");
                newLizards.setGender(scan.nextLine());
                newLizards.setGender(scan.nextLine());

                System.out.println("Enter lizard's age: ");
                newLizards.setAge(scan.nextDouble());

                System.out.println("Enter lizard's kind: ");
                newLizards.setKind(scan.nextLine());
                newLizards.setKind(scan.nextLine());

                System.out.println("Lizard added to the store!");
                System.out.println();

                Lizard.lizards.add(newLizards);
            }
            System.out.println(Lizard.lizards.toString());
        }else if (animal.equals("Fish")) {
            System.out.println("Input how much fishes you want to resupply: ");
            int countAnimals = scan.nextInt();

            for (int i = 0; i < countAnimals; i++) {
                Fishes newFishes = new Fishes();

                System.out.println("Enter fish's price: ");
                newFishes.setPrice(scan.nextDouble());

                System.out.println("Enter fish's id: ");
                newFishes.setId(scan.nextInt());

                System.out.println("Enter fish's gender: ");
                newFishes.setGender(scan.nextLine());
                newFishes.setGender(scan.nextLine());

                System.out.println("Enter fish's age: ");
                newFishes.setAge(scan.nextDouble());

                System.out.println("Enter fish's kind: ");
                newFishes.setKind(scan.nextLine());
                newFishes.setKind(scan.nextLine());

                System.out.println("Fish added to the store!");
                System.out.println();

                Fishes.fishes.add(newFishes);
            }
            System.out.println(Fishes.fishes.toString());
        }else{
            System.out.println("Invalid animal!");

            System.out.println("Input what animal you want to resupply: ");
            animal = scan.nextLine();

            if (animal.equals("Dog")) {
                System.out.println("Input how much dogs you want to resupply: ");
                int countAnimals = scan.nextInt();

                for (int i = 0; i < countAnimals; i++) {
                    Dog newDogs = new Dog();

                    System.out.println("Enter dog's price: ");
                    newDogs.setPrice(scan.nextDouble());

                    System.out.println("Enter dog's id: ");
                    newDogs.setId(scan.nextInt());

                    System.out.println("Enter dog's gender: ");
                    newDogs.setGender(scan.nextLine());
                    newDogs.setGender(scan.nextLine());

                    System.out.println("Enter dog's age: ");
                    newDogs.setAge(scan.nextDouble());

                    System.out.println("Enter dog's breed: ");
                    newDogs.setBreed(scan.nextLine());
                    newDogs.setBreed(scan.nextLine());

                    System.out.println("Dog added to the store!");
                    System.out.println();

                    Dog.dogs.add(newDogs);
                }
                System.out.println(Dog.dogs.toString());
            } else if (animal.equals("Cat")) {
                System.out.println("Input how much cats you want to resupply: ");
                int countAnimals = scan.nextInt();

                for (int i = 0; i < countAnimals; i++) {
                    Cat newCats = new Cat();

                    System.out.println("Enter cat's price: ");
                    newCats.setPrice(scan.nextDouble());

                    System.out.println("Enter cat's id: ");
                    newCats.setId(scan.nextInt());

                    System.out.println("Enter cat's gender: ");
                    newCats.setGender(scan.nextLine());
                    newCats.setGender(scan.nextLine());

                    System.out.println("Enter cat's age: ");
                    newCats.setAge(scan.nextDouble());

                    System.out.println("Enter cat's breed: ");
                    newCats.setBreed(scan.nextLine());
                    newCats.setBreed(scan.nextLine());

                    System.out.println("Cat added to the store!");
                    System.out.println();

                    Cat.cats.add(newCats);
                }
                System.out.println(Cat.cats.toString());
            }else if (animal.equals("Rabbit")) {
                System.out.println("Input how much rabbits you want to resupply: ");
                int countAnimals = scan.nextInt();

                for (int i = 0; i < countAnimals; i++) {
                    Rabbit newRabbits = new Rabbit();

                    System.out.println("Enter rabbit's price: ");
                    newRabbits.setPrice(scan.nextDouble());

                    System.out.println("Enter rabbit's id: ");
                    newRabbits.setId(scan.nextInt());

                    System.out.println("Enter rabbit's gender: ");
                    newRabbits.setGender(scan.nextLine());
                    newRabbits.setGender(scan.nextLine());

                    System.out.println("Enter rabbit's age: ");
                    newRabbits.setAge(scan.nextDouble());

                    System.out.println("Enter rabbit's breed: ");
                    newRabbits.setBreed(scan.nextLine());
                    newRabbits.setBreed(scan.nextLine());

                    System.out.println("Rabbit added to the store!");
                    System.out.println();

                    Rabbit.rabits.add(newRabbits);
                }
                System.out.println(Rabbit.rabits.toString());
            }else if (animal.equals("Snake")) {
                System.out.println("Input how much snakes you want to resupply: ");
                int countAnimals = scan.nextInt();

                for (int i = 0; i < countAnimals; i++) {
                    Snake newSnakes = new Snake();

                    System.out.println("Enter snake's price: ");
                    newSnakes.setPrice(scan.nextDouble());

                    System.out.println("Enter snake's id: ");
                    newSnakes.setId(scan.nextInt());

                    System.out.println("Enter snake's gender: ");
                    newSnakes.setGender(scan.nextLine());
                    newSnakes.setGender(scan.nextLine());

                    System.out.println("Enter snake's age: ");
                    newSnakes.setAge(scan.nextDouble());

                    System.out.println("Enter snake's kind: ");
                    newSnakes.setKind(scan.nextLine());
                    newSnakes.setKind(scan.nextLine());

                    System.out.println("Snake added to the store!");
                    System.out.println();

                    Snake.snakes.add(newSnakes);
                }
                System.out.println(Snake.snakes.toString());
            }else if (animal.equals("Lizard")) {
                System.out.println("Input how much lizards you want to resupply: ");
                int countAnimals = scan.nextInt();

                for (int i = 0; i < countAnimals; i++) {
                    Lizard newLizards = new Lizard();

                    System.out.println("Enter lizard's price: ");
                    newLizards.setPrice(scan.nextDouble());

                    System.out.println("Enter lizard's id: ");
                    newLizards.setId(scan.nextInt());

                    System.out.println("Enter lizard's gender: ");
                    newLizards.setGender(scan.nextLine());
                    newLizards.setGender(scan.nextLine());

                    System.out.println("Enter lizard's age: ");
                    newLizards.setAge(scan.nextDouble());

                    System.out.println("Enter lizard's kind: ");
                    newLizards.setKind(scan.nextLine());
                    newLizards.setKind(scan.nextLine());

                    System.out.println("Lizard added to the store!");
                    System.out.println();

                    Lizard.lizards.add(newLizards);
                }
                System.out.println(Lizard.lizards.toString());
            }else if (animal.equals("Fish")) {
                System.out.println("Input how much fishes you want to resupply: ");
                int countAnimals = scan.nextInt();

                for (int i = 0; i < countAnimals; i++) {
                    Fishes newFishes = new Fishes();

                    System.out.println("Enter fish's price: ");
                    newFishes.setPrice(scan.nextDouble());

                    System.out.println("Enter fish's id: ");
                    newFishes.setId(scan.nextInt());

                    System.out.println("Enter fish's gender: ");
                    newFishes.setGender(scan.nextLine());
                    newFishes.setGender(scan.nextLine());

                    System.out.println("Enter fish's age: ");
                    newFishes.setAge(scan.nextDouble());

                    System.out.println("Enter fish's kind: ");
                    newFishes.setKind(scan.nextLine());
                    newFishes.setKind(scan.nextLine());

                    System.out.println("Fish added to the store!");
                    System.out.println();

                    Fishes.fishes.add(newFishes);
                }
                System.out.println(Fishes.fishes.toString());
            }
        }
    }
}
