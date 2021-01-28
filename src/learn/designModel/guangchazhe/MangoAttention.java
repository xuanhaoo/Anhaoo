package learn.designModel.guangchazhe;

/**
 * @Author: liangxuanhao
 * @Description:
 * @Date: 2020年05月17日 17:51
 */
public class MangoAttention extends Attentions{
    @Override
    public void notifyObservers() {
        for (Observer obs : observers) {
            obs.update();
        }
    }

    public void perform() {
        this.notifyObservers();
    }
}
