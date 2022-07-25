package 行为型.策略模式;

/**
 * @ClassName Client
 * @Description TODO
 * @Author wzg
 * @Date 2022/7/23 18:40
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        Strategy strategy = new ConcreteStrategyA();
        context.setStrategy(strategy);
        context.strategyMethod();
        System.out.println("-------------");
        strategy = new ConcreteStrategyB();
        context.setStrategy(strategy);
        context.strategyMethod();
    }
}
