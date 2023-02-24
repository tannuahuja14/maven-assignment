package com.knoldus;

 class ReverseandLength {
     String emptyString = "";
     char alphabet;
     public void reverseString(String takingInput)
     {
         for(int index=0; index<takingInput.length(); index++)
         {
             alphabet= takingInput.charAt(index);
             emptyString= alphabet+emptyString;
         }
         System.out.println("Reversed word: "+ emptyString);
     }
     //taking input from the user
     public void stringLength(String takingInput)
     {
         int index = 0;
         for(char alphabet: takingInput.toCharArray()){
             index++;
         }
         System.out.println("Length of the given string : "+index);
     }
}
