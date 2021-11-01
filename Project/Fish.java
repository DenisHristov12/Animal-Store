package Project;

public class Fish{
    private int quantity;
    private String gender;
    private int age;
    private String type;

    public Fish(int quantity, String gender, int age, String type) {
        this.quantity = quantity;
        this.gender = gender;
        this.age = age;
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
