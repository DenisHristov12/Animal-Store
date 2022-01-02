package Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Store myStore = new Store("Animal Store", "Ivan", "Georgi Dimitrov 57");

        Employees.addEmployees();
        myStore.SupplyAnimals();

        System.out.println("Welcome to UKTC Animal Store!");
        System.out.println("If you are owner: \nPress 1");
        System.out.println("If you are customer: \nPress 2");

        int choice = scan.nextInt();

        switch(choice) {
            case 1:
                System.out.println("Welcome owner!");
                System.out.println("If you want a report of all animals: \nPress 1");
                System.out.println("If you want to resupply animals: \nPress 2");
                System.out.println("If you want a report of all employees: \nPress 3");
                System.out.println("If you want to hire new employees: \nPress 4");
                System.out.println("If you want to fire employee/employees: \nPress 5");

                int choice1 = scan.nextInt();

                switch (choice1) {
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
                        System.out.println(Fishes.fishes.toString());

                        break;
                    case 2:
                        myStore.ReSupply();
                        break;
                    case 3:
                        System.out.println("Employees:");
                        System.out.println(Employees.employees.toString());
                        System.out.println();
                        break;
                    case 4:
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

                        break;
                    case 5:
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

                        break;
                    default:
                        break;
                }
                break;
            case 2:
                System.out.println("Welcome customer!");
                System.out.println("Enter how much animals you want to buy: ");
                int count = scan.nextInt();

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
                    case "Fish" -> System.out.println(Fishes.fishes.toString());
                }

                for (int i = 0; i < count; i++) {
                    System.out.println("Enter id of the animal you want to buy:");
                    int id = scan.nextInt();


                    if (animal.equals("Dog") && id == 0) {
                        Dog.dogs.remove(0);
                        System.out.println("Congratulations! You bought -> " + Dog.dogs.get(0));
                    } else if (animal.equals("Dog") && id == 1) {
                        Dog.dogs.remove(1);
                        System.out.println("Congratulations! You bought -> " + Dog.dogs.get(1));
                    } else if (animal.equals("Dog") && id == 2) {
                        Dog.dogs.remove(2);
                        System.out.println("Congratulations! You bought -> " + Dog.dogs.get(2));
                    } else if (animal.equals("Dog") && id == 3) {
                        Dog.dogs.remove(3);
                        System.out.println("Congratulations! You bought -> " + Dog.dogs.get(3));
                    } else if (animal.equals("Dog") && id == 4) {
                        Dog.dogs.remove(4);
                        System.out.println("Congratulations! You bought -> " + Dog.dogs.get(4));
                    } else if (animal.equals("Dog") && id == 5) {
                        Dog.dogs.remove(5);
                        System.out.println("Congratulations! You bought -> " + Dog.dogs.get(5));
                    } else if (animal.equals("Dog") && id == 6) {
                        Dog.dogs.remove(6);
                        System.out.println("Congratulations! You bought -> " + Dog.dogs.get(6));
                    } else if (animal.equals("Dog") && id == 7) {
                        Dog.dogs.remove(7);
                        System.out.println("Congratulations! You bought -> " + Dog.dogs.get(7));
                    } else if (animal.equals("Dog") && id == 8) {
                        Dog.dogs.remove(8);
                        System.out.println("Congratulations! You bought -> " + Dog.dogs.get(8));
                    } else if (animal.equals("Dog") && id == 9) {
                        Dog.dogs.remove(9);
                        System.out.println("Congratulations! You bought -> " + Dog.dogs.get(9));
                    } else if (animal.equals("Dog") && id == 10) {
                        Dog.dogs.remove(10);
                        System.out.println("Congratulations! You bought -> " + Dog.dogs.get(10));
                    } else if (animal.equals("Dog") && id == 11) {
                        Dog.dogs.remove(11);
                        System.out.println("Congratulations! You bought -> " + Dog.dogs.get(11));
                    } else if (animal.equals("Dog") && id == 12) {
                        Dog.dogs.remove(12);
                        System.out.println("Congratulations! You bought -> " + Dog.dogs.get(12));
                    } else if (animal.equals("Dog") && id == 13) {
                        Dog.dogs.remove(13);
                        System.out.println("Congratulations! You bought -> " + Dog.dogs.get(13));
                    } else if (animal.equals("Dog") && id == 14) {
                        Dog.dogs.remove(14);
                        System.out.println("Congratulations! You bought -> " + Dog.dogs.get(14));
                    } else if (animal.equals("Dog") && id == 15) {
                        Dog.dogs.remove(15);
                        System.out.println("Congratulations! You bought -> " + Dog.dogs.get(15));
                    } else if (animal.equals("Dog") && id == 16) {
                        Dog.dogs.remove(16);
                        System.out.println("Congratulations! You bought -> " + Dog.dogs.get(16));
                    } else if (animal.equals("Dog") && id == 17) {
                        Dog.dogs.remove(17);
                        System.out.println("Congratulations! You bought -> " + Dog.dogs.get(17));
                    } else if (animal.equals("Dog") && id == 18) {
                        Dog.dogs.remove(18);
                        System.out.println("Congratulations! You bought -> " + Dog.dogs.get(18));
                    } else if (animal.equals("Dog") && id == 19) {
                        Dog.dogs.remove(19);
                        System.out.println("Congratulations! You bought -> " + Dog.dogs.get(19));
                    } else if (animal.equals("Dog") && id < 0 || id > 19) {
                        System.out.println("Wrong ID!");
                        System.out.println("Enter valid id of the animal you want to buy:");
                        id = scan.nextInt();
                    }


                    if (animal.equals("Cat") && id == 0) {
                        Cat.cats.remove(0);
                        System.out.println("Congratulations! You bought -> " + Cat.cats.get(0));
                    } else if (animal.equals("Cat") && id == 1) {
                        Cat.cats.remove(1);
                        System.out.println("Congratulations! You bought -> " + Cat.cats.get(1));
                    } else if (animal.equals("Cat") && id == 2) {
                        Cat.cats.remove(2);
                        System.out.println("Congratulations! You bought -> " + Cat.cats.get(2));
                    } else if (animal.equals("Cat") && id == 3) {
                        Cat.cats.remove(3);
                        System.out.println("Congratulations! You bought -> " + Cat.cats.get(3));
                    } else if (animal.equals("Cat") && id == 4) {
                        Cat.cats.remove(4);
                        System.out.println("Congratulations! You bought -> " + Cat.cats.get(4));
                    } else if (animal.equals("Cat") && id == 5) {
                        Cat.cats.remove(5);
                        System.out.println("Congratulations! You bought -> " + Cat.cats.get(5));
                    } else if (animal.equals("Cat") && id == 6) {
                        Cat.cats.remove(6);
                        System.out.println("Congratulations! You bought -> " + Cat.cats.get(6));
                    } else if (animal.equals("Cat") && id == 7) {
                        Cat.cats.remove(7);
                        System.out.println("Congratulations! You bought -> " + Cat.cats.get(7));
                    } else if (animal.equals("Cat") && id == 8) {
                        Cat.cats.remove(8);
                        System.out.println("Congratulations! You bought -> " + Cat.cats.get(8));
                    } else if (animal.equals("Cat") && id == 9) {
                        Cat.cats.remove(9);
                        System.out.println("Congratulations! You bought -> " + Cat.cats.get(9));
                    } else if (animal.equals("Cat") && id == 10) {
                        Cat.cats.remove(10);
                        System.out.println("Congratulations! You bought -> " + Cat.cats.get(10));
                    } else if (animal.equals("Cat") && id == 11) {
                        Cat.cats.remove(11);
                        System.out.println("Congratulations! You bought -> " + Cat.cats.get(11));
                    } else if (animal.equals("Cat") && id == 12) {
                        Cat.cats.remove(12);
                        System.out.println("Congratulations! You bought -> " + Cat.cats.get(12));
                    } else if (animal.equals("Cat") && id == 13) {
                        Cat.cats.remove(13);
                        System.out.println("Congratulations! You bought -> " + Cat.cats.get(13));
                    } else if (animal.equals("Cat") && id == 14) {
                        Cat.cats.remove(14);
                        System.out.println("Congratulations! You bought -> " + Cat.cats.get(14));
                    } else if (animal.equals("Cat") && id == 15) {
                        Cat.cats.remove(15);
                        System.out.println("Congratulations! You bought -> " + Cat.cats.get(15));
                    } else if (animal.equals("Cat") && id == 16) {
                        Cat.cats.remove(16);
                        System.out.println("Congratulations! You bought -> " + Cat.cats.get(16));
                    } else if (animal.equals("Cat") && id == 17) {
                        Cat.cats.remove(17);
                        System.out.println("Congratulations! You bought -> " + Cat.cats.get(17));
                    } else if (animal.equals("Cat") && id == 18) {
                        Cat.cats.remove(18);
                        System.out.println("Congratulations! You bought -> " + Cat.cats.get(18));
                    } else if (animal.equals("Cat") && id == 19) {
                        Cat.cats.remove(19);
                        System.out.println("Congratulations! You bought -> " + Cat.cats.get(19));
                    } else if (animal.equals("Cat") && id < 0 || id > 19) {
                        System.out.println("Wrong ID!");
                        System.out.println("Enter valid id of the animal you want to buy:");
                        id = scan.nextInt();
                    }


                    if (animal.equals("Rabbit") && id == 0) {
                        Rabbit.rabits.remove(0);
                        System.out.println("Congratulations! You bought -> " + Rabbit.rabits.get(0));
                    } else if (animal.equals("Rabbit") && id == 1) {
                        Rabbit.rabits.remove(1);
                        System.out.println("Congratulations! You bought -> " + Rabbit.rabits.get(1));
                    } else if (animal.equals("Rabbit") && id == 2) {
                        Rabbit.rabits.remove(2);
                        System.out.println("Congratulations! You bought -> " + Rabbit.rabits.get(2));
                    } else if (animal.equals("Rabbit") && id == 3) {
                        Rabbit.rabits.remove(3);
                        System.out.println("Congratulations! You bought -> " + Rabbit.rabits.get(3));
                    } else if (animal.equals("Rabbit") && id == 4) {
                        Rabbit.rabits.remove(4);
                        System.out.println("Congratulations! You bought -> " + Rabbit.rabits.get(4));
                    } else if (animal.equals("Rabbit") && id == 5) {
                        Rabbit.rabits.remove(5);
                        System.out.println("Congratulations! You bought -> " + Rabbit.rabits.get(5));
                    } else if (animal.equals("Rabbit") && id == 6) {
                        Rabbit.rabits.remove(6);
                        System.out.println("Congratulations! You bought -> " + Rabbit.rabits.get(6));
                    } else if (animal.equals("Rabbit") && id == 7) {
                        Rabbit.rabits.remove(7);
                        System.out.println("Congratulations! You bought -> " + Rabbit.rabits.get(7));
                    } else if (animal.equals("Rabbit") && id == 8) {
                        Rabbit.rabits.remove(8);
                        System.out.println("Congratulations! You bought -> " + Rabbit.rabits.get(8));
                    } else if (animal.equals("Rabbit") && id == 9) {
                        Rabbit.rabits.remove(9);
                        System.out.println("Congratulations! You bought -> " + Rabbit.rabits.get(9));
                    } else if (animal.equals("Rabbit") && id == 10) {
                        Rabbit.rabits.remove(10);
                        System.out.println("Congratulations! You bought -> " + Rabbit.rabits.get(10));
                    } else if (animal.equals("Rabbit") && id == 11) {
                        Rabbit.rabits.remove(11);
                        System.out.println("Congratulations! You bought -> " + Rabbit.rabits.get(11));
                    } else if (animal.equals("Rabbit") && id == 12) {
                        Rabbit.rabits.remove(12);
                        System.out.println("Congratulations! You bought -> " + Rabbit.rabits.get(12));
                    } else if (animal.equals("Rabbit") && id == 13) {
                        Rabbit.rabits.remove(13);
                        System.out.println("Congratulations! You bought -> " + Rabbit.rabits.get(13));
                    } else if (animal.equals("Rabbit") && id == 14) {
                        Rabbit.rabits.remove(14);
                        System.out.println("Congratulations! You bought -> " + Rabbit.rabits.get(14));
                    } else if (animal.equals("Rabbit") && id == 15) {
                        Rabbit.rabits.remove(15);
                        System.out.println("Congratulations! You bought -> " + Rabbit.rabits.get(15));
                    } else if (animal.equals("Rabbit") && id == 16) {
                        Rabbit.rabits.remove(16);
                        System.out.println("Congratulations! You bought -> " + Rabbit.rabits.get(16));
                    } else if (animal.equals("Rabbit") && id == 17) {
                        Rabbit.rabits.remove(17);
                        System.out.println("Congratulations! You bought -> " + Rabbit.rabits.get(17));
                    } else if (animal.equals("Rabbit") && id == 18) {
                        Rabbit.rabits.remove(18);
                        System.out.println("Congratulations! You bought -> " + Rabbit.rabits.get(18));
                    } else if (animal.equals("Rabbit") && id == 19) {
                        Rabbit.rabits.remove(19);
                        System.out.println("Congratulations! You bought -> " + Rabbit.rabits.get(19));
                    } else if (animal.equals("Rabbit") && id < 0 || id > 19) {
                        System.out.println("Wrong ID!");
                        System.out.println("Enter valid id of the animal you want to buy:");
                        id = scan.nextInt();
                    }


                    if (animal.equals("Snake") && id == 0) {
                        Snake.snakes.remove(0);
                        System.out.println("Congratulations! You bought -> " + Snake.snakes.get(0));
                    } else if (animal.equals("Snake") && id == 1) {
                        Snake.snakes.remove(1);
                        System.out.println("Congratulations! You bought -> " + Snake.snakes.get(1));
                    } else if (animal.equals("Snake") && id == 2) {
                        Snake.snakes.remove(2);
                        System.out.println("Congratulations! You bought -> " + Snake.snakes.get(2));
                    } else if (animal.equals("Snake") && id == 3) {
                        Snake.snakes.remove(3);
                        System.out.println("Congratulations! You bought -> " + Snake.snakes.get(3));
                    } else if (animal.equals("Snake") && id == 4) {
                        Snake.snakes.remove(4);
                        System.out.println("Congratulations! You bought -> " + Snake.snakes.get(4));
                    } else if (animal.equals("Snake") && id == 5) {
                        Snake.snakes.remove(5);
                        System.out.println("Congratulations! You bought -> " + Snake.snakes.get(5));
                    } else if (animal.equals("Snake") && id == 6) {
                        Snake.snakes.remove(6);
                        System.out.println("Congratulations! You bought -> " + Snake.snakes.get(6));
                    } else if (animal.equals("Snake") && id == 7) {
                        Snake.snakes.remove(7);
                        System.out.println("Congratulations! You bought -> " + Snake.snakes.get(7));
                    } else if (animal.equals("Snake") && id == 8) {
                        Snake.snakes.remove(8);
                        System.out.println("Congratulations! You bought -> " + Snake.snakes.get(8));
                    } else if (animal.equals("Snake") && id == 9) {
                        Snake.snakes.remove(9);
                        System.out.println("Congratulations! You bought -> " + Snake.snakes.get(9));
                    } else if (animal.equals("Snake") && id == 10) {
                        Snake.snakes.remove(10);
                        System.out.println("Congratulations! You bought -> " + Snake.snakes.get(10));
                    } else if (animal.equals("Snake") && id == 11) {
                        Snake.snakes.remove(11);
                        System.out.println("Congratulations! You bought -> " + Snake.snakes.get(11));
                    } else if (animal.equals("Snake") && id == 12) {
                        Snake.snakes.remove(12);
                        System.out.println("Congratulations! You bought -> " + Snake.snakes.get(12));
                    } else if (animal.equals("Snake") && id == 13) {
                        Snake.snakes.remove(13);
                        System.out.println("Congratulations! You bought -> " + Snake.snakes.get(13));
                    } else if (animal.equals("Snake") && id == 14) {
                        Snake.snakes.remove(14);
                        System.out.println("Congratulations! You bought -> " + Snake.snakes.get(14));
                    } else if (animal.equals("Snake") && id == 15) {
                        Snake.snakes.remove(15);
                        System.out.println("Congratulations! You bought -> " + Snake.snakes.get(15));
                    } else if (animal.equals("Snake") && id == 16) {
                        Snake.snakes.remove(16);
                        System.out.println("Congratulations! You bought -> " + Snake.snakes.get(16));
                    } else if (animal.equals("Snake") && id == 17) {
                        Snake.snakes.remove(17);
                        System.out.println("Congratulations! You bought -> " + Snake.snakes.get(17));
                    } else if (animal.equals("Snake") && id == 18) {
                        Snake.snakes.remove(18);
                        System.out.println("Congratulations! You bought -> " + Snake.snakes.get(18));
                    } else if (animal.equals("Snake") && id == 19) {
                        Snake.snakes.remove(19);
                        System.out.println("Congratulations! You bought -> " + Snake.snakes.get(19));
                    } else if (animal.equals("Snake") && id < 0 || id > 19) {
                        System.out.println("Wrong ID!");
                        System.out.println("Enter valid id of the animal you want to buy:");
                        id = scan.nextInt();
                    }


                    if (animal.equals("Lizard") && id == 0) {
                        Lizard.lizards.remove(0);
                        System.out.println("Congratulations! You bought -> " + Lizard.lizards.get(0));
                    } else if (animal.equals("Lizard") && id == 1) {
                        Lizard.lizards.remove(1);
                        System.out.println("Congratulations! You bought -> " + Lizard.lizards.get(1));
                    } else if (animal.equals("Lizard") && id == 2) {
                        Lizard.lizards.remove(2);
                        System.out.println("Congratulations! You bought -> " + Lizard.lizards.get(2));
                    } else if (animal.equals("Lizard") && id == 3) {
                        Lizard.lizards.remove(3);
                        System.out.println("Congratulations! You bought -> " + Lizard.lizards.get(3));
                    } else if (animal.equals("Lizard") && id == 4) {
                        Lizard.lizards.remove(4);
                        System.out.println("Congratulations! You bought -> " + Lizard.lizards.get(4));
                    } else if (animal.equals("Lizard") && id == 5) {
                        Lizard.lizards.remove(5);
                        System.out.println("Congratulations! You bought -> " + Lizard.lizards.get(5));
                    } else if (animal.equals("Lizard") && id == 6) {
                        Lizard.lizards.remove(6);
                        System.out.println("Congratulations! You bought -> " + Lizard.lizards.get(6));
                    } else if (animal.equals("Lizard") && id == 7) {
                        Lizard.lizards.remove(7);
                        System.out.println("Congratulations! You bought -> " + Lizard.lizards.get(7));
                    } else if (animal.equals("Lizard") && id == 8) {
                        Lizard.lizards.remove(8);
                        System.out.println("Congratulations! You bought -> " + Lizard.lizards.get(8));
                    } else if (animal.equals("Lizard") && id == 9) {
                        Lizard.lizards.remove(9);
                        System.out.println("Congratulations! You bought -> " + Lizard.lizards.get(9));
                    } else if (animal.equals("Lizard") && id == 10) {
                        Lizard.lizards.remove(10);
                        System.out.println("Congratulations! You bought -> " + Lizard.lizards.get(10));
                    } else if (animal.equals("Lizard") && id == 11) {
                        Lizard.lizards.remove(11);
                        System.out.println("Congratulations! You bought -> " + Lizard.lizards.get(11));
                    } else if (animal.equals("Lizard") && id == 12) {
                        Lizard.lizards.remove(12);
                        System.out.println("Congratulations! You bought -> " + Lizard.lizards.get(12));
                    } else if (animal.equals("Lizard") && id == 13) {
                        Lizard.lizards.remove(13);
                        System.out.println("Congratulations! You bought -> " + Lizard.lizards.get(13));
                    } else if (animal.equals("Lizard") && id == 14) {
                        Lizard.lizards.remove(14);
                        System.out.println("Congratulations! You bought -> " + Lizard.lizards.get(14));
                    } else if (animal.equals("Lizard") && id == 15) {
                        Lizard.lizards.remove(15);
                        System.out.println("Congratulations! You bought -> " + Lizard.lizards.get(15));
                    } else if (animal.equals("Lizard") && id == 16) {
                        Lizard.lizards.remove(16);
                        System.out.println("Congratulations! You bought -> " + Lizard.lizards.get(16));
                    } else if (animal.equals("Lizard") && id == 17) {
                        Lizard.lizards.remove(17);
                        System.out.println("Congratulations! You bought -> " + Lizard.lizards.get(17));
                    } else if (animal.equals("Lizard") && id == 18) {
                        Lizard.lizards.remove(18);
                        System.out.println("Congratulations! You bought -> " + Lizard.lizards.get(18));
                    } else if (animal.equals("Lizard") && id == 19) {
                        Lizard.lizards.remove(19);
                        System.out.println("Congratulations! You bought -> " + Lizard.lizards.get(19));
                    } else if (animal.equals("Lizard") && id < 0 || id > 19) {
                        System.out.println("Wrong ID!");
                        System.out.println("Enter valid id of the animal you want to buy:");
                        id = scan.nextInt();
                    }


                    if (animal.equals("Fish") && id == 0) {
                        Fishes.fishes.remove(0);
                        System.out.println("Congratulations! You bought -> " + Fishes.fishes.get(0));
                    } else if (animal.equals("Fish") && id == 1) {
                        Fishes.fishes.remove(1);
                        System.out.println("Congratulations! You bought -> " + Lizard.lizards.get(1));
                    } else if (animal.equals("Fish") && id == 2) {
                        Fishes.fishes.remove(2);
                        System.out.println("Congratulations! You bought -> " + Lizard.lizards.get(2));
                    } else if (animal.equals("Fish") && id == 3) {
                        Fishes.fishes.remove(3);
                        System.out.println("Congratulations! You bought -> " + Lizard.lizards.get(3));
                    } else if (animal.equals("Fish") && id == 4) {
                        Fishes.fishes.remove(4);
                        System.out.println("Congratulations! You bought -> " + Lizard.lizards.get(4));
                    } else if (animal.equals("Fish") && id == 5) {
                        Fishes.fishes.remove(5);
                        System.out.println("Congratulations! You bought -> " + Lizard.lizards.get(5));
                    } else if (animal.equals("Fish") && id == 6) {
                        Fishes.fishes.remove(6);
                        System.out.println("Congratulations! You bought -> " + Lizard.lizards.get(6));
                    } else if (animal.equals("Fish") && id == 7) {
                        Fishes.fishes.remove(7);
                        System.out.println("Congratulations! You bought -> " + Lizard.lizards.get(7));
                    } else if (animal.equals("Fish") && id == 8) {
                        Fishes.fishes.remove(8);
                        System.out.println("Congratulations! You bought -> " + Lizard.lizards.get(8));
                    } else if (animal.equals("Fish") && id == 9) {
                        Fishes.fishes.remove(9);
                        System.out.println("Congratulations! You bought -> " + Lizard.lizards.get(9));
                    } else if (animal.equals("Fish") && id == 10) {
                        Fishes.fishes.remove(10);
                        System.out.println("Congratulations! You bought -> " + Lizard.lizards.get(10));
                    } else if (animal.equals("Fish") && id == 11) {
                        Fishes.fishes.remove(11);
                        System.out.println("Congratulations! You bought -> " + Lizard.lizards.get(11));
                    } else if (animal.equals("Fish") && id == 12) {
                        Fishes.fishes.remove(12);
                        System.out.println("Congratulations! You bought -> " + Lizard.lizards.get(12));
                    } else if (animal.equals("Fish") && id == 13) {
                        Fishes.fishes.remove(13);
                        System.out.println("Congratulations! You bought -> " + Lizard.lizards.get(13));
                    } else if (animal.equals("Fish") && id == 14) {
                        Fishes.fishes.remove(14);
                        System.out.println("Congratulations! You bought -> " + Lizard.lizards.get(14));
                    } else if (animal.equals("Fish") && id == 15) {
                        Fishes.fishes.remove(15);
                        System.out.println("Congratulations! You bought -> " + Lizard.lizards.get(15));
                    } else if (animal.equals("Fish") && id == 16) {
                        Fishes.fishes.remove(16);
                        System.out.println("Congratulations! You bought -> " + Lizard.lizards.get(16));
                    } else if (animal.equals("Fish") && id == 17) {
                        Fishes.fishes.remove(17);
                        System.out.println("Congratulations! You bought -> " + Lizard.lizards.get(17));
                    } else if (animal.equals("Fish") && id == 18) {
                        Fishes.fishes.remove(18);
                        System.out.println("Congratulations! You bought -> " + Lizard.lizards.get(18));
                    } else if (animal.equals("Fish") && id == 19) {
                        Fishes.fishes.remove(19);
                        System.out.println("Congratulations! You bought -> " + Lizard.lizards.get(19));
                    } else if (animal.equals("Fish") && id < 0 || id > 19) {
                        System.out.println("Wrong ID!");
                        System.out.println("Enter valid id of the animal you want to buy:");
                        id = scan.nextInt();
                    }

                    System.out.println("Enter what animal you want to buy:");
                    animal = scan.nextLine();
                    animal = scan.nextLine();

                    System.out.println("These are all breeds we have of that animal!");

                    switch (animal) {
                        case "Dog" -> System.out.println(Dog.dogs.toString());
                        case "Cat" -> System.out.println(Cat.cats.toString());
                        case "Rabbit" -> System.out.println(Rabbit.rabits.toString());
                        case "Snake" -> System.out.println(Snake.snakes.toString());
                        case "Lizard" -> System.out.println(Lizard.lizards.toString());
                        case "Fish" -> System.out.println(Fishes.fishes.toString());
                    }
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
