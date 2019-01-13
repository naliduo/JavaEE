package main.designmodel.decorator;

/**
 * Created by lilk on 2019/1/7.
 */
public class DecorateA extends Decorate {

    public DecorateA(Person componet){
        this.component = componet;
    }

    @Override
    public void show() {
        System.out.print("装饰一");
        super.show();
    }
}
