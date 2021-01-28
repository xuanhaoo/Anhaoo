package learn.designModel.factoryModel;

/**
 * @Author: liangxuanhao
 * @Description:
 * @Date: 2020年05月10日 17:46
 */
public class TomatoFactory implements FruitFactory {
    @Override
    public void getFruit() {
        System.out.println("I am Tomato.");
    }
}
