package main.designmodel.factory;

/**
 * Created by lilk on 2019/1/13.
 */
public class AddOperatorFactory implements IOperatorFactory {
    @Override
    public Operator getOperator() {
        return new AddOperator();
    }
}
