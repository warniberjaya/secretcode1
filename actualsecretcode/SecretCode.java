//DISCLAIMER SILA BACA COMMENT-COMMENT TERSEBUT
//STILL ADA ERROR (OUT KELUAR 2 IF MASUK KAN 2 INPUT)(PANDAI2 LAH TRY TENGOK ERROR CODE INI)
// SAYA X TAHU WHY GUNA CAPSLOCK
// SELAMAT MENGCODING
// HARAP CODE TOK DAPAT MEMBANTU
// STILL GUNA CAPSLOCK
// OH YA
// IF CODE TOK DI GUNAKAN UNTUK FINAL. JAGA LUPA PADAM COMMENT DI ATAS INI
// SEKIAN TERIMA KASIH :) 

import javax.crypto.SecretKeyFactory;
import java.security.PublicKey;
import java.util.Scanner;


public class SecretCode{
    private static String inString;
    private int stringLen;
    private String outString;

    public SecretCode() {
        this. inString = inString;
        this. stringLen = stringLen;
        this. outString = outString;

    }

    public SecretCode(String inString){
    }


    public String setInString(String inString) {
        SecretCode.inString = inString;
        return inString;
    }

    public void inString(){
    }

    //get string length input from the user
    public int getStringLen(String inString) {
        char phrase[] = inString.toCharArray();
        inString = "";

        int character = 0;
        for (int i = 0; i < phrase.length; i++) {
            if (phrase[i] != ' ') {
                character++;// the string length exclude the space between character.
                inString += phrase[i];// print out the character excluding the spaces.
            }
        }

            System.out.println("The integer number is: " + character);// the output of the integer
            System.out.println("Your code is: " + inString);// output of the string
        //both output is excluding the space
            return stringLen;

    }

    public void checkStringValidity(String inString){

        boolean codevalid = true;//boolean opeartion
        Scanner input = new Scanner(System.in);// get input from user
        while (!inString.matches("[a-zA-Z + ]+")) {
            System.out.println("Please re-enter your code");
            inString = input.nextLine();// if the input is not a alphabet, then the loop will continue
        }
        if (codevalid) {
            getStringLen(inString);// if the input alphabet. then it will go to getStringlen method
        }
    }

    public void shiftChar(String inString , int StringLen){

    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your code: ");
        String inString = input.nextLine();//input from user
        SecretCode inptcode = new SecretCode();
        SecretCode getlen = new SecretCode();
        SecretCode validate = new SecretCode();
        inptcode.setInString(inString);// input from user go to setInString
        validate.checkStringValidity(inString);// input from user go to checkvalidty to validate the input
        getlen.getStringLen(inString);// input go to getStringLen to get the number of Integer in the string
    }
}
