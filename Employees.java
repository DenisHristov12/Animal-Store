package Project;

public class Employees {
    private String name;
    private double salary;
    private int age;
    private String graduation;
    private String gender;
    private String position;
    private int experience;

    public Employees(String name, double salary, int age, String graduation, String gender, String position, int experience) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.graduation = graduation;
        this.gender = gender;
        this.position = position;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGraduation() {
        return graduation;
    }

    public void setGraduation(String graduation) {
        this.graduation = graduation;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
