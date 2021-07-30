package com.company;

public class Main {

    public static void main(String[] args) {
        String quizText = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";

        char[] quizChar = quizText.toCharArray();
        int numbers = 0;
        int specialChars = 0;
        int letters = 0;
        int spaces = 0;

        for(int i = 0; i < quizText.length(); i++){
            if(Character.isLetter(quizChar[i])){
                letters ++ ;
            }
            else if(Character.isDigit(quizChar[i])){
                numbers ++ ;
            }
            else if(Character.isSpaceChar(quizChar[i])) {
                spaces++;
            }
            else{
                specialChars ++;
            }
        }
        System.out.println("The amount of numbers: " + numbers);
        System.out.println("The amount of special characters: " + specialChars);
        System.out.println("The amount of letters: " + letters);
        System.out.println("The amount of spaces: " + spaces);


        char valueZ = 'Z';
        int asciiValueZ = (int) valueZ;
        System.out.println("ASCII value of Z: " + asciiValueZ);
    }
}
