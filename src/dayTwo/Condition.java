package dayTwo;

import java.util.Scanner;

/**
 * 条件运算符的运用
 * @author liangxuanhao
 * @date 2018年04月24日  11:02
 */
public class Condition {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入一个整数");
//        int n = scanner.nextInt();
//
//        //嵌套条件运算符
//        String s = (n >= 90) ? "A" : ((n < 60) ? "C" : "B");
//
//        System.out.println("该分数的评级是："+ s);

        System.out.println(new Condition().test());


    }

    int test() {


        try{

            return func1();
        }finally {
            return func2();
        }
    }

    int func1() {
        System.out.println("func1()");
        return 1;
    }
    int func2() {
        System.out.println("func2()");
        return 2;
    }





}
