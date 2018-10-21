package offer;

/**
 * @author liangxuanhao
 * @date 2018年07月03日  10:59
 */
public class Test04 {


    public static void main(String[] args) {

        char[] string = new char[50];
        string[0] = ' ';
        string[1] = 'e';
        string[2] = ' ';
        string[3] = ' ';
        string[4] = 'r';
        string[5] = 'e';
        string[6] = ' ';
        string[7] = ' ';
        string[8] = 'a';
        string[9] = ' ';
        string[10] = 'p';
        string[11] = ' ';

        int lengthh = replaceFun(string, 12);
        System.out.println(lengthh);
        System.out.println(new String(string, 0, lengthh));
//        String str = "We are happy!";

//        String str2 = str.replaceAll(" ", "%20");
//        System.out.println(str2);



    }


    /**
     * 请实现一个函数，把字符串中的每个空格替换成"%20"，例如“We are happy.“，则输出”We%20are%20happy.“。
     *
     * @param string     要转换的字符数组
     * @param usedLength 已经字符数组中已经使用的长度
     * @return 转换后使用的字符长度，-1表示处理失败
     */
    public static int replaceFun(char[] string, int usedLength) {

        //判断输入是否合法
        if(string == null || string.length < usedLength) {
            return -1;
        }
        //统计字符数组中空白字符数
        int whiteCount = 0;
        for(int i = 0; i < usedLength; i++) {
            if(string[i] == ' ') {
                whiteCount++;
            }
        }

        if(whiteCount == 0) {  //没有空格则不处理
            return usedLength;
        }
        //计算替换后的字符数组长度
        //usedLength已经包含一个原先空白字符的长度1
        int targetLength = whiteCount * 2 + usedLength;

        int result = targetLength;//保存返回的字符数组长度
        //判断合法
        if(targetLength > string.length) {
            return -1;
        }

        //从后往前找:数组最高位-1
        usedLength--;
        targetLength--;
        while(usedLength >= 0 && targetLength > usedLength) {
            if(string[usedLength] == ' ') {
                string[targetLength--] = '0'; //赋值完进行--操作
                string[targetLength--] = '2';
                string[targetLength--] = '%';
            }else {
                string[targetLength--] = string[usedLength];
            }
            usedLength--;
        }

        return result;
    }
}
