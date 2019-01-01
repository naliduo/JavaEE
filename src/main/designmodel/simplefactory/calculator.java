package main.designmodel.simplefactory;

/**
 * Created by lilk on 2018/12/31.
 */
public class calculator {
    public static void main(String[] args) {
        operator operatorPlus = operatorFactory.getOperator("+");
        operatorPlus.a = 10;
        operatorPlus.b = 20;
        System.out.println(operatorPlus.getResult());

        operator operatorMouse = operatorFactory.getOperator("-");
        operatorMouse.a = 20;
        operatorMouse.b = 10;
        System.out.println(operatorMouse.getResult());

        operator operatorMultiply = operatorFactory.getOperator("*");
        operatorMultiply.a = 20;
        operatorMultiply.b = 10;
        System.out.println(operatorMultiply.getResult());

        operator operatorDivide = operatorFactory.getOperator("/");
        operatorDivide.a = 20;
        operatorDivide.b = 10;
        System.out.println(operatorDivide.getResult());


    }
}
