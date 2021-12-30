package Project;

public class Reptiles extends Animals{
    private double price;
    private int id;
    private String gender;
    private double age;

    public Reptiles(double price, int id, String gender, double age) {
        super(price, id, gender, age);
    }

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

    public void setAge(double age) {
        this.age = age;
    }
}
