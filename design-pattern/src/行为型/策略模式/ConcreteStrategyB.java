package 行为型.策略模式;

/**
 * @ClassName ConcreteStrategyA
 * @Description TODO
 * @Author wzg
 * @Date 2022/7/23 18:38
 * @Version 1.0
 **/
public class ConcreteStrategyB implements Strategy {

    @Override
    public void strategyMethod() {
        System.out.println("strategy B");
    }
}
