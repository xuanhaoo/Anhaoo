package dayOne;

/**
 * 兔子算法问题
 * 参考链接： https://blog.csdn.net/l1028386804/article/details/51097928/
 * @author liangxuanhao
 * @date 2018年04月20日  13:53
 */
public class Rabbit {

    public static void main(String[] args) {

        //输出每个月的兔子对数
//        for(int day = 1;day <= 12;day++) {
//            System.out.println("第"+day+"月的兔子对数为："+f(day));
//        }
        long result = f2(12);
        System.out.println(result);
    }

    /**
     * 计算每个月的兔子数量f(x) = f(x-1) + f(x-2)
     * @param x
     * @return
     */
    public static int f(int x) {
        if(x == 1 || x == 2) {
            return 1;
        }else {
            return f(x-1) + f(x -2);
        }

    }


    /**
     * 非递归实现斐波拉切
     * @param num
     * @return
     */
    public static long f2(int num) {

        int result[] = {0, 1, 1};
        if(num < 3) {
            return result[num];
        }

        long indexOne = 1; //前一个n-1
        long indexTwo = 1; //前一个n-2

        long indexResult = 0;
        for(int i = 3; i <= num;i++) {

             indexResult = indexOne + indexTwo;

             indexTwo = indexOne;
             indexOne = indexResult;

        }

        return indexResult;
    }
}
