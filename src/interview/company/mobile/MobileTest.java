package interview.company.mobile;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: liangxuanhao
 * @Description:
 * @Date: 2020年02月16日 18:28
 */
public class MobileTest {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        System.out.println();
//        int year = scanner.nextInt();
//        int month = scanner.nextInt();
//        int day = scanner.nextInt();
//        fromDay(year, month, day);

        int heapNum = scanner.nextInt();
        int[] nums = new int[heapNum];
        for (int i = 0; i < heapNum; i++) {
            nums[i] = scanner.nextInt();
        }
        int hour = scanner.nextInt();
        eatSpeed(nums, hour);
    }


    public static void fromDay(int year, int month, int day) {

        if (year <= 0 || month <= 0 || day <= 0) {
            return;
        }
        // 定义月份-天数数组
        int[] monthDays=new int[]{31,28,31,30,31,30,31,31,30,31,30,31};

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            monthDays[1] = 29;
        }
        int fromDay = 0;
        for (int i = 0; i < month - 1; i++) {
            fromDay = fromDay + monthDays[i];
        }
        fromDay = fromDay + day;


        System.out.println(fromDay);

    }


//    public static void eatSpeed(int heapNum, int[] nums, int hour, int speed) {
//
//
//
//        if (heapNum <= 0 || hour <= 0) {
//            return;
//        }
////        for (int j = 0; j <) {
////
////        }
//
//
////        for () {
////
////        }
////
//        int totalEat = 0;
//        int leaveNum = 0;
////        speed = nums[0];
//
//        for (int i = 0,j=0; i < heapNum - 1; i++) {
////            if (speed >= (leaveNum + nums[i])) {
////                totalEat += nums[i];
////            }
//            if (leaveNum > 0 && leaveNum <= speed) {
//                totalEat += leaveNum;
//                // 重置
//                leaveNum = 0;
//                break;
//            }
//            if (leaveNum > 0 && leaveNum > speed) {
//                totalEat += speed;
//                leaveNum = leaveNum - speed;
//                break;
//            }
//            if (speed >= nums[i]) {
//                totalEat += nums[i];
//                break;
//            }
//            if (speed < nums[i]) {
//                totalEat += speed;
//                leaveNum = leaveNum + (nums[i] - speed);
//                break;
//            }
//        }
//
//        if (totalEat leaveNum <= speed) {
//            System.out.println(speed);
//        } else {
//            eatSpeed(heapNum, nums, hour, speed--);
//        }
//    }



    public static void eatSpeed(int[] nums, int H) {

        int low = 1;
        // 排序
        Arrays.sort(nums);
        int high = nums[nums.length-1];
        while (low < high) {
            int mid = (low + high) / 2;
            if (speedSet(nums, mid, H)) {
                high = mid;
            } else {
                low = mid + 1 ;
            }
        }

        System.out.println(low);
    }

    public static boolean speedSet(int[] nums, int K ,int H) {
        int eatTime = 0;
        for (int num : nums) {
            eatTime += (num - 1) / K + 1;
        }
        return eatTime <= H;
    }


}
