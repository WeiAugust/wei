package 行为型.模板方法.template;

/**
 * @ClassName AbstractTemplate
 * @Description TODO
 * @Author wzg
 * @Date 2022/7/23 18:30
 * @Version 1.0
 **/
public abstract class AbstractTemplate {

    public void templateMethod() {
        preProcess();
        specificMethod();
        postProcess();
    }

    protected abstract void preProcess();

    protected abstract void postProcess();

    private void specificMethod() {
        System.out.println("specific");
    }
}
