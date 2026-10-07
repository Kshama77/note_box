import java.util.ArrayList;
import java.util.Scanner;

public class NoteBox {
    private static final ArrayList<Note> notes = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        System.out.println("================================");
        System.out.println("        Welcome to NoteBox       ");
        System.out.println("================================");

        while (running) {
            showMenu();
            int choice = readInt("Choose an option: ");

            switch (choice) {
                case 1 -> createNote();
                case 2 -> viewNotes();
                case 3 -> editNote();
                case 4 -> deleteNote();
                case 5 -> {
                    running = false;
                    System.out.println("Thank you for using NoteBox!");
                }
                default -> System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }

    private static void showMenu() {
        System.out.println("\n----------- MENU -----------");
        System.out.println("1. Create Note");
        System.out.println("2. View Notes");
        System.out.println("3. Edit Note");
        System.out.println("4. Delete Note");
        System.out.println("5. Exit");
        System.out.println("----------------------------");
    }

    private static void createNote() {
        System.out.println("\n--- Create Note ---");

        String title = readText("Enter title: ");
        String content = readText("Enter content: ");

        Note note = new Note(title, content);
        notes.add(note);

        System.out.println("Note created successfully!");
    }

    private static void viewNotes() {
        System.out.println("\n--- Your Notes ---");

        if (notes.isEmpty()) {
            System.out.println("No notes found.");
            return;
        }

        for (int i = 0; i < notes.size(); i++) {
            Note note = notes.get(i);

            System.out.println("\nNote #" + (i + 1));
            System.out.println("Title   : " + note.getTitle());
            System.out.println("Content : " + note.getContent());
        }
    }

    private static void editNote() {
        System.out.println("\n--- Edit Note ---");

        if (notes.isEmpty()) {
            System.out.println("No notes available to edit.");
            return;
        }

        viewNotes();

        int noteNumber = readInt("\nEnter note number to edit: ");

        if (noteNumber < 1 || noteNumber > notes.size()) {
            System.out.println("Invalid note number.");
            return;
        }

        Note note = notes.get(noteNumber - 1);

        String newTitle = readText("Enter new title: ");
        String newContent = readText("Enter new content: ");

        note.setTitle(newTitle);
        note.setContent(newContent);

        System.out.println("Note updated successfully!");
    }

    private static void deleteNote() {
        System.out.println("\n--- Delete Note ---");

        if (notes.isEmpty()) {
            System.out.println("No notes available to delete.");
            return;
        }

        viewNotes();

        int noteNumber = readInt("\nEnter note number to delete: ");

        if (noteNumber < 1 || noteNumber > notes.size()) {
            System.out.println("Invalid note number.");
            return;
        }

        notes.remove(noteNumber - 1);

        System.out.println("Note deleted successfully!");
    }

    private static String readText(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    private static int readInt(String message) {
        while (true) {
            try {
                System.out.print(message);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }
}
