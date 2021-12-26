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

                            System.out.println("Enter salary for employee " + (i + 1));
                            newEmployees.setSalary(scan.nextDouble());

                            System.out.println("Enter age for employee " + (i + 1));
                            newEmployees.setAge(scan.nextInt());

                            System.out.println("Enter graduation for employee " + (i + 1));
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
                if(animal.equals("Dog")){
                    Dog.dogs.toString();
                }else if(animal.equals("Cat")){
                    Cat.cats.toString();
                }
                System.out.println("Enter what breed/kind of that animal you want to buy:");
                String breedOrKind = scan.nextLine();
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
