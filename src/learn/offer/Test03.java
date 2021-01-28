package learn.offer;

/**
 * @author liangxuanhao
 * @date 2018年07月02日  13:06
 */


public class Test03 {


    public static void main(String[] args) {


        //初始化数组
        int[][] array = {
                {1,2,8,9},
                {2,4,9,12},
                {4,7,10,13}
        };

        System.out.println(find(array, 7));
        System.out.println(find(array, 11));


    }

    /**
     * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
     * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
     * <p/>
     * 规律：首先选取数组中右上角的数字。如果该数字等于要查找的数字，查找过程结束：
     * 如果该数字大于要查找的数字，剔除这个数字所在的列：如果该数字小于要查找的数字，剔除这个数字所在的行。
     * 也就是说如果要查找的数字不在数组的右上角，则每－次都在数组的查找范围中剔除）行或者一列，这样每一步都可以缩小
     * 查找的范围，直到找到要查找的数字，或者查找范围为空。
     *
     * tip：从左下角开始也可以，但是不能从左上角或者右下角开始，因为这样不能剔除行货列来缩小查找范围
     *
     * @param array 待查找的数组
     * @param findNum 要查找的数
     * @return 查找结果，true找到，false没有找到
     */
    public static boolean find(int[][] array, int findNum) {

        if(array == null || array.length < 1 || array[0].length < 1) {
            return false;
        }

        int rows = array.length;        //数组共有多少行
        int cols = array[0].length;     //数组的列数

        int row = 0;        //设定起始行， 从低位往高位
        int col = cols - 1;     //设定开始列，从高位往低位


        while(row >= 0 && row < rows && cols >= 0 && col < cols) {      //条件
            if(array[row][col] == findNum) {        //如果查找到了直接返回，如需要返回下标，直接返回即可
                return true;
            }else if(array[row][col] > findNum) {   //从列开始，最大列值大于需要查找的数，列--
                col--;
            }else {
                row++;
            }

        }

        return false;

    }
}
