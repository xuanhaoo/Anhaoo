package baiduyun.singleton;

/**
 * 枚举类实现
 * 线程安全
 */
public class SingletonEx4 {

    // 构造函数私有化
    private SingletonEx4() {
    }

    public static SingletonEx4 getSignleInstance() {
        return SingleInstance.INSTANCE.getInstance();
    }


    private enum SingleInstance {
        INSTANCE;


        private SingletonEx4 singletonEx4;

        // JVM保证这个方法只调用一次：因为枚举本身就是单例的，所以JVM可以保证这个方法只执行一次
        SingleInstance() {
            singletonEx4 = new SingletonEx4();
        }

        public SingletonEx4 getInstance() {
            return singletonEx4;
        }
    }

}
