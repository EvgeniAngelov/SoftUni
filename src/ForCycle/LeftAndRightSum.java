package ForCycle;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class LeftAndRightSum {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int numberCount = Integer.parseInt(scan.nextLine());
        Integer[] number = new Integer[numberCount *= 2];
        int resultLeft = 0;
        int resultWright = 0;

        for (int i = 0; i < numberCount; i++) {
            number[i] = Integer.parseInt(scan.nextLine());
        }

        for (int i = 0; i < numberCount / 2; i++) {
            resultLeft += number[i];
        }
        for (int i = numberCount - 1; i >= numberCount / 2; i--) {
            resultWright += number[i];
        }
        if (resultLeft == resultWright) System.out.println(" Yes, sum = " + resultWright);
        if (resultLeft != resultWright) System.out.println(" No, diff = " + Math.abs(resultLeft - resultWright));

    }


}
