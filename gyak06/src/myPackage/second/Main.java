package myPackage.second;
import myPackage.first.Number;

public class Main {
    public static void main(String[] args){
        final Number num = new Number(Math.random());
        int trials = 0;
        double operand;
        do {
            trials++;
            operand = Math.random();

        } while(!num.isCloseTo(operand));
        System.out.println(trials);

        num.setNumber(0.2);
        System.out.println(num.getNumber());

        //num = new Number(2.1);
    }
}
