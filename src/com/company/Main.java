package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();

        Main main = new Main();

        String cardNumber = cardNumberInput();

        char[] charArrNum = cardNumber.toCharArray();
        int[] intArrNum = main.convertCharToIntArr(charArrNum);

        int providedValue = main.getProvidedValue(intArrNum);
        int expectedValue = creditCard.lastDigit(intArrNum);

        boolean isValid = creditCard.isValid(providedValue, expectedValue);

        printInfo(intArrNum, isValid, providedValue, expectedValue);
    }
    //Returns the provided value
    public Integer getProvidedValue(int[] intArrNum){
        return intArrNum[intArrNum.length-1];
    }
    //Converts the char array to an integer array
    public int[] convertCharToIntArr(char[] charArrNum){
        int[] intArrNum = new int[charArrNum.length];

        for (int i = 0; i < charArrNum.length; i++) {
            intArrNum[i] = Integer.parseInt("" + charArrNum[i]);
        }
        return intArrNum;
    }
    //User input the card numbers
    public static String cardNumberInput(){
        System.out.print("Enter card number: ");
        Scanner scanner = new Scanner(System.in);
        String cardNumber = scanner.nextLine();
        return cardNumber;
    }
    //Prints out the result
    public static void printInfo(int[] intArrNum, boolean isValid, int providedValue, int expectedValue){
        Main main = new Main();
        CreditCard creditCard = new CreditCard();
        String res = main.resType(isValid);

        System.out.println();
        System.out.println("Input: " + creditCard.getUserInput(intArrNum));
        System.out.println("Provided: " + providedValue);
        System.out.println("Expected: " + expectedValue);
        System.out.println();

        System.out.println("Checksum: " + res);
        System.out.println("Digits: " + intArrNum.length);
    }
    //Checks if the value is true and sends back the enum result string
    public String resType(Boolean isValid){
        String res = " ";
        if(isValid ==  true)
            res = Checksum.Valid.toString();
        else
            res = Checksum.Invalid.toString();
        return res;
    }
}
