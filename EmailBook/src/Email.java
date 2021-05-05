import com.sun.source.tree.Tree;

import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {

    public static String emailFind;

    public static void mainEmail(TreeSet<String> emails){
        while (true)
        {
            System.out.println("\nВведите команду:");
            String email = (new Scanner(System.in)).nextLine();

            if (((Pattern.compile("^ADD")).matcher(email)).find()) {
                add(email, emails);
            } else if (email.matches("LIST")) {
                list(email, emails);
            } else {
                System.out.println("Неверная команда");
            }
        }
    }

    public static boolean isEmail(String email){
        Pattern isEmailPattern = Pattern.compile(".+@.+\\..+");
        Matcher isEmail = isEmailPattern.matcher(email);

        if (isEmail.find(4)){
            emailFind = isEmail.group();
            return true;
        } else {
            return false;
        }
    }

    public static void add(String email, TreeSet<String> emails){
        if (isEmail(email)){
            if (emails.contains(emailFind)){
                System.out.println("Данный адрес электронной почты уже есть в списке");
            } else {
                emails.add(emailFind);
                System.out.println("Электронная почта " + emailFind + " добавлена");
            }
        } else {
            System.out.println("Некорректный адрес электронной почты");
        }
    }

    public static void list(String email, TreeSet<String> emails){
        if (emails.isEmpty()){
            System.out.println("В списке ещё нет электронных почт");
        } else {
            for (String word : emails){
                System.out.println(word);
            }
        }
    }
}
