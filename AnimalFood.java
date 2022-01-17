package Project;

import java.util.ArrayList;

public class AnimalFood {
    private String foodForEachAnimal;
    private String expireDate;
    private int id;
    private int grams;

    public AnimalFood(){

    }

    public AnimalFood(String foodForEachAnimal, String expireDate, int id, int grams) {
        this.foodForEachAnimal = foodForEachAnimal;
        this.expireDate = expireDate;
        this.id = id;
        this.grams = grams;
    }

    public static ArrayList<AnimalFood> animalFoods = new ArrayList<>();

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
        animalFoods.add(new AnimalFood("Dog", "23/07/2022", 0, 700));
        animalFoods.add(new AnimalFood("Dog", "23/07/2022", 1, 700));
        animalFoods.add(new AnimalFood("Dog", "23/03/2022", 2, 500));
        animalFoods.add(new AnimalFood("Dog", "23/09/2022", 3, 1000));
        animalFoods.add(new AnimalFood("Dog", "23/09/2022", 4, 1000));

        animalFoods.add(new AnimalFood("Cat", "23/07/2022", 5, 700));
        animalFoods.add(new AnimalFood("Cat", "23/07/2022", 6, 700));
        animalFoods.add(new AnimalFood("Cat", "23/03/2022", 7, 500));
        animalFoods.add(new AnimalFood("Cat", "23/09/2022", 8, 1000));
        animalFoods.add(new AnimalFood("Cat", "23/09/2022", 9, 1000));

        animalFoods.add(new AnimalFood("Rabbit", "23/07/2022", 10, 700));
        animalFoods.add(new AnimalFood("Rabbit", "23/07/2022", 11, 700));
        animalFoods.add(new AnimalFood("Rabbit", "23/03/2022", 12, 500));
        animalFoods.add(new AnimalFood("Rabbit", "23/09/2022", 13, 1000));
        animalFoods.add(new AnimalFood("Rabbit", "23/09/2022", 14, 1000));

        animalFoods.add(new AnimalFood("Snake", "23/07/2022", 15, 700));
        animalFoods.add(new AnimalFood("Snake", "23/07/2022", 16, 700));
        animalFoods.add(new AnimalFood("Snake", "23/03/2022", 17, 500));
        animalFoods.add(new AnimalFood("Snake", "23/09/2022", 18, 1000));
        animalFoods.add(new AnimalFood("Snake", "23/09/2022", 19, 1000));

        animalFoods.add(new AnimalFood("Lizard", "23/07/2022", 20, 700));
        animalFoods.add(new AnimalFood("Lizard", "23/07/2022", 21, 700));
        animalFoods.add(new AnimalFood("Lizard", "23/03/2022", 22, 500));
        animalFoods.add(new AnimalFood("Lizard", "23/09/2022", 23, 1000));
        animalFoods.add(new AnimalFood("Lizard", "23/09/2022", 24, 1000));

        animalFoods.add(new AnimalFood("Fishes", "23/07/2022", 25, 700));
        animalFoods.add(new AnimalFood("Fishes", "23/07/2022", 26, 700));
        animalFoods.add(new AnimalFood("Fishes", "23/03/2022", 27, 500));
        animalFoods.add(new AnimalFood("Fishes", "23/09/2022", 28, 1000));
        animalFoods.add(new AnimalFood("Fishes", "23/09/2022", 29, 1000));
    }

    @Override
    public String toString() {
        return "Food for: " + foodForEachAnimal + " | Expire date: " + expireDate + " | ID: " + id + " | Grams: " + grams + "\n";
    }
}
