package offer;

/**
 * @author liangxuanhao
 * @date 2018年07月10日  13:52
 */
public class Test10 {

    public static void main(String[] args) {

        System.out.println(countOne(0B00000000_00000000_00000000_00000000)); // 0
        System.out.println(countOne(0B00000000_00000000_00000000_00000001)); // 1
        System.out.println(countOne(0B11111111_11111111_11111111_11111111)); // -1
        System.out.println(countOne(0B01111111_11111111_11111111_11111111)); // Integer.MAX_VALUE
        System.out.println(countOne(0B10000000_00000000_00000000_00000000));
    }


/**
 * 请实现一个函数， 输入一个整数，输出该数二进制表示中1的个数。
 * 例如把9表示成二进制是1001 ，有2位是1. 因此如果输入9，该出2。
 * 【这种方法的效率更高】
 *
 * @param n 待处理的数字
 * @return 数字中二进制表表的1的数目
*/
    public static int countOne(int n) {

        int count = 0;
        //二进制数字中有多少个1就进行多少次操作
        while(n != 0) {

            count++;
            //从最右边开始，每一次-1操作后&都会使最右的一个1变成0
            /**
             * 比如1100 - 0001 = 1011
             * 1011 & 1100 = 1000，以此
             */

            n = (n - 1) & n;
        }

        return count;

    }
}
