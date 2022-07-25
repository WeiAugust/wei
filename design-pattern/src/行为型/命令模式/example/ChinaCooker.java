package 行为型.命令模式.example;

/**
 * @ClassName ChinaCooker
 * @Description TODO
 * @Author wzg
 * @Date 2022/7/23 18:59
 * @Version 1.0
 **/
public class ChinaCooker implements Cooker {
    @Override
    public void doCook() {
        System.out.println("中式早餐");
    }
}
