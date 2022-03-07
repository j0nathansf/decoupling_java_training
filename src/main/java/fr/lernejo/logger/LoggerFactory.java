package fr.lernejo.logger;

public class LoggerFactory {
    public static Logger getLogger(String name) {
        if (name.equals("simulation")) {
            new FileLogger("src/log.txt");
        }
        return new ContextualLogger("ConsoleLogger", new ConsoleLogger());
    }
}
