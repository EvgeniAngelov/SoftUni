package firstSteps;
//Напишете програма, която чете ъгъл в радиани (десетично число) и го преобразува в градуси.
// Използвайте формулата: градус = радиан * 180 / π.
// Числото π в Java програми е достъпно чрез Math.PI.


import java.util.Scanner;
import java.lang.Math;

public class RadToDegree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double rad = Double.parseDouble(scan.nextLine());
        Double deg = rad * 180/Math.PI;
        System.out.println(deg);
    }
}
