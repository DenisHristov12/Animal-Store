package Project;

import java.util.ArrayList;

public class Rabbit extends Mammals{
    private double price;
    private int id;
    private String gender;
    private double age;
    private String breed;

    public Rabbit(){

    }

    public Rabbit(double price, int id, String gender, double age, String breed){
        super(price, id, gender, age);
        this.breed = breed;
        this.price = price;
        this.id = id;
        this.gender = gender;
        this.age = age;
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
        rabits.add(new Rabbit(500, 0, "M", 0.3, "Holland lop"));
        rabits.add(new Rabbit(500, 1, "M", 0.3, "Holland lop"));
        rabits.add(new Rabbit(500, 2, "M", 0.3, "Holland lop"));
        rabits.add(new Rabbit(500, 3, "M", 0.3, "Holland lop"));
        rabits.add(new Rabbit(500, 4, "M", 0.3, "Holland lop"));

        rabits.add(new Rabbit(500, 5, "F", 0.3, "Holland lop"));
        rabits.add(new Rabbit(500, 6, "F", 0.3, "Holland lop"));
        rabits.add(new Rabbit(500, 7, "F", 0.3, "Holland lop"));
        rabits.add(new Rabbit(500, 8, "F", 0.3, "Holland lop"));
        rabits.add(new Rabbit(500, 9, "F", 0.3, "Holland lop"));

        rabits.add(new Rabbit(400, 10, "M", 0.3, "Dutch lop"));
        rabits.add(new Rabbit(400, 11, "M", 0.3, "Dutch lop"));
        rabits.add(new Rabbit(400, 12, "M", 0.3, "Dutch lop"));
        rabits.add(new Rabbit(400, 13, "M", 0.3, "Dutch lop"));
        rabits.add(new Rabbit(400, 14, "M", 0.3, "Dutch lop"));

        rabits.add(new Rabbit(400, 15, "F", 0.3, "Dutch lop"));
        rabits.add(new Rabbit(400, 16, "F", 0.3, "Dutch lop"));
        rabits.add(new Rabbit(400, 17, "F", 0.3, "Dutch lop"));
        rabits.add(new Rabbit(400, 18, "F", 0.3, "Dutch lop"));
        rabits.add(new Rabbit(400, 19, "F", 0.3, "Dutch lop"));
    }

    @Override
    public String toString() {
        return "Breed: " + breed + " | Gender: " + gender + " | Age: " + age + " | Price: " + price + "\n";
    }
}
