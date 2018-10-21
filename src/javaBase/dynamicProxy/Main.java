package javaBase.dynamicProxy;

import java.lang.reflect.Proxy;

/**
 * @author liangxuanhao
 * @date 2018年05月24日  23:40
 */
public class Main {

    public static void main(String[] args) {

        /**
         * 静态代理
         */
//        Java3y java3y = new Java3y();
//        Programmer programmer = new ProgrammerBigV(java3y);
//        programmer.conding();

        /**
         * 动态代理
         */
        Java3y java3y1 = new Java3y(); //水军~~~
        Programmer programmer = (Programmer) Proxy.newProxyInstance(java3y1.getClass().getClassLoader(), java3y1.getClass().getInterfaces(), (proxy, method, args1) -> {

            if(method.getName().equals("conding")) {
                method.invoke(java3y1, args1);
                System.out.println("我是水军，我来了");
            }else {
                return method.invoke(java3y1, args1);
            }
           return null;
        });

        programmer.conding();
    }
}
