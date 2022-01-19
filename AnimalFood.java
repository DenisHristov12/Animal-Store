package Project;

import java.util.ArrayList;

public class AnimalFood {
    private double price;
    private String foodForEachAnimal;
    private String expireDate;
    private int id;
    private int grams;

    public AnimalFood(){

    }

    public AnimalFood(double price, String foodForEachAnimal, String expireDate, int id, int grams) {
        this.price = price;
        this.foodForEachAnimal = foodForEachAnimal;
        this.expireDate = expireDate;
        this.id = id;
        this.grams = grams;
    }

    public static ArrayList<AnimalFood> animalFoods = new ArrayList<>();

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFoodForEachAnimal() {
        return foodForEachAnimal;
    }

    public void setFoodForEachAnimal(String foodForEachAnimal) {
        this.foodForEachAnimal = foodForEachAnimal;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGrams() {
        return grams;
    }

    public void setGrams(int grams) {
        this.grams = grams;
    }

    public static void addFoods(){
        animalFoods.add(new AnimalFood(10, "Dog", "23/07/2022", 0, 300));
        animalFoods.add(new AnimalFood(20, "Dog", "23/07/2022", 1, 500));
        animalFoods.add(new AnimalFood(30, "Dog", "23/03/2022", 2, 700));
        animalFoods.add(new AnimalFood(40, "Dog", "23/09/2022", 3, 1000));
        animalFoods.add(new AnimalFood(50, "Dog", "23/09/2022", 4, 1200));

        animalFoods.add(new AnimalFood(10, "Cat", "23/07/2022", 5, 300));
        animalFoods.add(new AnimalFood(20, "Cat", "23/07/2022", 6, 500));
        animalFoods.add(new AnimalFood(30, "Cat", "23/03/2022", 7, 700));
        animalFoods.add(new AnimalFood(40, "Cat", "23/09/2022", 8, 1000));
        animalFoods.add(new AnimalFood(50, "Cat", "23/09/2022", 9, 1200));

        animalFoods.add(new AnimalFood(10, "Rabbit", "23/07/2022", 10, 300));
        animalFoods.add(new AnimalFood(20, "Rabbit", "23/07/2022", 11, 500));
        animalFoods.add(new AnimalFood(30, "Rabbit", "23/03/2022", 12, 700));
        animalFoods.add(new AnimalFood(40, "Rabbit", "23/09/2022", 13, 1000));
        animalFoods.add(new AnimalFood(50, "Rabbit", "23/09/2022", 14, 1200));

        animalFoods.add(new AnimalFood(10, "Snake", "23/07/2022", 15, 300));
        animalFoods.add(new AnimalFood(20, "Snake", "23/07/2022", 16, 500));
        animalFoods.add(new AnimalFood(30, "Snake", "23/03/2022", 17, 700));
        animalFoods.add(new AnimalFood(40, "Snake", "23/09/2022", 18, 1000));
        animalFoods.add(new AnimalFood(50, "Snake", "23/09/2022", 19, 1200));

        animalFoods.add(new AnimalFood(10, "Lizard", "23/07/2022", 20, 300));
        animalFoods.add(new AnimalFood(20, "Lizard", "23/07/2022", 21, 500));
        animalFoods.add(new AnimalFood(30, "Lizard", "23/03/2022", 22, 700));
        animalFoods.add(new AnimalFood(40, "Lizard", "23/09/2022", 23, 1000));
        animalFoods.add(new AnimalFood(50, "Lizard", "23/09/2022", 24, 1200));

        animalFoods.add(new AnimalFood(10, "Fishes", "23/07/2022", 25, 300));
        animalFoods.add(new AnimalFood(20, "Fishes", "23/07/2022", 26, 500));
        animalFoods.add(new AnimalFood(30, "Fishes", "23/03/2022", 27, 700));
        animalFoods.add(new AnimalFood(40, "Fishes", "23/09/2022", 28, 1000));
        animalFoods.add(new AnimalFood(50, "Fishes", "23/09/2022", 29, 1200));
    }

    @Override
    public String toString() {
        return "Food for: " + foodForEachAnimal + " | Price:" + price + " | Expire date: " + expireDate + " | Grams: " + grams + " | ID: " + id + "\n";
    }
}
