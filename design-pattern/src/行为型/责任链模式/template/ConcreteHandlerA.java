package 行为型.责任链模式.template;

/**
 * @ClassName ConcreteHandler
 * @Description TODO
 * @Author wzg
 * @Date 2022/7/23 19:04
 * @Version 1.0
 **/
public class ConcreteHandlerA extends Handler {
    @Override
    public void handleRequest(String request) {
        System.out.println("A" + request);
        if (getNext() != null) {
            getNext().handleRequest(request);
        }
    }
}
