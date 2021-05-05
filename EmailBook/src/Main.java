import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Список электронных почт ===");
        System.out.println("Команды:" +
                "\nLIST - вывод списка всех электронных почт" +
                "\nADD - добавление адреса электронной почты");
        TreeSet<String> emails = new TreeSet<>();
        Email.mainEmail(emails);
    }
}
