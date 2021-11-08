package Project;

public class Lizard extends Reptiles{
    private double price;
    private int quantity;
    private int id;
    private String gender;
    private double age;

    public Lizard(double price, int quantity, int id, String gender, double age){
        super(price, quantity, id, gender, age);
    }
}
