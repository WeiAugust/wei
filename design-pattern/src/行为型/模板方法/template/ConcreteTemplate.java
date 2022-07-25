package 行为型.模板方法.template;

/**
 * @ClassName ConcreteTemplate
 * @Description TODO
 * @Author wzg
 * @Date 2022/7/23 18:33
 * @Version 1.0
 **/
public class ConcreteTemplate extends AbstractTemplate {
    @Override
    protected void preProcess() {
        System.out.println("concrete pre process");
    }

    @Override
    protected void postProcess() {
        System.out.println("concrete post process");
    }
}
