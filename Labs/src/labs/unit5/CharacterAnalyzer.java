//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
package labs.unit5;
import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer {
    private char theChar;
    public CharacterAnalyzer() {
        theChar = '0';
    }
    public CharacterAnalyzer(char c) {
    	theChar = c;
    }
    public void setChar(char c) {
    	theChar = c;
    }
    public char getChar() {
        return theChar;
    }
    //65-90
    public boolean isUpper() {
        return (getASCII() > 64 && getASCII() < 91);
    }
    public boolean isLower() {
        return (getASCII() > 96 && getASCII() < 123);
    }
    public boolean isNumber() {
        if (getASCII() > 48 && getASCII() < 58)
            return true;
        return false;
    }
    public int getASCII() {
        return theChar;
    }
    public String toString() {
        return "" + getChar() + " is a" + (isNumber() == true ? " number" : (isLower() == true ? " lowercase charecter." : " uppercase character")) + ". ASCII == " + getASCII() + "\n";
        /*
         * Without the ternary operator
         * if(isNumber() == true) {
         *     " number";
         * }
         * else {
         *     if(isLower() == true) {
         *         " lower";
         *     else {
         *         " upper"
         *     }
         * }
         */
    }
}