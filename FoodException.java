package Project;

public class FoodException extends Exception{
    private String msg;

    public FoodException(String msg) {
        this.msg = msg;
    }

    public String getMessage() {
        return msg;
    }
}
