package main.designmodel.decorator;

/**
 * Created by lilk on 2019/1/7.
 */
public class decorateA extends decorate {

    public decorateA(person componet){
        this.component = componet;
    }

    @Override
    public void show() {
        System.out.print("装饰一");
        super.show();
    }
}
