package Project;

import java.util.ArrayList;

public class Employees {
    private String name;
    private double salary;
    private int age;
    private String graduation;
    private String gender;
    private String position;
    private int experience;

    public Employees(){

    }

    public Employees(String name, double salary, int age, String graduation, String gender, String position, int experience) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.graduation = graduation;
        this.gender = gender;
        this.position = position;
        this.experience = experience;
    }

    public static ArrayList<Employees> employees = new ArrayList<>();

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

    @Override
    public String toString() {
        return "Name: " + name +
                " | Salary: " + salary +
                " | Age: " + age +
                " | Graduation: " + graduation +
                " | Gender: " + gender +
                " | Position: " + position +
                " | Experience: " + experience + "\n";
    }


    public static void addEmployees(){
        Employees employee1 = new Employees("Ivan", 900, 21, "University", "M", "Seller", 3);
        Employees employee2 = new Employees("Maria", 700, 20, "Secondary education", "F", "Cleaner", 5);
        Employees employee3 = new Employees("Lubomir", 900, 25, "Secondary education", "M", "Seller", 3);

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
    }
}

