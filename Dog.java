package Project;

public class Dog extends Mammals {
    private double price;
    private int quantity;
    private int id;
    private String gender;
    private double age;

    public Dog(double price, int quantity, int id, String gender, double age){
        super(price, quantity, id, gender, age);
    }
}
