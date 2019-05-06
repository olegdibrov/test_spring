public class App {
    private Client client;
    private ConsoleEventLogger consoleEventLogger;

    private void logEvent(String msg) {
        String message = msg.replaceAll(client.getId(), client.getFullName());
        consoleEventLogger.logEvent(message);
    }

    public static void main(String[] args) {
        App app = new App();
        app.client = new Client("1", "Oleg Dibrov");
        app.consoleEventLogger = new ConsoleEventLogger();
        app.logEvent("Some event for 1 user");
    }
}
