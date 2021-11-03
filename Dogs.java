package Project;

public class Dogs extends Mammals {
    private double price;
    private int quantity;
    private int id;
    private String gender;
    private int age;

    public Dogs(double price, int quantity, int id, String gender, int age){
        super(price, quantity, id, gender, age);
    }
}
