package firstSteps;
//Вход
//От конзолата се четат 3 реда:
//        1. Брой страници в текущата книга – цяло число в интервала [1…1000]
//        2. Страници, които прочита за 1 час – цяло число в интервала [1…1000]
//        3. Броят на дните, за които трябва да прочете книгата – цяло число в интервала [1…1000]
//Изход
//Да се отпечата на конзолата броят часове, които Жоро трябва да отделя за четене всеки ден.



import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pages = Integer.parseInt(scan.nextLine());
        int pagesPerHeur = Integer.parseInt(scan.nextLine());
        int days = Integer.parseInt(scan.nextLine());

        int heursPerDay = pages/pagesPerHeur/days;

        System.out.println(heursPerDay);


    }
}
