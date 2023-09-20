package modul;
import java.util.ArrayList;
import java.util.List;


public class Epic {
    private int id;
    private String title;
    private String description;
    private EpicStatus status;
    private List<Subtask> subtasks;

    public Epic(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = EpicStatus.NEW;
        this.subtasks = new ArrayList<>();
    }
    public void addSubtask(Subtask subtask) {
        subtasks.add(subtask);
    }
    public void updateStatus() {
        boolean allSubtasksDone = true;
        for (Subtask subtask : subtasks) {
            if (subtask.getStatus() != Subtask.SubtaskStatus.DONE) {
                allSubtasksDone = false;
                break;
            }
        }
        if (allSubtasksDone) {
            this.status = EpicStatus.DONE;
        } else {
            this.status = EpicStatus.IN_PROGRESS;
        }
    }
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }

     public EpicStatus getStatus() {
        return status;
    }
    public enum EpicStatus {
        NEW,
        IN_PROGRESS,
        DONE
    }
}