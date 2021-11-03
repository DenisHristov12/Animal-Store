package Project;

public class Animals {
    private double price;
    private int quantity;
    private int id;
    private String gender;
    private int age;

    public Animals(double price, int quantity, int id, String gender, int age) {
        this.price = price;
        this.quantity = quantity;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
