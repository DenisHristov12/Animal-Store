package Project;

import java.lang.annotation.Annotation;
import java.util.ArrayList;

public class Dog extends Mammals {
    private double price;
    private int id;
    private String gender;
    private double age;
    private String breed;

    public Dog(double price, int id, String gender, double age, String breed){
        super(price, id, gender, age);
        this.breed = breed;
        this.price = price;
        this.id = id;
        this.gender = gender;
        this.age = age;
    }

    public Dog(){

    }

    public static ArrayList<Dog> dogs = new ArrayList<>();

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

    @Override
    public void setAge(double age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public static void addDogs(){
        dogs.add(new Dog(1000, 0, "M", 0.3, "German shepard"));
        dogs.add(new Dog(1000, 1, "M", 0.3, "German shepard"));
        dogs.add(new Dog(1000, 2, "M", 0.3, "German shepard"));
        dogs.add(new Dog(1000, 3, "M", 0.3, "German shepard"));
        dogs.add(new Dog(1000, 4, "M", 0.3, "German shepard"));

        dogs.add(new Dog(1000, 5, "F", 0.3, "German shepard"));
        dogs.add(new Dog(1000, 6, "F", 0.3, "German shepard"));
        dogs.add(new Dog(1000, 7, "F", 0.3, "German shepard"));
        dogs.add(new Dog(1000, 8, "F", 0.3, "German shepard"));
        dogs.add(new Dog(1000, 9, "F", 0.3, "German shepard"));

        dogs.add(new Dog(900, 10, "M", 0.3, "Golden retriever"));
        dogs.add(new Dog(900, 11, "M", 0.3, "Golden retriever"));
        dogs.add(new Dog(900, 12, "M", 0.3, "Golden retriever"));
        dogs.add(new Dog(900, 13, "M", 0.3, "Golden retriever"));
        dogs.add(new Dog(900, 14, "M", 0.3, "Golden retriever"));

        dogs.add(new Dog(900, 15, "F", 0.3, "Golden retriever"));
        dogs.add(new Dog(900, 16, "F", 0.3, "Golden retriever"));
        dogs.add(new Dog(900, 17, "F", 0.3, "Golden retriever"));
        dogs.add(new Dog(900, 18, "F", 0.3, "Golden retriever"));
        dogs.add(new Dog(900, 19, "F", 0.3, "Golden retriever"));
    }

    @Override
    public String toString() {
        return "Breed: " + breed + " | Gender: " + gender + " | Age: " + age + " | Price: " + price + " | ID:" + id + "\n";
    }
}
