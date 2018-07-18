package observer;
/**
 * 具体观察者角色：
 * 实现抽象观察者角色所需要的更新接口，一边使本身的状态与制图的状态相协调。
 */
public class StatisticsDisplay implements Observer {

	public StatisticsDisplay(Subject subject) {
		subject.registerObserver(this);
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		System.out.println("StatisticsDisplay.update: " + temperature + " " + humidity + " " + pressure);
	}
}
