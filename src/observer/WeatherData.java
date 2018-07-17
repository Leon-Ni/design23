package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 定义被观察者，实现了Subject接口，对Subject接口的三个方法进行了具体实现，
 * 同时有一个List集合，用以保存注册的观察者，等需要通知观察者时，遍历该集合即可
 */
public class WeatherData implements Subject {

	private List<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData(){
		observers = new ArrayList<>();
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		//更新
		notifyOberver();
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		int i = observers.indexOf(observer);
		if (i >= 0) {
			observers.remove(i);
		}
	}

	@Override
	public void notifyOberver() {
		for (Observer o : observers) {
			o.update(temperature, humidity, pressure);
		}
	}
}
