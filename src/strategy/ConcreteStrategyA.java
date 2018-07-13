package strategy;

public class ConcreteStrategyA implements Strategy {
    @Override
    public void algorithm() {
        System.out.println("策略A");
    }
}
