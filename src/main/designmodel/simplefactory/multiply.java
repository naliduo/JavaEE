package main.designmodel.simplefactory;

/**
 * Created by lilk on 2018/12/31.
 */
public class Multiply extends Operator {
    @Override
    public int getResult() {
        return super.a * super.b;
    }
}
