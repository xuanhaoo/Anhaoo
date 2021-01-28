package learn.designModel.guangchazhe;

/**
 * @Author: liangxuanhao
 * @Description:
 * @Date: 2020年05月17日 17:54
 */
public class Main {

    public static void main(String[] args) {
        MangoAttention mangoAttention = new MangoAttention();
        mangoAttention.add(new CustomerObserver("uuu"));
        mangoAttention.add(new CustomerObserver("yyy"));
        mangoAttention.add(new CustomerObserver("zzz"));
        mangoAttention.add(new CustomerObserver("ppp"));
        mangoAttention.perform();
    }
}
