package baiduyun.singleton;

/**
 * 饿汉式 -- 静态块实现
 * 线程安全:构造方法中存在的处理少时时可以的，如果构造方法中存在过多的处理，加载效率较慢
 */
public class SingletonEx2 {

    // 构造函数私有化
    private SingletonEx2() {}

    // 单例的对象
    private static SingletonEx2 instance = null;

    static {
        instance = new SingletonEx2();
    }

}
