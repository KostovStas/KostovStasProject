package oop.week_1.homeTaskOopWeek_1;


import com.sun.xml.internal.ws.api.ha.StickyFeature;
import sun.tools.tree.ThisExpression;

public class Number {

    private int value;


    public Number(int value) {

        this.value = value;
    }


    // сложение
    public Number add(Number otherNumber) {

        return new Number(this.value + otherNumber.value);
    }

    // вычитание
    public Number subtraction(Number otherNumber) {
        return new Number(this.value - otherNumber.value);
    }


    // умножение
    public Number multiplication(Number otherNumber) {

        return new Number(this.value * otherNumber.value);
    }


    //Fourth mothod division деление

    public Number division(Number otherNumber) {

        return new Number(this.value / otherNumber.value);
    }


    //exponentiation возведение в степень

    public Number exponentiation(int power) {


        return new Number((int) Math.pow(this.value, power));


    }


    //factorial calculation

    public Number factorialCalculation() {

        int temp = this.value;

        if (temp == 0 || temp == 1) {

            return new Number(1);

        } else if (temp > 1) {

            int result = 1;

            for (int i = 1; i <= temp; i++)

                result *= i;

            return new Number(result);

        } else {

            System.out.println("Incorrect input ");

            return new Number(temp * 0);
        }

    }


    //calculation of the remainder from division остаток от деления

    public Number remainderOfDivision() {


        this.value = this.value % 10;

        return new Number(this.value);
    }


    public Number comparesToNumber(Number otherNumber) {

        if (this.value > otherNumber.value) {

            System.out.printf("First number is bigger than second ");
            return new Number(this.value);


        } else if (otherNumber.value > this.value) {

            System.out.printf("Second number is bigger than first ");

            return new Number(otherNumber.value);

        } else {

            System.out.println("Numbers are equals ");
            return new Number(otherNumber.value * 0);
        }


    }

    @Override
    public String toString() {

        return "The result is " + value;
    }


}
