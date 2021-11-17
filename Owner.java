package Project;

public class Owner {
    private String name;
    private String lastName;
    private int age;
    private String gender;
    private String graduation;

    public Owner(String name, String lastName, int age, String gender, String graduation) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.graduation = graduation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGraduation() {
        return graduation;
    }

    public void setGraduation(String graduation) {
        this.graduation = graduation;
    }
}
