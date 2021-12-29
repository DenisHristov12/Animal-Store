package Project;

import java.util.ArrayList;
import java.util.Scanner;

public class RunProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Store myStore = new Store("Animal Store", "Ivan", "Georgi Dimitrov 57");

        Dog.addDogs();
        Cat.addCats();
        Rabbit.addRabbits();

        Lizard.addLizards();
        Snake.addSnakes();

        Heller.addHellers();
        Gupa.addGupas();
        GoldenFish.addGoldenFishes();


        System.out.println("Welcome to UKTC Animal Store!");
        System.out.println("If you are owner: \nPress 1");
        System.out.println("If you are customer: \nPress 2");

        int choice = scan.nextInt();

        switch(choice) {
            case 1:
                System.out.println("Welcome owner!");
                System.out.println("If you want a report of all animals: \nPress 1");
                System.out.println("If you want to resupply animals: \nPress 2");
                System.out.println("If you want to hire employees: \nPress 3");

                int choice1 = scan.nextInt();

                switch(choice1) {
                    case 1:
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
                        System.out.println(Heller.hellers.toString());

                        System.out.println(Gupa.gupas.toString());

                        System.out.println(GoldenFish.goldenFishes.toString());

                        break;
                    case 2:
                        myStore.ReSupply(0);
                        break;
                    case 3:
                        //Employees.addEmployees();

                        ArrayList<Employees> employees = new ArrayList<>();

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
                                    employees.add(newEmployees);
                                }
                            } catch (AgeException e1) {
                                System.out.println(e1.getMessage());
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                        }

                        System.out.println();
                        System.out.println("Employees: ");
                        System.out.println(employees);

                        break;
                    default:
                        break;
                }
                break;
            case 2:
                System.out.println("Welcome customer!");
                System.out.println("Enter what animal you want to buy:");

                String animal;
                animal = scan.nextLine();
                animal = scan.nextLine();

                System.out.println("These are all breeds we have of that animal!");

                switch (animal) {
                    case "Dog" -> System.out.println(Dog.dogs.toString());
                    case "Cat" -> System.out.println(Cat.cats.toString());
                    case "Rabbit" -> System.out.println(Rabbit.rabits.toString());
                    case "Snake" -> System.out.println(Snake.snakes.toString());
                    case "Lizard" -> System.out.println(Lizard.lizards.toString());
                    case "Heller" -> System.out.println(Heller.hellers.toString());
                    case "Gupa" -> System.out.println(Gupa.gupas.toString());
                    case "GoldenFish" -> System.out.println(GoldenFish.goldenFishes.toString());
                }

                System.out.println("Enter what breed/kind and what gender of that animal you want to buy:");
                System.out.println("Enter breed/kind: ");
                String breedOrKind;
                breedOrKind = scan.nextLine();
                //breedOrKind = scan.nextLine();
                System.out.println("Enter gender: ");
                String gender = scan.nextLine();

                if(animal.equals("Dog") && breedOrKind.equals("German shepard") && gender.equals("M")){
                    Dog.dogs.remove(0);
                }else if(animal.equals("Dog") && breedOrKind.equals("German shepard") && gender.equals("F")){
                    Dog.dogs.remove(1);
                }else if(animal.equals("Dog") && breedOrKind.equals("Golden retriever") && gender.equals("M")){
                    Dog.dogs.remove(2);
                }else if(animal.equals("Dog") && breedOrKind.equals("Golden retriever") && gender.equals("F")){
                    Dog.dogs.remove(3);
                }

                if(animal.equals("Cat") && breedOrKind.equals("Persian") && gender.equals("M")){
                    Dog.dogs.remove(0);
                }else if(animal.equals("Cat") && breedOrKind.equals("Persian") && gender.equals("F")){
                    Dog.dogs.remove(1);
                }else if(animal.equals("Cat") && breedOrKind.equals("Scottish fold") && gender.equals("M")){
                    Dog.dogs.remove(2);
                }else if(animal.equals("Cat") && breedOrKind.equals("Scottish fold") && gender.equals("F")){
                    Dog.dogs.remove(3);
                }

                if(animal.equals("Rabbit") && breedOrKind.equals("Holland lop") && gender.equals("M")){
                    Dog.dogs.remove(0);
                }else if(animal.equals("Rabbit") && breedOrKind.equals("Holland lop") && gender.equals("F")){
                    Dog.dogs.remove(1);
                }else if(animal.equals("Rabbit") && breedOrKind.equals("Dutch lop") && gender.equals("M")){
                    Dog.dogs.remove(2);
                }else if(animal.equals("Rabbit") && breedOrKind.equals("Dutch lop") && gender.equals("F")){
                    Dog.dogs.remove(3);
                }

                //System.out.println(Dog.dogs.toString());
                break;
            default:
                break;
        }

        /*
        Store myStore = new Store("Animal Store", "Ivan", "Georgi Dimitrov 57");

        Employees.addEmployees();

        //myStore.FireEmployee();

        myStore.WorkTime();
        */
    }
}
