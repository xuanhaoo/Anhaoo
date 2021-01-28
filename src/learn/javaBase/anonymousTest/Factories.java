package learn.javaBase.anonymousTest;

/**
 * 匿名类创建工厂
 */
interface Service {
    void methods1();
    void methods2();
}

interface ServiceFactory {
    Service getService();
}

class Implementation1 implements Service {

    @Override
    public void methods1() {
        System.out.println("Implementation1 methods1");
    }

    @Override
    public void methods2() {
        System.out.println("Implementation1 methods2");
    }

    public static ServiceFactory factory = new ServiceFactory() {
        @Override
        public Service getService() {
            return new Implementation1();
        }
    };
}

class Implementation2 implements Service {

    @Override
    public void methods1() {
        System.out.println("Implementation2 methods1");
    }

    @Override
    public void methods2() {
        System.out.println("Implementation2 methods1");
    }

    public static ServiceFactory factory = new ServiceFactory() {
        @Override
        public Service getService() {
            return new Implementation2();
        }
    };
}
public class Factories {

    public static void serviceConsumer(ServiceFactory fact) {
        Service s = fact.getService();
        s.methods1();
        s.methods2();
    }
    public static void main(String[] args) {

        serviceConsumer(Implementation1.factory);
        serviceConsumer(Implementation2.factory);
    }
}
