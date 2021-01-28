package learn.designModel.guangchazhe;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: liangxuanhao
 * @Description:
 * @Date: 2020年05月17日 17:46
 */
public abstract class Attentions {

    protected List<Observer> observers = new ArrayList<>();

    public void add(Observer observer) {
        this.observers.add(observer);
    }

    public void remove(Observer observer) {
        this.observers.remove(observer);
    }

    public abstract void notifyObservers();
}
