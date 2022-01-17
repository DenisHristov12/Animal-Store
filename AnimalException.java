package Project;

public class AnimalException extends Exception{
    private String msg;

    public AnimalException(String msg) {
        this.msg = msg;
    }

    public String getMessage() {
        return msg;
    }
}
