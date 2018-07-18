package observer;

/**
 * 定义一个抽象被观察者接口
 * 主题（Subject）具有注册和移除观察者、并通知所有观察者的功能，主题是通过维护一张观察者列表来实现这些操作的。
 *
 *
 * 抽象被观察者角色：
 * 也就是一个抽象主题，它把所有对观察者对象的引用保存在一个集合中，每个主题都可以有任意数量的观察者。
 * 抽象主题提供一个接口，可以增加和删除观察者角色。一般用一个抽象类和接口来实现。
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
