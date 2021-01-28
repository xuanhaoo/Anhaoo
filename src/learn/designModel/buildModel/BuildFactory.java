package learn.designModel.buildModel;

/**
 * @Author: liangxuanhao
 * @Description:
 * @Date: 2020年05月10日 18:32
 */
public interface BuildFactory {


    void buildApplePrice(int price);

    void buildOrangePrice(int price);

    void buildTomatoPrice(int price);

    int total();
}
