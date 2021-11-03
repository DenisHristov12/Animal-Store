package Project;

public class Mammals extends Animals {
    private double price;
    private int quantity;
    private int id;
    private String gender;
    private int age;

    public Mammals(double price, int quantity, int id, String gender, int age) {
        super(price, quantity, id, gender, age);
    }
}
