class Logger {

    private static Logger obj;

    
    private Logger() {
        System.out.println("Logger Instance Created");
    }

    public static Logger getInstance() {
        if (obj == null) {
            obj = new Logger();
        }
        return obj;
    }

    public void log(String msg) {
        System.out.println("LOG: " + msg);
    }
}

public class SingletonPatternExample {

    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        Logger logger3 = Logger.getInstance();

        logger1.log("Application Started");
        logger2.log("User Logged In");
        logger3.log("Application Closed");

        System.out.println();

        System.out.println("logger1 HashCode : " + logger1.hashCode());
        System.out.println("logger2 HashCode : " + logger2.hashCode());
        System.out.println("logger3 HashCode : " + logger3.hashCode());

        if (logger1 == logger2 && logger2 == logger3) {
            System.out.println("\nOnly one Logger instance exists.");
        } else {
            System.out.println("\nMultiple Logger instances created.");
        }
    }
}