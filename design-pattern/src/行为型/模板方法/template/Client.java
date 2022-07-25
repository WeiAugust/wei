package 行为型.模板方法.template;

/**
 * @ClassName Client
 * @Description TODO
 * @Author wzg
 * @Date 2022/7/23 18:34
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        AbstractTemplate abstractTemplate = new ConcreteTemplate();
        abstractTemplate.templateMethod();
    }
}
