package company.youzan;

import java.util.Arrays;
import java.util.Scanner;

public class Youzan303 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        String tmpStr = str.substring(1, str.length() - 1);
        String[] strArr = tmpStr.split(",");
        int[] intArr = new int[strArr.length];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        int result = threeMax(intArr);
        System.out.println(result);

    }

    private static int threeMax(int[] intArr) {

        Arrays.sort(intArr);
        int count = 1;
        int threeNum = 0;
        for (int i = 0; i < intArr.length;i++) {
            for (int j = i+1;j < intArr.length;j++) {
                if (intArr[i] <= intArr[j]) {
                    count++;
                    if (count == 3) {
                        threeNum = intArr[j];
                        break;
                    }
                    continue;
                }
            }
        }
        return threeNum;
    }
}
