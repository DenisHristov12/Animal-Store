package Project;

import java.util.ArrayList;

public class Store {
    private String name;
    private String owner;
    private String adress;

    private ArrayList<Animals> animals = new ArrayList<>();

    private ArrayList<Employees> employees = new ArrayList<>();

    public Store(String name, String owner, String adress, ArrayList<Animals> animals, ArrayList<Employees> employees) {
        this.name = name;
        this.owner = owner;
        this.adress = adress;
        this.animals = animals;
        this.employees = employees;
    }

    Employees employee1 = new Employees("Georgi", 800, 25, "Visshe", "Muj", "Seller");
    Employees employee2 = new Employees("Katerina", 700, 23, "Sredno", "Jena", "Cleaner");
    Employees employee3 = new Employees("Petur", 650, 27, "Nachalno", "Muj", "Feeder");

    public void HireEmployee(int age, int experience, String graduation){
        /*if(){
            employees.add(employee1);
            employees.add(employee2);
            employees.add(employee3);
        }*/
    }

    public void FireEmployee(String reason, String name){
        /*if(){
            employees.remove(employee1);
            employees.remove(employee2);
            employees.remove(employee3);
        }*/
    }
}
