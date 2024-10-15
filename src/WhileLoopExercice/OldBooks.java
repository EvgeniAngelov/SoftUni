package WhileLoopExercice;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Въвеждане на търсената книга
        String favoriteBook = scanner.nextLine();

        // Променлива за бройката на проверените книги
        int checkedBooks = 0;

        while (true) {
            // Четене на текущата книга
            String currentBook = scanner.nextLine();

            // Ако книгите са свършили
            if (currentBook.equals("No More Books")) {
                System.out.println("The book you search is not here!");
                System.out.println("You checked " + checkedBooks + " books.");
                break;
            }

            // Ако е намерена търсената книга
            if (currentBook.equals(favoriteBook)) {
                System.out.println("You checked " + checkedBooks + " books and found it.");
                break;
            }

            // Увеличаване на броя на проверените книги
            checkedBooks++;
        }
    }
}

