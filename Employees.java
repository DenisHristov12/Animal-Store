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
        return "Employees{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", graduation='" + graduation + '\'' +
                ", gender='" + gender + '\'' +
                ", position='" + position + '\'' +
                ", experience=" + experience +
                '}';
    }

    /*
    public static void addEmployees(){
        Employees employee1 = new Employees("Ivan", 600, 17, "Primary education", "M", "Seller", 1);
        Employees employee2 = new Employees("Maria", 700, 21, "Secondary education", "F", "Cleaner", 5);
        Employees employee3 = new Employees("Lubomir", 800, 25, "Secondary education", "M", "Seller", 3);

        System.out.println();

        try{
            if (employee1.getAge() < 18 || employee1.getGraduation().equals("Primary education") || employee1.getExperience() < 2) {
                throw new AgeException("This employee doesn't have the requirerements to work!");
            } else {
                System.out.println("This employee is hired!");
                employees.add(employee1);
            }
        } catch (AgeException e1) {
            System.out.println(e1.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally{

            try{
                if (employee2.getAge() < 18 || employee2.getGraduation().equals("Primary education") || employee2.getExperience() < 2) {
                    throw new AgeException("This employee doesn't have the requirerements to work!");
                } else {
                    System.out.println("This employee is hired!");
                    employees.add(employee1);
                }
            } catch (AgeException e2) {
                System.out.println(e2.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }finally {

                try{
                    if (employee3.getAge() < 18 || employee3.getGraduation().equals("Primary education") || employee3.getExperience() < 2) {
                        throw new AgeException("This employee doesn't have the requirerements to work!");
                    } else {
                        System.out.println("This employee is hired!");
                        employees.add(employee3);
                    }
                } catch (AgeException e3) {
                    System.out.println(e3.getMessage());
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        //System.out.println();

        //System.out.println("Hired employees: " + " " + employees.size());
        //System.out.println();


    }*/
}

