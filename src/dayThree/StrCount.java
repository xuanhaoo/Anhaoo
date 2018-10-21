package dayThree;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author liangxuanhao
 * @date 2018年06月07日  20:11
 * 统计一个字符串在文件中出现的次数
 */
public class StrCount {


    public static void main(String[] args) throws IOException{

        int count = strCountt("C:\\Users\\Mr.liang\\Desktop\\123.txt", "java");
        System.out.println(count);
    }


    public static int strCountt(String file, String str) throws IOException {

        int count = 0;  //初始化count

        StringBuilder stringBuilder = new StringBuilder(5000);//将整个文件作为字符串存放在程序内

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String s = "";
        while((s = bufferedReader.readLine()) != null ) {
            stringBuilder.append(s);
        }
        //赞
        count = stringBuilder.toString().split(str).length - 1;//以该字符串划分数组，数组的长度即出现的次数
        return count;
    }
}
