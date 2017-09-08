package java_oop.week_1.home_work;

/*- создание на основе массива символов
- вывод на экран +
- конкатенация  +
- понижение регистра +
- повышение регистра +
- поиск подстроки  +
- выделение подстроки +
- удаление пробелов +
- метод для сравнения с другой строкой +
*/
public class MyStr {

    private static final int LATIN_CAPITAL_LETTER_A = 65;
    private static final int LATIN_CAPITAL_LETTER_Z = 90;
    private static final int CYRILLIC_CAPITAL_LETTER_A = 1040;
    private static final int CYRILLIC_CAPITAL_LETTER_YA = 1071;
    private static final int SPACE = 32;
    private static final int LATIN_SMALL_LETTER_A = 97;
    private static final int LATIN_SMALL_LETTER_Z = 122;
    private static final int CYRILLIC_SMALL_LETTER_A = 1072;
    private static final int CYRILLIC_SMALL_LETTER_YA = 1103;

    private char[] array;

    public MyStr(char[] array) {
        this.array = array;
    }

    public int getLenght() {
        return array.length;
    }

    public char[] getArray() {
        return array;
    }

    // print MyString
    public void showMyString() {
        for (int i = 0; i < this.array.length; i++) {
            System.out.print(this.array[i]);
        }
    }

    // concat
    public void myConcat(char[] otherArray) {
        int size = this.array.length + otherArray.length;
        char[] concatArray = new char[size];
        for (int i = 0; i < this.array.length; i++) {
            concatArray[i] = this.array[i];
        }
        for (int i = this.array.length; i < concatArray.length; i++) {
            concatArray[i] = otherArray[i - this.array.length];
        }
        array = concatArray;
    }

    // to lower case
    public void myToLowerCase() {
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] >= LATIN_CAPITAL_LETTER_A && this.array[i] <= LATIN_CAPITAL_LETTER_Z ||
                    this.array[i] >= CYRILLIC_CAPITAL_LETTER_A && this.array[i] <= CYRILLIC_CAPITAL_LETTER_YA)
                this.array[i] += SPACE;
        }
    }

    // to upper case
    public void myToUpperCase() {
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] >= LATIN_SMALL_LETTER_A && this.array[i] <= LATIN_SMALL_LETTER_Z ||
                    this.array[i] >= CYRILLIC_SMALL_LETTER_A && this.array[i] <= CYRILLIC_SMALL_LETTER_YA)
                this.array[i] -= SPACE;
        }
    }

    // search sub-string with parametrs MyStr
    public int mySubstring(MyStr substring) {
        char[] charArray = substring.getArray();
        for (int i = 0; i <= this.array.length - charArray.length; i++) {
            if (this.array[i] == charArray[0]) {
                for (int j = 1; j < charArray.length; j++) {
                    if (this.array[i + j] != charArray[j]) {
                        break;
                    }
                    return i;
                }
            }
        }
        return -1;
    }

    // location of sub-string
    public String subStringHighlighting(int startIndex, int endIndex) {
        String tmp = "";
        int size = endIndex - startIndex;
        if (size > 0 && endIndex <= this.array.length) {
            char[] tmpCharArray = new char[size];
            for (int i = startIndex; i < endIndex; i++) {
                tmpCharArray[i - startIndex] = this.array[i];
            }
            tmp = String.valueOf(tmpCharArray);
        } else {
            System.out.println("Some error");
        }
        return tmp;
    }

    // delete spaces
    public void deleteSpaces() {
        int count = 0;
        int index = 0;
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] == ' ') {
                count++;
            }
        }
        char[] newCharArray = new char[this.array.length - count];
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] != ' ') {
                newCharArray[index++] = this.array[i];
            }
        }
        this.array = newCharArray;
    }

    //string comparison
    public boolean myEquals(MyStr someMyStr) {
        char[] someMyStrArray = someMyStr.getArray();
        if (this.array.length == someMyStrArray.length) {
            for (int i = 0; i < this.array.length; i++) {
                if (this.array[i] == someMyStrArray[i]) {
                    return true;
                }
            }
        } else {
            System.out.println("Strings are not equals");
        }
        return false;
    }


}
