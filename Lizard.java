package Project;

import java.util.ArrayList;

public class Lizard extends Reptiles{
    private double price;
    private int id;
    private String gender;
    private double age;
    private String kind;

    public Lizard(double price, int id, String gender, double age, String kind){
        super(price, id, gender, age);
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
        lizards.add(new Lizard(500, 0, "M", 0.5, "Veiled chameleon"));
        lizards.add(new Lizard(500, 1, "M", 0.5, "Veiled chameleon"));
        lizards.add(new Lizard(500, 2, "M", 0.5, "Veiled chameleon"));
        lizards.add(new Lizard(500, 3, "M", 0.5, "Veiled chameleon"));
        lizards.add(new Lizard(500, 4, "M", 0.5, "Veiled chameleon"));

        lizards.add(new Lizard(500, 5, "F", 0.5, "Veiled chameleon"));
        lizards.add(new Lizard(500, 6, "F", 0.5, "Veiled chameleon"));
        lizards.add(new Lizard(500, 7, "F", 0.5, "Veiled chameleon"));
        lizards.add(new Lizard(500, 8, "F", 0.5, "Veiled chameleon"));
        lizards.add(new Lizard(500, 9, "F", 0.5, "Veiled chameleon"));

        lizards.add(new Lizard(400, 10, "M", 0.5, "Leoprard gecko"));
        lizards.add(new Lizard(400, 11, "M", 0.5, "Leoprard gecko"));
        lizards.add(new Lizard(400, 12, "M", 0.5, "Leoprard gecko"));
        lizards.add(new Lizard(400, 13, "M", 0.5, "Leoprard gecko"));
        lizards.add(new Lizard(400, 14, "M", 0.5, "Leoprard gecko"));

        lizards.add(new Lizard(400, 15, "F", 0.5, "Leoprard gecko"));
        lizards.add(new Lizard(400, 16, "F", 0.5, "Leoprard gecko"));
        lizards.add(new Lizard(400, 17, "F", 0.5, "Leoprard gecko"));
        lizards.add(new Lizard(400, 18, "F", 0.5, "Leoprard gecko"));
        lizards.add(new Lizard(400, 19, "F", 0.5, "Leoprard gecko"));
    }

    @Override
    public String toString() {
        return kind + " " + gender + ": " + age + " " + price + "\n";
    }
}
