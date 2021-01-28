package learn.baiduyun.singleton;

/**
 * 懒汉式 -- 普通写法
 * 线程不安全
 */
public class SingletonEx1 {

    // 构造函数私有化
    private SingletonEx1() {}

    // 单例的对象
    private static SingletonEx1 instance = null;

    // 实例化
    public static SingletonEx1 getInstance() {
        if (instance == null) {
            instance = new SingletonEx1();
        }
        return instance;
    }
}
