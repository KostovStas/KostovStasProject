package java_oop.week_1.home_work;

/*Написать класс строка
        - создание на основе массива символов +
        - вывод на экран +
        - конкатенация +
        - понижение регистра +
        - повышение регистра +
        - поиск подстроки +
        - выделение подстроки +
        - удаление пробелов +
        - метод для сравнения с другой строкой +
        */
public class MyClassString {

    private char[] array;

    public MyClassString(char[] array) {
        this.array = array;
    }

    public int myIndexOf(String someString) {
        String value = new String(this.array);
        int temp = value.indexOf(someString);
        return temp;
    }

    public String deleteSpaces() {
        String myString = new String(this.array);
        String[] array_1 = myString.split(" ");
        String temp = "";
        for (String value : array_1) {
            temp = temp + value;
        }
        return temp;
    }

    public boolean myCompareTo(String anotherString) {
        char[] arrayOfanotherString = anotherString.toCharArray();
        if (arrayOfanotherString.length == this.array.length) {
            for (int i = 0; i < arrayOfanotherString.length; i++) {
                if (arrayOfanotherString[i] == this.array[i]) {
                    return true;
                }
            }
        } else {
            System.out.println("Strings are not equals");
        }
        return false;
    }

    public boolean substringSearch(MyClassString otherString) {
        String firstString = new String(this.array);
        String secondString = new String(otherString.array);
        if (firstString.indexOf(secondString) != -1) {
            return true;
        } else {
            return false;
        }
    }

    public String toUpperCase() {

        String toApperCaseString = new String(this.array);
        toApperCaseString = toApperCaseString.toUpperCase();
        return toApperCaseString;
    }

    public String toLowerCase() {
        String lowerCase = new String(this.array);
        lowerCase = lowerCase.toLowerCase();
        return lowerCase;
    }

    public String createString(char[] array) {
        //String string = new String(array);
        return new String(array);
    }

    public String comcatStrings(MyClassString otherstring) {
        /*String firstString = new String(this.array);
        String secondString = new String(otherstring.array);*/
        return new String(this.array) + new String(otherstring.array);

    }

    public void showMyStrind() {
        String myString = new String(this.array);
        System.out.println(myString);
    }

    @Override
    public String toString() {
        return new String(array);
    }

}
