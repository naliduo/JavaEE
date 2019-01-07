package main.designmodel.decorator;

/**
 * Created by lilk on 2019/1/7.
 */
public class client {
    public static void main(String[] args) {
        boy dd = new boy("张三");
        decorateA a = new decorateA(dd);
        decorateB b = new decorateB(a);
        decorateC c = new decorateC(b);
        c.show();
    }
}
