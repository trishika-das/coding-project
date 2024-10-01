import java.time.LocalTime;

public class Task {
    private String description;
    private LocalTime startTime;
    private LocalTime endTime;
    private String priority;
    private boolean completed; // New property to track completion status

    public Task(String description, LocalTime startTime, LocalTime endTime, String priority) {
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
        this.priority = priority;
        this.completed = false; // Initially, the task is not completed
    }

    // Getters and Setters
    public String getDescription() {
        return description;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public String getPriority() {
        return priority;
    }

    public boolean isCompleted() {
        return completed; // Method to check if task is completed
    }

    public void markCompleted() {
        this.completed = true; // Method to mark task as completed
    }

    @Override
    public String toString() {
        return String.format("%s - %s [%s] %s", startTime, endTime, description, priority) + (completed ? " [Completed]" : "");
    }
}
