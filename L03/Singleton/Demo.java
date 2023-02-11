package L03.Singleton;


public class Demo {
    public static void main(String args[]){

        String fileName1 = "file1";
        String fileName2 = "file2";


        Logger logger1 = new Logger(fileName1);
        Logger logger2 = new Logger(fileName1);

        if(!logger1.equals(logger2)){
            System.out.println("same file name!! printing");
            logger1.write("test logger 1");
            logger2.write("test logger 2");
        }

        System.out.println("Different file name different logger"+(logger1.equals(logger2)?"Same Loggers":"Different Loggers"));

        //multiple files
        Logger logger3  = new Logger(fileName1);
        logger3.write("test logger 3");

        Logger logger4 = new Logger(fileName2);
        logger4.write("test logger 4");


        SingletonLogger singletonLogger = SingletonLogger.createInstance(fileName1);
        singletonLogger.work("new logger");

        SingletonLogger singletonLogger1 = SingletonLogger.createInstance(fileName2);
        singletonLogger1.work("new logger");

        SingletonLogger singletonLogger3 = SingletonLogger.createInstance(fileName1);
        singletonLogger3.work("same file name");
    }
}
