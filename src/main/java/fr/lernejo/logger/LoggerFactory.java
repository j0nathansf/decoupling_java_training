package fr.lernejo.logger;

public class LoggerFactory {
    public static Logger getLogger(String name) {
        Logger log1 = new ConsoleLogger();
        Logger log2 = new FileLogger("src/log.txt");
        return new CompositeLogger(log1, log2);
    }
}
