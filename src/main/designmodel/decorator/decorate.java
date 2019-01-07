package main.designmodel.decorator;

/**
 * Created by lilk on 2019/1/7.
 */
public abstract class decorate extends person {
    public person component;

    public void show() {
        if (component != null) {
            component.show();
        }
    }
}
