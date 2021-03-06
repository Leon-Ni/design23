package observer;
/**
 * 观察者模式
 * 定义对象之间的一对多依赖，当一个对象状态改变时，它的所有依赖都会收到通知并且自动更新状态。
 * 主题（Subject）是被观察的对象，而其所有依赖者（Observer）称为观察者。
 * 主题（Subject）具有注册和移除观察者、并通知所有观察者的功能，主题是通过维护一张观察者列表来实现这些操作的。
 * 观察者（Observer）的注册功能需要调用主题的 registerObserver() 方法。
 */
public class test {
    public static void main(String[] args) {
        //交通信号灯
        WeatherData weatherData = new WeatherData();
        //注册(观察信号灯)
        CurrentConditionsDisplay cd = new CurrentConditionsDisplay(weatherData);
        //注册
        StatisticsDisplay sd = new StatisticsDisplay(weatherData);
        //信号灯变化
        //在主题中回调观察者的方法,执行更新
        weatherData.setMeasurements(0,0,0);
        weatherData.setMeasurements(1,1,1);

    }
}
