package main.designmodel.decorator;

/**
 * Created by lilk on 2019/1/7.
 */
public class DecorateC extends Decorate {

    public DecorateC(Person componet){
        this.component = componet;
    }

    @Override
    public void show() {
        System.out.print("装饰三");
        super.show();
    }
}
