package Project;

import java.util.ArrayList;

public class Fishes extends Animals{
    private double price;
    private int id;
    private String gender;
    private double age;
    private String kind;

    public Fishes(double price, int id, String gender, double age, String kind) {
        super(price, id, gender, age);
        this.kind = kind;
        this.price = price;
        this.id = id;
        this.gender = gender;
        this.age = age;
    }

    public static ArrayList<Fishes> fishes = new ArrayList<>();

    public Fishes() {

    }

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

    public void setAge(double age) {
        this.age = age;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public static void addFishes(){
        fishes.add(new Fishes(100, 1, "M", 0.3, "Heller"));

        fishes.add(new Fishes(100, 1, "F", 0.3, "Heller"));

        fishes.add(new Fishes(100, 1, "M", 0.3, "Gupa"));

        fishes.add(new Fishes(100, 1, "F", 0.3, "Gupa"));

        fishes.add(new Fishes(100, 1, "M", 0.3, "Golden fish"));

        fishes.add(new Fishes(100, 1, "F", 0.3, "Golden fish"));
    }

    @Override
    public String toString() {
        return "Kind: " + kind + " | Gender: " + gender + " | Age: " + age + " | Price: " + price + "\n";
    }
}
