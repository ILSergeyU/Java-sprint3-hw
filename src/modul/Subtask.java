package modul;

public class Subtask {
    private int id;
    private String title;
    private String description;
    private SubtaskStatus status;
    private Epic epic;

    public Subtask(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = SubtaskStatus.NEW;
    }

      public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

     public SubtaskStatus getStatus() {
        return status;
    }


    public enum SubtaskStatus {
        NEW,
        IN_PROGRESS,
        DONE
    }
}