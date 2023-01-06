/*
This is a Calculator that is used to become a master in math classes

It was created by me, Kenny in 2023. When learning to code in Java.
*/
public class Calculator {
    public Calculator() {

    }



    public int add(int a, int b){
        return a + b;
    }

    public int subtract(int a, int b){
        return a - b;
    }

    public int multiply(int a, int b){
        return a * b;
    }

    public int divide(int a, int b){
        return a / b;
    }

    public int modulo(int a, int b){
        return a % b;
    }

    public static void main(String[] args){
        Calculator myCalculator = new Calculator();

        System.out.println(myCalculator.add(45,11));

        System.out.println(myCalculator.divide(45,11));


        System.out.println(myCalculator.subtract(12,6));

        System.out.println(myCalculator.multiply(12,6));

        System.out.println(myCalculator.modulo(10,3));

    }

}