package Výuka;

import java.util.Arrays;

public class ParseSimple {
    public static void main(String[] args) {

        String data = "This is a number:3";

        //data.substring(), rozdělit pomocé substring
        String[]tokens = data.split(":");
        System.out.println("Tokens:" + Arrays.toString(tokens));

        int parsedNumber = Integer.parseInt(tokens[1]);
        System.out.println(parsedNumber * 2);

    }
}
