package Project;

import java.util.ArrayList;

public class Gupa extends Fishes{
    private double price;
    private int quantity;
    private int id;
    private String gender;
    private double age;

    public Gupa(double price, int quantity, int id, String gender, double age) {
        super(price, quantity, id, gender, age);
    }

    public static ArrayList<Gupa> gupas = new ArrayList<>();

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

    public static void addGupas(){
        gupas.add(new Gupa(100, 10, 1, "M", 0.3));
        gupas.add(new Gupa(100, 10, 1, "F", 0.3));
    }

    @Override
    public String toString() {
        return "Gupa: " + gender + ": " + quantity + "\n";
    }
}
