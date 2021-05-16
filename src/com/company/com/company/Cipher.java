package com.company;

public class Cipher {
    private char[][] matrix = new char[26][26];
    private char[] alphabet = new char[26];

    public char[][] insertDataToArray() {
        alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        for(int i = 0; i < matrix.length; i++)
        {
            int k = i;

            for(int j = 0 ; j < matrix.length; j++)
            {
                if(alphabet.length <= k)
                {
                    k=0;
                    matrix[i][j] = alphabet[k];
                }
                else
                {
                    matrix[i][j] = alphabet[k];

                }
                k++;
            }
        }
        

        return matrix;
    }

    public String encode(String passwordString, String keywordString) {
        Cipher test = new Cipher();
        char[][] charMatrix = test.insertDataToArray();
        char[] password = passwordString.toCharArray();
        char[] keyword = keywordString.toCharArray();
        char[] filledKeyword = new char[passwordString.length()];
        char[] encoded = new char[password.length];
        int counter = 0;
        for(int i=0; i<passwordString.length(); i++) {
            filledKeyword[i] = keyword[counter];
            counter++;
            if (counter == keyword.length) {
                counter = 0;
            }
        }
        //System.out.println("Length of password: " + passwordString.length());
        System.out.println("Length of filledKeyword: " + filledKeyword.length);
        System.out.println("filled keyword: " + String.valueOf(filledKeyword));

        for (int i=0; i<password.length; i++) {
            for(int j =0; j<charMatrix[0].length; j++) {
                if (charMatrix[0][j] == password[i]) {
                    for (int x=0; x<charMatrix[0].length; x++){
                        if (charMatrix[j][x] == filledKeyword[i]) {
                            encoded[i] = charMatrix[x][0];
                        }
                    }
                }
            }
        }
        return String.valueOf(encoded);
    }

}
