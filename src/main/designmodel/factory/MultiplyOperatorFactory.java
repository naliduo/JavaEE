package main.designmodel.factory;

/**
 * Created by lilk on 2019/1/13.
 */
public class MultiplyOperatorFactory implements IOperatorFactory {
    @Override
    public Operator getOperator() {
        return new MultiplyOperator();
    }
}
