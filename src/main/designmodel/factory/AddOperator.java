package main.designmodel.factory;

/**
 * Created by lilk on 2019/1/13.
 */
public class AddOperator extends Operator {
    @Override
    public double getResult() {
        return super.a + super.b;
    }
}
