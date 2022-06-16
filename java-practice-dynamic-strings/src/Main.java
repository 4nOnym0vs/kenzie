import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    //search and replace String
    public static String searchAndReplace(String inputStr, String searchStr, String replaceStr) {
        //declare variables
        StringBuilder inputStringBuild = new StringBuilder(inputStr);
        String finalStr = "";
        int startIndex;
        int endIndex;

        //find indexes for replace
        startIndex = inputStringBuild.indexOf(searchStr);
        endIndex = startIndex + searchStr.length();

        //call replace
        inputStringBuild.replace(startIndex, endIndex, replaceStr);

        //convert StringBuilder to String
        finalStr = inputStringBuild.toString();


        return finalStr;
    }

    public static void main(String[] args) {

        String inputStr = "As you want!";
        String search ="want";
        String replace = "wish";
        searchAndReplace(inputStr, search, replace);

        System.out.println(searchAndReplace(inputStr, search, replace));


        //declare variables
        StringBuilder tempString = new StringBuilder();
        StringBuilder pirateString = new StringBuilder("pirate Robert");

        String firstWord = "Coffee";

        tempString.append(firstWord)
                .append(" , ")
                  .append(" Tea ")
                  .append(" , ")
                  .append("Diet Coke");

        //tempString.insert("My drinks of choice");

        tempString.delete(tempString.length()-11, tempString.length());

        System.out.println(tempString);



    }
}
