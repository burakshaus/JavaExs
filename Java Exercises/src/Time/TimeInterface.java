package Time;

public interface TimeInterface {

    // Getters for hours, minutes and seconds
    int getHours();
    int getMinutes();
    int getSeconds();

    // Setters for hours, minutes and seconds
    void setHours(int hours) throws Exception;
    void setMinutes(int minutes) throws Exception;
    void setSeconds(int seconds) throws Exception;

    // Methods to add seconds to the current time
    void addSeconds(int seconds);

    // Normalize time if hours, minutes and seconds exceed their limits
    void normalizeTime();

    // Method to display data
    String displayTime();

}
