package Project;

public class Rabbit extends Mammals{
    private double price;
    private int quantity;
    private int id;
    private String gender;
    private double age;

    public Rabbit(double price, int quantity, int id, String gender, double age){
        super(price, quantity, id, gender, age);
    }
}