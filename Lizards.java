package Project;

public class Lizards extends Reptiles{
    private double price;
    private int quantity;
    private int id;
    private String gender;
    private int age;

    public Lizards(double price, int quantity, int id, String gender, int age){
        super(price, quantity, id, gender, age);
    }
}
