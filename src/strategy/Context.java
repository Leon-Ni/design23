package strategy;

/**
 * 使用到该算法族的类
 */
public class Context {
    private Strategy strategy;

    //调用接口中的算法族
    public void strategyalgorithm(){
        if (strategy!=null){
            strategy.algorithm();
        }
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }
}
