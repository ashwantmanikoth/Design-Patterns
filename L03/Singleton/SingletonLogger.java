package L03.Singleton;

import java.util.HashMap;

public class SingletonLogger {
    private String fileName;
    private static SingletonLogger instance = null;


    private static HashMap<String,SingletonLogger> instanceMap = new HashMap<>();

    private SingletonLogger(String fileName) {
        this.fileName = fileName;
    }


    public static SingletonLogger createInstance(String fileName) {
        if (instanceMap.isEmpty() || !instanceMap.containsKey(fileName) ) {
            System.out.println("Creating new SingletonLogger instance");
            instance = new SingletonLogger(fileName);
            instanceMap.put(fileName,instance);
        } else if (instanceMap.containsKey(fileName)) {
            System.out.println("using existing SingletonLogger instance");
            instance = instanceMap.get(fileName);
        }
        return instance;
    }

    public void work(String message) {
        System.out.println(message);
    }
}
