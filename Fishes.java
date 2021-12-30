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
    }

    public static ArrayList<Fishes> hellers = new ArrayList<>();
    public static ArrayList<Fishes> gupas = new ArrayList<>();
    public static ArrayList<Fishes> goldenFishes = new ArrayList<>();

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
        hellers.add(new Fishes(100, 1, "M", 0.3, "Heller"));

        hellers.add(new Fishes(100, 1, "F", 0.3, "Heller"));

        gupas.add(new Fishes(100, 1, "M", 0.3, "Gupa"));

        gupas.add(new Fishes(100, 1, "F", 0.3, "Gupa"));

        goldenFishes.add(new Fishes(100, 1, "M", 0.3, "Golden fish"));

        goldenFishes.add(new Fishes(100, 1, "F", 0.3, "Golden fish"));
    }

    @Override
    public String toString() {
        return kind + " " + gender + ": " + age + " " + price + "\n";
    }
}
