public class TaskConflictNotifier implements TaskObserver {
    @Override
    public void onTaskConflict(String conflictingTask) {
        System.out.println("Error: Task conflicts with existing task \"" + conflictingTask + "\".");
    }
}
