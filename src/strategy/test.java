package strategy;

/**
 * 策略模式
 */
public class test {
    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new ConcreteStrategyA());
        context.strategyalgorithm();
        //State(new ConcreteStrategyB()) 对象发生改变,动态的改变算法.
        context.setStrategy(new ConcreteStrategyB());
        context.strategyalgorithm();
    }
}
