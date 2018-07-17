package observer;

public class CurrentConditionsDisplay implements Observer{

	public CurrentConditionsDisplay(Subject subject) {
		subject.registerObserver(this);
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		System.out.println("CurrentConditionsDisplay.update: " + temperature + " " + humidity + " " + pressure);
	}
}
