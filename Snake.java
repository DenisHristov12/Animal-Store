package Project;

import java.util.ArrayList;

public class Snake extends Reptiles {
    private double price;
    private int id;
    private String gender;
    private double age;
    private String kind;

    public Snake() {

    }

    public Snake(double price, int id, String gender, double age, String kind){
        super(price, id, gender, age);
        this.kind = kind;
        this.price = price;
        this.id = id;
        this.gender = gender;
        this.age = age;
    }

    public static ArrayList<Snake> snakes = new ArrayList<>();



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

    public static void addSnakes(){
        snakes.add(new Snake(500, 0, "M", 0.5, "Boa"));
        snakes.add(new Snake(500, 1, "M", 0.5, "Boa"));
        snakes.add(new Snake(500, 2, "M", 0.5, "Boa"));
        snakes.add(new Snake(500, 3, "M", 0.5, "Boa"));
        snakes.add(new Snake(500, 4, "M", 0.5, "Boa"));

        snakes.add(new Snake(500, 5, "F", 0.5, "Boa"));
        snakes.add(new Snake(500, 6, "F", 0.5, "Boa"));
        snakes.add(new Snake(500, 7, "F", 0.5, "Boa"));
        snakes.add(new Snake(500, 8, "F", 0.5, "Boa"));
        snakes.add(new Snake(500, 9, "F", 0.5, "Boa"));

        snakes.add(new Snake(400, 10, "M", 0.5, "Python"));
        snakes.add(new Snake(400, 11, "M", 0.5, "Python"));
        snakes.add(new Snake(400, 12, "M", 0.5, "Python"));
        snakes.add(new Snake(400, 13, "M", 0.5, "Python"));
        snakes.add(new Snake(400, 14, "M", 0.5, "Python"));

        snakes.add(new Snake(400, 15, "F", 0.5, "Python"));
        snakes.add(new Snake(400, 16, "F", 0.5, "Python"));
        snakes.add(new Snake(400, 17, "F", 0.5, "Python"));
        snakes.add(new Snake(400, 18, "F", 0.5, "Python"));
        snakes.add(new Snake(400, 19, "F", 0.5, "Python"));
    }

    @Override
    public String toString() {
        return "Kind: " + kind + " | Gender: " + gender + " | Age: " + age + " | Price: " + price + "\n";
    }
}
