package main.designmodel.simplefactory;

/**
 * Created by lilk on 2018/12/31.
 */
public class Calculator {
    public static void main(String[] args) {
        Operator operatorPlus = OperatorFactory.getOperator("+");
        operatorPlus.a = 10;
        operatorPlus.b = 20;
        System.out.println(operatorPlus.getResult());

        Operator operatorMouse = OperatorFactory.getOperator("-");
        operatorMouse.a = 20;
        operatorMouse.b = 10;
        System.out.println(operatorMouse.getResult());

        Operator operatorMultiply = OperatorFactory.getOperator("*");
        operatorMultiply.a = 20;
        operatorMultiply.b = 10;
        System.out.println(operatorMultiply.getResult());

        Operator operatorDivide = OperatorFactory.getOperator("/");
        operatorDivide.a = 20;
        operatorDivide.b = 10;
        System.out.println(operatorDivide.getResult());


    }
}
