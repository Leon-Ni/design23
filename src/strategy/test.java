package strategy;

/**
 * 策略模式
 */
public class test {
    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new ConcreteStrategyA());
        context.strategyalgorithm();
        //State 对象发生改变
        context.setStrategy(new ConcreteStrategyB());
        context.strategyalgorithm();
    }
}
