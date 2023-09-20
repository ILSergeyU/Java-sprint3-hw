package modul;

import service.TaskManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);

        System.out.println("����� ���������� � ������� ���������� ��������!");

        while (true) {
             playMenu();

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("������� �������� ������: ");
                    scanner.nextLine();
                    String title = scanner.nextLine();
                    System.out.print("������� �������� ������: ");
                    String description = scanner.nextLine();
                    taskManager.createTask(title, description);
                    System.out.println("������ �������.");
                    break;

                case 2:
                    System.out.print("������� �������� �����: ");
                    scanner.nextLine();
                    String epicTitle = scanner.nextLine();
                    System.out.print("������� �������� �����: ");
                    String epicDescription = scanner.nextLine();
                    taskManager.createEpic(epicTitle, epicDescription);
                    System.out.println("���� ������.");
                    break;

                case 3:
                    System.out.print("������� �������� ���������: ");
                    scanner.nextLine();
                    String subtaskTitle = scanner.nextLine();
                    System.out.print("������� �������� ���������: ");
                    String subtaskDescription = scanner.nextLine();
                    taskManager.createSubtask(subtaskTitle, subtaskDescription);
                    System.out.println("��������� �������.");
                    break;

                case 4:
                    System.out.println("������ �����:");
                    for (Task task : taskManager.getAllTasks()) {
                        System.out.println("ID: " + task.getId() + ", ��������: " + task.getTitle() + ", ������: " + task.getStatus());
                    }
                    break;

                case 5:
                    System.out.println("������ ������:");
                    for (Epic epic : taskManager.getAllEpics()) {
                        System.out.println("ID: " + epic.getId() + ", ��������: " + epic.getTitle() + ", ������: " + epic.getStatus());
                    }
                    break;

                case 6:
                    System.out.println("������ ��������:");
                    for (Subtask subtask : taskManager.getAllSubtasks()) {
                        System.out.println("ID: " + subtask.getId() + ", ��������: " + subtask.getTitle() + ", ������: " + subtask.getStatus());
                    }
                    break;

                case 7:
                    System.out.println("����� �� ���������.");
                    return;

                default:
                    System.out.println("�������� �����. ����������, �������� �������� �� ������.");
                    break;
            }
        }
    }
   static void playMenu(){
        System.out.println("�������� ��������:");
        System.out.println("1. ������� ������");
        System.out.println("2. ������� ����");
        System.out.println("3. ������� ���������");
        System.out.println("4. ������� ������ �����");
        System.out.println("5. ������� ������ ������");
        System.out.println("6. ������� ������ ��������");
        System.out.println("7. �����");

    }
}