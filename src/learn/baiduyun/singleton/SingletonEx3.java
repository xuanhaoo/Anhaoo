package learn.baiduyun.singleton;

/**
 * 懒汉式 -- 双重加锁机制
 * 线程安全
 */
public class SingletonEx3 {

    // 构造函数私有化
    private SingletonEx3() {}

    /**
     * volatile关键字修饰
     * 在进行24行操作的时候：
     * 1. 分配内存空间；
     * 2. 初始化对象；
     * 3. 对象实例指向分配的内存空间
     */
    private static volatile SingletonEx3 instance = null;

    public static SingletonEx3 getInstance() {
        // 双重校验
        if (instance == null) {
            // 加锁同步
            synchronized (SingletonEx3.class) {
                if (instance == null) {
                    instance = new SingletonEx3(); // 24实例化
                }
            }
        }
        return instance;
    }
}
