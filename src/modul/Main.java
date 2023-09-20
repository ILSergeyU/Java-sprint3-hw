package modul;

import service.TaskManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать в систему управления задачами!");

        while (true) {
             playMenu();

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Введите название задачи: ");
                    scanner.nextLine();
                    String title = scanner.nextLine();
                    System.out.print("Введите описание задачи: ");
                    String description = scanner.nextLine();
                    taskManager.createTask(title, description);
                    System.out.println("Задача создана.");
                    break;

                case 2:
                    System.out.print("Введите название эпика: ");
                    scanner.nextLine();
                    String epicTitle = scanner.nextLine();
                    System.out.print("Введите описание эпика: ");
                    String epicDescription = scanner.nextLine();
                    taskManager.createEpic(epicTitle, epicDescription);
                    System.out.println("Эпик создан.");
                    break;

                case 3:
                    System.out.print("Введите название подзадачи: ");
                    scanner.nextLine();
                    String subtaskTitle = scanner.nextLine();
                    System.out.print("Введите описание подзадачи: ");
                    String subtaskDescription = scanner.nextLine();
                    taskManager.createSubtask(subtaskTitle, subtaskDescription);
                    System.out.println("Подзадача создана.");
                    break;

                case 4:
                    System.out.println("Список задач:");
                    for (Task task : taskManager.getAllTasks()) {
                        System.out.println("ID: " + task.getId() + ", Название: " + task.getTitle() + ", Статус: " + task.getStatus());
                    }
                    break;

                case 5:
                    System.out.println("Список эпиков:");
                    for (Epic epic : taskManager.getAllEpics()) {
                        System.out.println("ID: " + epic.getId() + ", Название: " + epic.getTitle() + ", Статус: " + epic.getStatus());
                    }
                    break;

                case 6:
                    System.out.println("Список подзадач:");
                    for (Subtask subtask : taskManager.getAllSubtasks()) {
                        System.out.println("ID: " + subtask.getId() + ", Название: " + subtask.getTitle() + ", Статус: " + subtask.getStatus());
                    }
                    break;

                case 7:
                    System.out.println("Выход из программы.");
                    return;

                default:
                    System.out.println("Неверный выбор. Пожалуйста, выберите действие из списка.");
                    break;
            }
        }
    }
   static void playMenu(){
        System.out.println("Выберите действие:");
        System.out.println("1. Создать задачу");
        System.out.println("2. Создать эпик");
        System.out.println("3. Создать подзадачу");
        System.out.println("4. Вывести список задач");
        System.out.println("5. Вывести список эпиков");
        System.out.println("6. Вывести список подзадач");
        System.out.println("7. Выйти");

    }
}