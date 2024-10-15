package ConditionalStatementsAdvanced;

import java.util.HashMap;
import java.util.Scanner;
//Предприемчив българин отваря квартални магазинчета в няколко града и продава на различни цени:
//град /
// продукт	coffee	water	beer	sweets	peanuts
//Sofia	    0.50	0.80	1.20	1.45	1.60
//Plovdiv	0.40	0.70	1.15	1.30	1.50
//Varna 	0.45	0.70	1.10	1.35	1.55

//        Напишете програма, която чете продукт (низ), град (низ) и количество (десетично число),
//въведени от потребителя и пресмята и отпечатва колко струва съответното количество
//от избрания продукт в посочения град.



public class SmallShop {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String product = scan.nextLine();
        String city = scan.nextLine();
        Double quantity = Double.parseDouble(scan.nextLine());



        HashMap<String, HashMap<String, Double>> priceTable = new HashMap<>();

        // Добавяне на ред "A"
        priceTable.put("Sofia", new HashMap<>());
        // Добавяне на колони в ред "A"
        priceTable.get("Sofia").put("coffee", 0.5);
        priceTable.get("Sofia").put("water", 0.8);
        priceTable.get("Sofia").put("beer", 1.2);
        priceTable.get("Sofia").put("sweets", 1.45);
        priceTable.get("Sofia").put("peanuts", 1.6);

        // Добавяне на ред "B"
        priceTable.put("Plovdiv", new HashMap<>());
        // Добавяне на колони в ред "B"
        priceTable.get("Plovdiv").put("coffee", 0.4);
        priceTable.get("Plovdiv").put("water", 0.7);
        priceTable.get("Plovdiv").put("beer", 1.15);
        priceTable.get("Plovdiv").put("sweets", 1.30);
        priceTable.get("Plovdiv").put("peanuts", 1.5);

        priceTable.put("Varna", new HashMap<>());

        // Добавяне на колони в ред "B"
        priceTable.get("Varna").put("coffee", 0.45);
        priceTable.get("Varna").put("water", 0.7);
        priceTable.get("Varna").put("beer", 1.1);
        priceTable.get("Varna").put("sweets", 1.35);
        priceTable.get("Varna").put("peanuts", 1.55);



        System.out.println(quantity * priceTable.get(city).get(product));


    }
}
