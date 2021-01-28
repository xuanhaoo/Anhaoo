package learn.designModel.guangchazhe;

/**
 * @Author: liangxuanhao
 * @Description:
 * @Date: 2020年05月17日 17:53
 */
public class CustomerObserver implements Observer{

    private String name;

    public CustomerObserver(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println(name + "购买芒果！");
    }
}
