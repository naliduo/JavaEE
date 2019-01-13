package main.designmodel.decorator;

/**
 * Created by lilk on 2019/1/7.
 */
public class Client {
    public static void main(String[] args) {
        Boy dd = new Boy("张三");
        DecorateA a = new DecorateA(dd);
        DecorateB b = new DecorateB(a);
        DecorateC c = new DecorateC(b);
        c.show();
    }
}
