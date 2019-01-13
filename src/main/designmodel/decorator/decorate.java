package main.designmodel.decorator;

/**
 * Created by lilk on 2019/1/7.
 */
public abstract class Decorate extends Person {
    public Person component;

    public void show() {
        if (component != null) {
            component.show();
        }
    }
}
