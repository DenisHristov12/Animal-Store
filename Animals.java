package Project;

public class Animals {
    private double price;
    private int id;
    private String gender;
    private double age;

    public Animals(double price, int id, String gender, double age) {
        this.price = price;
        this.id = id;
        this.gender = gender;
        this.age = age;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
