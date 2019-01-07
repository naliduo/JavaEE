package main.designmodel.decorator;

/**
 * Created by lilk on 2019/1/7.
 */
public abstract class person {
    public String name;

    public void show() {
        System.out.print("装饰的" + name);
    }
}
