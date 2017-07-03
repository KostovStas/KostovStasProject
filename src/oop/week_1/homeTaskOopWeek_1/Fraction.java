package oop.week_1.homeTaskOopWeek_1;

import java_base.week_2.day_2.StringMethods;

/**
 * Created by mac on 6/24/17.
 */

public class Fraction {


    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;

    }


    public Fraction sum(Fraction otherFraction) {

        Fraction fraction = new Fraction(numerator, denominator);

        if (this.denominator == otherFraction.denominator) {
            fraction.denominator = otherFraction.denominator;
            fraction.numerator = this.numerator + otherFraction.numerator;
            return fraction;

        }

        fraction.numerator = (this.numerator * otherFraction.denominator) + (otherFraction.numerator * this.denominator);
        fraction.denominator = this.denominator * otherFraction.denominator;

        return fraction;


    }

    // вычитание
    public Fraction vichitanie(Fraction otherFraction) {

        Fraction fraction = new Fraction(numerator, denominator);

        if (this.denominator == otherFraction.denominator) {

            fraction.denominator = otherFraction.denominator;
            fraction.numerator = this.numerator - otherFraction.numerator;
            return fraction;
        }

        fraction.numerator = (this.numerator * otherFraction.denominator) - (this.denominator + otherFraction.numerator);
        fraction.denominator = this.denominator * otherFraction.denominator;

        return fraction;

    }


    // деление

    public Fraction delenie(Fraction otherFraction) {

        Fraction fraction = new Fraction(numerator, denominator);

        fraction.numerator = this.numerator * otherFraction.denominator;
        fraction.denominator = this.denominator * otherFraction.numerator;

        return fraction;

    }


    public Fraction umnogenie(Fraction otherFraction) {

        Fraction fraction = new Fraction(numerator, denominator);

        fraction.numerator = this.numerator * otherFraction.numerator;
        fraction.denominator = this.denominator * otherFraction.denominator;

        return fraction;

    }


    public void printFraction() {

        System.out.println(toString());
    }


    public boolean compareWithAnotherFraction(Fraction otherFraction) {

        if (this.denominator == otherFraction.denominator & this.numerator == otherFraction.numerator) {


            System.out.println("Fractions are equals");
            return false;

        } else if (this.denominator == otherFraction.denominator) {

            if (this.numerator > otherFraction.numerator) {
                return true;

            } else {
                return false;
            }
        }

        this.numerator = this.numerator * otherFraction.denominator;
        this.denominator = this.denominator * otherFraction.denominator;

        otherFraction.numerator = otherFraction.numerator * this.denominator;
        otherFraction.denominator = otherFraction.denominator * this.denominator;

        if (this.numerator > otherFraction.numerator) {
            return true;

        } else {
            return false;
        }


    }

    public String leadToString() {

        String newFractoin = String.valueOf(this.numerator) + String.valueOf(this.denominator);

        return newFractoin;
    }

    @Override
    public String toString() {

        return "(" + this.numerator + "/" + this.denominator + ")";
    }


}
