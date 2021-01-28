package learn.designModel.factoryModel;

/**
 * @Author: liangxuanhao
 * @Description:
 * @Date: 2020年05月10日 17:44
 */
public class OrangeFactory implements FruitFactory{
    @Override
    public void getFruit() {
        System.out.println("I am Orange.");
    }
}
