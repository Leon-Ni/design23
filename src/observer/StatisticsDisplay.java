package observer;

public class StatisticsDisplay implements Observer {

	public StatisticsDisplay(Subject subject) {
		subject.registerObserver(this);
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		System.out.println("StatisticsDisplay.update: " + temperature + " " + humidity + " " + pressure);
	}
}
