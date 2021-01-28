package learn.day.BBWebs;

/**
 * @author liangxuanhao
 * @date 2018年06月10日  15:38
 *
 * 递归实现汉诺塔
 */
public class HanluoTa {

    public static void main(String[] args) {

        int n = 64;
        move(n, "x", "y", "z");
    }


    /**
     *
     * 核心思想：假如有64个圆盘：现将63个借助Z移动到Y上，再将第64个圆盘移动到Z上，然后将Y上的63个圆盘借助X移动到Z上；
     *
     * 移动过程：表示从x轴借助y轴移动到z轴
     * @param n 共有的圆盘数（大在下，小的在上）
     * @param x
     * @param y
     * @param z
     */
    public static void move(int n, String x, String y, String z) {

        if(n == 1) {
            System.out.println(x + " -> " + z);
        }else {
            move(n-1, x, z, y);   //将n-1个盘子从x轴借助Z移动到Y上
            System.out.println(x + " -> " + z); //将第n个盘子从x轴移动到Z轴
            move(n-1, y, x, z);  //将n-1个盘子从y轴借助x轴移动到z轴
        }
    }

}
