package Project;

public class AgeException extends Exception{
    private String msg;

    public AgeException(String msg) {
        this.msg = msg;
    }

    public String getMessage() {
        return msg;
    }
}
