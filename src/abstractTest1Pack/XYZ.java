package abstractTest1Pack;

public class XYZ extends ABC {
    private String greeting; // To store greeting input

    // Method to set greeting
    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    // Override DAY() with no parameters, as required
    @Override
    String DAY() {
        return greeting + " THURSDAY";
    }
}
