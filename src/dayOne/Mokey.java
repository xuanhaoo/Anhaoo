package dayOne;

/**
 *
 * 猴子偷桃问题
 * @author liangxuanhao
 * @date 2018年04月20日  13:40
 */
public class Mokey {
    public static void main(String[] args) {

        //1.
        //byFor();
        //2.
        byRecure();

    }

    /**
     * 用for循环实现
     */
    public static void byFor() {
        int total = 0; //总数
        int reset = 1; //每天吃的，初始化为第10天剩下的

        for(int day = 9;day > 0;day--) {

            total = (reset + 1) * 2;
            reset = total;
        }

        System.out.println("总计有桃子："+ total + "个");

    }

    /**
     * 使用递归
     */
    public static void byRecure() {

        int day = 9;
        int total = 0;
        int reset = 1;

        while(day-- > 0) {
            total = total_reset(reset);
            reset = total;
        }
        System.out.println("总计有桃子："+ total + "个");
    }

    /**
     * 每天计算后的重置
     * @return
     */
    public static int total_reset(int reset) {
        return (reset + 1) * 2;
    }
}
