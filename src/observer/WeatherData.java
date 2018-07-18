package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 定义被观察者，实现了Subject接口，对Subject接口的三个方法进行了具体实现，
 * 同时有一个List集合，用以保存注册的观察者，等需要通知观察者时，遍历该集合即可
 *
 *
 * 具体被观察者角色：
 * 也就是一个具体的主题，在集体主题的内部状态改变时，所有登记过的观察者发出通知。
 */
public class WeatherData implements Subject {

	private List<Observer> observers; //
	//传递的参数
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData() {
		observers = new ArrayList<>();
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		//通知所有订阅的观察者
		notifyObserver();
	}

	//订阅
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	//移除所有的观察者
	@Override
	public void removeObserver(Observer observer) {
		int i = observers.indexOf(observer);
		if (i >= 0) {
			observers.remove(i);
		}
	}

	//通知所有订阅的观察者
	@Override
	public void notifyObserver() {
		for (Observer o : observers) {
			o.update(temperature, humidity, pressure);
		}
	}
}
