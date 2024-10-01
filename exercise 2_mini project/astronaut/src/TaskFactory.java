import java.time.LocalTime;
import java.time.format.DateTimeParseException;

public class TaskFactory {
    public static Task createTask(String description, String startTime, String endTime, String priority) {
        try {
            LocalTime start = LocalTime.parse(startTime);
            LocalTime end = LocalTime.parse(endTime);
            if (start.isAfter(end)) {
                System.out.println("Error: Start time must be before end time.");
                return null;
            }
            return new Task(description, start, end, priority);
        } catch (DateTimeParseException e) {
            System.out.println("Error: Invalid time format.");
            return null;
        }
    }
}
