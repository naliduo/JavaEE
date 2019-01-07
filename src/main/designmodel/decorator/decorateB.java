package main.designmodel.decorator;

/**
 * Created by lilk on 2019/1/7.
 */
public class decorateB extends decorate {

    public decorateB(person componet){
        this.component = componet;
    }

    @Override
    public void show() {
        System.out.print("装饰二");
        super.show();
    }
}
