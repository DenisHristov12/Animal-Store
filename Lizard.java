package Project;

import java.util.ArrayList;

public class Lizard extends Reptiles{
    private double price;
    private int quantity;
    private int id;
    private String gender;
    private double age;
    private String kind;

    public Lizard(double price, int quantity, int id, String gender, double age, String kind){
        super(price, quantity, id, gender, age);
        this.kind = kind;
    }

    public static ArrayList<Lizard> lizards = new ArrayList<>();

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

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public static void addLizards(){
        lizards.add(new Lizard(500, 5, 1, "M", 0.5, "Veiled chameleon"));
        lizards.add(new Lizard(500, 5, 1, "F", 0.5, "Veiled chameleon"));
        lizards.add(new Lizard(400, 5, 2, "M", 0.5, "Leoprard gecko"));
        lizards.add(new Lizard(400, 5, 2, "F", 0.5, "Leoprard gecko"));
    }

    @Override
    public String toString() {
        return kind + " " + gender + ": " + quantity + "\n";
    }
}
