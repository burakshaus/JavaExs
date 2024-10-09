package Time;

public class Time implements TimeInterface{
    // Fields to represent hours, minutes and seconds
    private int hours;
    private int minutes;
    private int seconds;

    // Constructor to initialize Time
    public Time(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        normalizeTime();
    }

    // Default constructor to initialize Time to 00:00:00
    public Time(){
        this(0,0,0);
    }

    // New constructor to initialize based on elapsed time in milliseconds since 1970-01-01
    public Time(long elapsedTimeMillis){
        setTimeFromMillis(elapsedTimeMillis);
    }

    // Set time fields based on milliseconds since 1970-01-01
    private void setTimeFromMillis(long elapsedTimeMillis){
        // Convert millis to seconds
        long totalSeconds = elapsedTimeMillis / 1000;

        // Extract the current seconds (0-59)
        this.seconds = (int)(totalSeconds % 60);

        // Convert seconds to minutes
        long totalMinutes = totalSeconds/60;

        // Extract the current minutes (0- 59)
        this.minutes = (int)(totalMinutes % 60);

        // Convert minutes to hours
        long totalHours = totalMinutes / 60;

        this.hours = (int)(totalHours % 24);

    }

    // Getters
    public int getHours(){
        return hours;
    }
    public int getMinutes(){
        return minutes;
    }
    public int getSeconds(){
        return seconds;
    }

    // Setters with validation
    public void setHours(int hours) throws Exception {
        if(hours >=0 && hours < 24){
            this.hours = hours;
        }
        else {
            throw new Exception("Invalid Hour parameter given \nParameter is :" + hours);
        }
    }
    public void setMinutes(int minutes) throws Exception{
        if(minutes >=0 && minutes <60){
            this.minutes = minutes;
        }
        else {
            throw new Exception("Invalid Minute parameter given \nParameter is :" + minutes);
        }
    }
    public void setSeconds(int seconds) throws Exception{
        if(seconds >= 0 && seconds < 60){
            this.seconds = seconds;
        }
        else {
            throw new Exception("Invalid Second parameter given \nParameter is :" + seconds);
        }
    }

    // Methods to add seconds to the current time
    public void addSeconds(int seconds){
        if(seconds >0){
            this.seconds += seconds;
        }
    }

    // Normalize time if minutes and seconds exceed their limits
    public void normalizeTime(){
        if(seconds >= 60){
            minutes += seconds / 60;
            seconds = seconds % 60;
        }
        if (minutes >= 60){
            hours += minutes /60;
            minutes = minutes % 60;
        }
        if(hours >= 24){
            hours = hours % 24;
        }
    }

    // Method to display time in hh:mm:ss format
    public String displayTime(){
        return String.format("%02d:%02d:%02d UTC", hours, minutes, seconds);
    }
}
