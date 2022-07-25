package 行为型.策略模式;

/**
 * @ClassName Context
 * @Description TODO
 * @Author wzg
 * @Date 2022/7/23 18:39
 * @Version 1.0
 **/
public class Context {
    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void strategyMethod() {
        strategy.strategyMethod();
    }
}
