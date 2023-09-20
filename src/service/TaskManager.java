package service;
import modul.Epic;
import modul.Subtask;
import modul.Task;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskManager {
    private int nextId = 1;
    private Map<Integer, Task> tasks = new HashMap<>();
    private Map<Integer, Epic> epics = new HashMap<>();
    private Map<Integer, Subtask> subtasks = new HashMap<>();

    public Task createTask(String title, String description) {
        int taskId = nextId++;
        Task task = new Task(taskId, title, description);
        tasks.put(taskId, task);
        return task;
    }

    public Epic createEpic(String title, String description) {
        int epicId = nextId++;
        Epic epic = new Epic(epicId, title, description);
        epics.put(epicId, epic);
        return epic;
    }

    public Subtask createSubtask(String title, String description) {
        int subtaskId = nextId++;
        Subtask subtask = new Subtask(subtaskId, title, description);
        subtasks.put(subtaskId, subtask);
        return subtask;
    }

//    public Task getTaskById(int taskId) {
//        return tasks.get(taskId);
//    }
//
//    public Epic getEpicById(int epicId) {
//        return epics.get(epicId);
//    }
//
//    public Subtask getSubtaskById(int subtaskId) {
//        return subtasks.get(subtaskId);
//    }

    public List<Task> getAllTasks() {
        return List.copyOf(tasks.values());
    }

    public List<Epic> getAllEpics() {
        return List.copyOf(epics.values());
    }

    public List<Subtask> getAllSubtasks() {
        return List.copyOf(subtasks.values());
    }


}