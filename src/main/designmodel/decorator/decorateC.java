package main.designmodel.decorator;

/**
 * Created by lilk on 2019/1/7.
 */
public class decorateC extends decorate {

    public decorateC(person componet){
        this.component = componet;
    }

    @Override
    public void show() {
        System.out.print("装饰三");
        super.show();
    }
}
