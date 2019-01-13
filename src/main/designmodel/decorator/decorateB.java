package main.designmodel.decorator;

/**
 * Created by lilk on 2019/1/7.
 */
public class DecorateB extends Decorate {

    public DecorateB(Person componet){
        this.component = componet;
    }

    @Override
    public void show() {
        System.out.print("装饰二");
        super.show();
    }
}
