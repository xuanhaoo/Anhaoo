package company.youzan;

import java.util.Scanner;

public class Youzan302 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        String tmpStr = str.substring(1, str.length() - 1);
        String[] strArr = tmpStr.split(",");
        int[] intArr = new int[strArr.length];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        boolean result = jumpArr(intArr);
        System.out.println(result);
    }

    private static boolean jumpArr(int[] intArr) {
        boolean result = false;
        for (int j = 0; j < intArr.length; j++) {
            int tmp = intArr[j];
            if (tmp + j >= intArr.length || tmp + j < 0) {
                result = true;
                break;
            }
        }
        return result;
    }
}
