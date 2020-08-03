package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CreditCard {
    //Finds and returns the last expected digit
    public Integer lastDigit(int[] numbers){

        int sum = 0;
        int temp = 0;

        //Checks if the number is even or odd
        boolean isSecond = false;
        //Array starts so the last digit wont appear
        for (int i = numbers.length - 2 ; i >= 0  ; i--) {
            temp = numbers[i];
            if(isSecond == false){
                temp = (temp * 2);
                //if temp > 9 separetes the integer, ex 16 = 1+6
                if(temp > 9){
                    temp = (temp % 10) + 1;
                }
            }
            //Adds the sum
            sum += temp;
            //Flips
            isSecond = !isSecond;
        }
        return sum * 9 % 10;
    }
    //Returns the string with the card user input
    public String getUserInput(int[] test) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < test.length - 1; i++) {
            stringBuilder.append(test[i]);
        }
        return stringBuilder + " " + test[test.length-1];
    }
    //Checks if the values matches
    public boolean isValid(int provided, int expected){
        if(provided == expected)
            return true;
        else
            return false;
    }
}
