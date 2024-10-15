package ConditionalStatementsAdvanced;


  //  Да се напише конзолна програма, която прочита възраст (десетично число) и пол ("m" или "f"), въведени от потребителя и отпечатва обръщение измежду следните:
  //  • "Mr." - мъж (пол "m") на 16 или повече години
   // • "Master" - момче (пол "m") под 16 години
   // • "Ms." - жена (пол "f") на 16 или повече години
   // • "Miss" - момиче (пол "f") под 16 години


import java.util.Scanner;

public class PersonalTitles {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        double age = Double.parseDouble(scan.nextLine());
        String gender = scan.nextLine();
        boolean mature = age >= 16;


        switch (gender) {
            case "m" -> System.out.println(mature ? "Mr." : "Master");
            case "f" -> System.out.println(mature ? "Ms." : "Miss");

        }

        scan.close();
    }
}
