package Time;

public class Main {
    public static void main(String [] args){
        displayCurrentTime();
    }
    // Example usage of Time class
    public static void displayCurrentTime(){
        // Get the current millis
        long current_millis = System.currentTimeMillis();

        // Create the object
        Time time = new Time(current_millis);

        // Print out the time
        System.out.println("Time based on current milliseconds : " + time.displayTime());
    }
}
