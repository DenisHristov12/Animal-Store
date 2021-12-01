package Project;

import java.util.ArrayList;
import java.util.Scanner;

public class RunProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Mammals> mammals = new ArrayList<>();
        ArrayList<Reptiles> reptiles = new ArrayList<>();
        ArrayList<Fishes> fishes = new ArrayList<>();

        ArrayList<Employees> employees = new ArrayList<>();

        Store myStore = new Store("Animal Store", "Ivan", "Georgi Dimitrov 57", mammals, reptiles, fishes, employees);

        Employees employee1 = new Employees("Ivan", 600, 17, "Primay education", "M", "Seller", 1);
        Employees employee2 = new Employees("Maria", 700, 21, "Secondary education", "F", "Cleaner", 5);
        Employees employee3 = new Employees("Lubomir", 800, 25, "Secondary education", "M", "Seller", 3);

        System.out.println();
        try{
            if (employee1.getAge() < 18 || employee1.getGraduation().equals("Primary education") || employee1.getExperience() < 2) {
                throw new AgeException("This employee doesn't have the requirerements to work!");
            } else {
                System.out.println("This employee is hired!");
                employees.add(employee1);
            }
        } catch (AgeException e1) {
            System.out.println(e1.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } /*finally{
            System.out.println("End");
        }*/

        System.out.println();
        try{
            if (employee2.getAge() < 18 || employee2.getGraduation().equals("Primary education") || employee2.getExperience() < 2) {
                throw new AgeException("This employee doesn't have the requirerements to work!");
            } else {
                System.out.println("This employee is hired!");
                employees.add(employee1);
            }
        } catch (AgeException e2) {
            System.out.println(e2.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } /*finally{
            System.out.println("End");
        }*/

        System.out.println();
        try{
            if (employee3.getAge() < 18 || employee3.getGraduation().equals("Primary education") || employee3.getExperience() < 2) {
                throw new AgeException("This employee doesn't have the requirerements to work!");
            } else {
                System.out.println("This employee is hired!");
                employees.add(employee3);
            }
        } catch (AgeException e3) {
            System.out.println(e3.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } /*finally{
            System.out.println("End");
        }*/

        System.out.println();

        System.out.println("Hired employees: " + " " + employees.size());
        System.out.println();

        //myStore.FireEmployee();

        myStore.addMammals(mammals);
        myStore.addReptiles(reptiles);
        myStore.addFishes(fishes);


        double startWorkTime = 8.00;
        double endWorkTime = 16.00;

        System.out.println("Input time of the day: ");
        double inputTime = scan.nextDouble();


        if(inputTime < 8 || inputTime > 16){
            System.out.println("The store is not working!");
        }else{
            myStore.SupplyAnimals(0);
            while(myStore.quantity > 20) {
                myStore.Sell(0);
                if(myStore.quantity < 20){
                        myStore.ReSupply(0);
                }
            }
        }
    }
}
