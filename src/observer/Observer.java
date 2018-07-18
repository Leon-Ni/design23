package observer;

/**
 * 定义一个抽象观察者接口
 * 为所有的具体观察者定义一个接口，在得到主题通知时更新自己。
 *
 * 抽象观察者角色：
 * 为所有的具体观察者定义一个接口，在得到主题通知时更新自己。
 */
public interface Observer {
	void update(float temperature, float humidity, float pressure);
}
