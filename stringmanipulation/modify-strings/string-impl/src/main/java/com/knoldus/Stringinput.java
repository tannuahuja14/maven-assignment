package com.knoldus;
import java.io.IOException;
import java.util.Scanner;

import java.io.IOException;

public class Stringinput {
    public static void main(String args[])
        //getting the input from the user
    throws IOException
    {
        Scanner readingInput = new Scanner(System.in);
        String takingInput = readingInput.nextLine();

        ReverseandLength stringObject = new ReverseandLength();
        stringObject.reverseString(takingInput);
        stringObject.stringLength(takingInput);
    }
}
