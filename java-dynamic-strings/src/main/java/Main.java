import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import java.util.ArrayList;

public class FormatSentence {
    public static String formatSentence(ArrayList<String> inputList) {
        //declare variables
        StringBuilder sentenceBuild;
        String commaString;
        String finalSentence = "";
        int startIndex;
        int endIndex;

        //create a comma separated string (loop or call joined method)
        sentenceBuild =  new StringBuilder(String.join(",",inputList));

        startIndex = sentenceBuild.lastIndexOf(",");
        endIndex = startIndex + 1;

        if(startIndex >= 0) {

        }

//        //use insert to add "end"
//        sentenceBuild.insert(sentenceBuild.lastIndexOf(",")+1," and");
//        int startIndex = sentenceBuild.lastIndexOf(",");
//        int endIndex = startIndex + 1;
//        if(inputList.size() == 2){
//            sentenceBuild.replace(startIndex,endIndex, " and ");
//        }
//       else if(inputList.size()>2){
//           sentenceBuild.insert(sentenceBuild.lastIndexOf(","))
//
//        }


        //convert the string
        finalSentence = sentenceBuild.toString();
        return finalSentence;

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
