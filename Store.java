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

    public void SupplyAnimals(){
        Dog.addDogs();

        Cat.addCats();

        Rabbit.addRabbits();

        Snake.addSnakes();

        Lizard.addLizards();

        Fishes.addFishes();
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

        System.out.println("Input how much animals you want to resupply: ");
        int countResupplyAnimals = scan.nextInt();
        int countAnimals;
        int currentCount = 0;

        for (int j = 0; j < countResupplyAnimals; j++) {
            System.out.println("Input what animal you want to resupply: ");
            String animal = scan.nextLine();
            animal = scan.nextLine();

            if (animal.equals("Dog")) {
                System.out.println("Input how much dogs you want to resupply: ");
                countAnimals = scan.nextInt();
                currentCount += countAnimals;

                if(currentCount > countResupplyAnimals){
                    System.out.println("You can't add that much animals!");
                    currentCount -= countAnimals;
                    System.out.println(currentCount);
                }else{
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

                        try {
                            if ((newDogs.getPrice() < 300 || newDogs.getPrice() > 1500) ||
                                    !newDogs.getGender().equals("M") || !newDogs.getGender().equals("F") ||
                                    newDogs.getAge() > 3) {
                                throw new AnimalException("This dog can't be added to the store!");
                            } else {
                                System.out.println("This dog is added to the store!");
                                Dog.dogs.add(newDogs);
                                System.out.println(Dog.dogs.toString());
                            }
                        } catch (AnimalException e1) {
                            System.out.println(e1.getMessage());
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }
                }
            } else if (animal.equals("Cat")) {
                System.out.println("Input how much cats you want to resupply: ");
                countAnimals = scan.nextInt();
                currentCount += countAnimals;

                if(currentCount > countResupplyAnimals){
                    System.out.println("You can't add that much animals!");
                    currentCount -= countAnimals;
                }else{
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
                }
            } else if (animal.equals("Rabbit")) {
                System.out.println("Input how much rabbits you want to resupply: ");
                countAnimals = scan.nextInt();
                currentCount += countAnimals;

                if(currentCount > countResupplyAnimals){
                    System.out.println("You can't add that much animals!");
                    currentCount -= countAnimals;
                }else{
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
                }
            } else if (animal.equals("Snake")) {
                System.out.println("Input how much snakes you want to resupply: ");
                countAnimals = scan.nextInt();
                currentCount += countAnimals;

                if(currentCount > countResupplyAnimals){
                    System.out.println("You can't add that much animals!");
                    currentCount -= countAnimals;
                }else{
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
                }
            } else if (animal.equals("Lizard")) {
                System.out.println("Input how much lizards you want to resupply: ");
                countAnimals = scan.nextInt();
                currentCount += countAnimals;

                if(currentCount > countResupplyAnimals){
                    System.out.println("You can't add that much animals!");
                    currentCount -= countAnimals;
                }else{
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
                }
            } else if (animal.equals("Fish")) {
                System.out.println("Input how much fishes you want to resupply: ");
                countAnimals = scan.nextInt();
                currentCount += countAnimals;

                if(currentCount > countResupplyAnimals){
                    System.out.println("You can't add that much animals!");
                    currentCount -= countAnimals;
                }else{
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
            } else {
                System.out.println("Invalid animal!");
            }
        }
    }




    public void AnimalsReport(){
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
    }








    public void HireNewEmployees(){
        System.out.println("Input number of employees you want to hire:");
        int countEmployees = scan.nextInt();

        for (int i = 0; i < countEmployees; i++) {
            Employees newEmployees = new Employees();

            System.out.println("Enter name for employee " + (i + 1));
            newEmployees.setName(scan.nextLine());
            newEmployees.setName(scan.nextLine());

            System.out.println("Enter salary for employee " + (i + 1));
            newEmployees.setSalary(scan.nextDouble());

            System.out.println("Enter age for employee " + (i + 1));
            newEmployees.setAge(scan.nextInt());

            System.out.println("Enter graduation for employee " + (i + 1));
            newEmployees.setGraduation(scan.nextLine());
            newEmployees.setGraduation(scan.nextLine());

            System.out.println("Enter gender for employee " + (i + 1));
            newEmployees.setGender(scan.nextLine());

            System.out.println("Enter position for employee " + (i + 1));
            newEmployees.setPosition(scan.nextLine());

            System.out.println("Enter experience for employee " + (i + 1));
            newEmployees.setExperience(scan.nextInt());

            try {
                if (newEmployees.getAge() < 18 || newEmployees.getGraduation().equals("Primary education") || newEmployees.getExperience() < 2) {
                    throw new AgeException("This employee doesn't have the requirerements to work!");
                } else {
                    System.out.println("This employee is hired!");
                    Employees.employees.add(newEmployees);
                }
            } catch (AgeException e1) {
                System.out.println(e1.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println();
        System.out.println("Employees: ");
        System.out.println(Employees.employees.toString());
    }







    public void FireEmployees(){
        System.out.println("Employees: ");
        System.out.println(Employees.employees.toString());

        System.out.println("Enter which employee you want to fire:");
        System.out.println("Name: ");
        String name = scan.nextLine();
        name = scan.nextLine();
        System.out.println("Position: ");
        String position = scan.nextLine();

        System.out.println("What is the reason you want to fire that employee?");
        String reason = scan.nextLine();

        if (reason.equals("Stealing")) {
            System.out.println("Enter employee's index: ");
            int index = scan.nextInt();

            Employees.employees.remove(index);

            System.out.println(Employees.employees.toString());
        } else {
            System.out.println("That is not a reason to fire employee!");
        }
    }
}
