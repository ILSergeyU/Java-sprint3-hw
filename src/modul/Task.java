package modul;



public class Task {
    private int id;
    private String title;
    private String description;
    private TaskStatus status;
    private Epic epic;

    public Task(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = TaskStatus.NEW;
    }

    public void updateStatus(TaskStatus newStatus) {
        this.status = newStatus;
        if (epic != null) {
            epic.updateStatus();
        }
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public enum TaskStatus {
        NEW,
        IN_PROGRESS,
        DONE
    }
}