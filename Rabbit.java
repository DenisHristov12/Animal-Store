package Project;

import java.util.ArrayList;

public class Rabbit extends Mammals{
    private double price;
    private int quantity;
    private int id;
    private String gender;
    private double age;
    private String breed;

    public Rabbit(double price, int quantity, int id, String gender, double age, String breed){
        super(price, quantity, id, gender, age);
        this.breed = breed;
    }

    public static ArrayList<Rabbit> rabits = new ArrayList<>();

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public double getAge() {
        return age;
    }

    @Override
    public void setAge(double age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public static void addRabbits(){
        rabits.add(new Rabbit(500, 5, 1, "M", 0.3, "Holland lop"));
        rabits.add(new Rabbit(500, 5, 1, "F", 0.3, "Holland lop"));
        rabits.add(new Rabbit(400, 5, 2, "M", 0.3, "Dutch lop"));
        rabits.add(new Rabbit(400, 5, 2, "F", 0.3, "Dutch lop"));
    }

    @Override
    public String toString() {
        return breed + " " + gender + ": " + quantity + "\n";
    }
}
