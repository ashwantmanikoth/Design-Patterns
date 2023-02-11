package L03.Singleton;

public class Logger {
    private String fileName;

    public Logger(String fileName) {
        this.fileName = fileName;
    }

    public void write(String message) {
        System.out.println( message);
    }
}
