/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

 package K2161350.SDP.restservice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/**
 *
 * @author mosye
 */
public class CCabstract {
    private static String ifString= "";
    private static String tryString= "";
    private static String catchString= "";
    private static String thenString= "";
    private static String selectString= "";
    private static String switchString= "";
    private static String forString= "";
    private static String doString= "";
    private static String whileString= "";
    private static ArrayList<Integer> scores = new ArrayList<>();
    private static String language = "java";

    public static void setLanguage(String language) {
        CCabstract.language = language;
    }
    public static String getLanguage() {
        return language;
    }

    

    public static ArrayList<Integer> CodeForFindingScore(String code){

        setLanguage(LanguageDetection.detectLanguage(code));

        if (language.equals("java")) {
            ifString = "if";
            tryString = "try";
            catchString = "catch";
            thenString = "then";
            selectString = "select";
            switchString = "switch";
            forString = "for";
            doString = "do";
            whileString = "while";
        } else if (language.equals("python")) {
            ifString = "if";
            tryString = "try";
            catchString = "except";
            thenString = "then";
            selectString = "if";
            switchString = "if";
            forString = "for";
            doString = "while";
            whileString = "while";
        }

        code = code.replaceAll("\\p{Punct}", " ");

        String[] words = code.split(" ");
        Pattern pattern = Pattern.compile("\\s+");
        words = pattern.split(code);

        ArrayList<String> list = new ArrayList<>();
		for (String string : words) {
			list.add(string);
		}
        System.out.println(list);
        
        int totalCount = list.size();
        System.out.println(totalCount);

        int ifcount = Collections.frequency(list, ifString);
        scores.add(ifcount);
        
        int trycount = Collections.frequency(list, tryString);
        scores.add(trycount);
        
        int catchcount = Collections.frequency(list, 
        catchString);
        scores.add(catchcount);
        
        int thencount = Collections.frequency(list, 
        thenString);
        scores.add(thencount);
        
        int selectcount = Collections.frequency(list, selectString
        );
        scores.add(selectcount);
        
        int switchcount = Collections.frequency(list, switchString);
        scores.add(switchcount);
        
        int forcount = Collections.frequency(list, forString);
        scores.add(forcount);
        
        int docount = Collections.frequency(list, doString);
        scores.add(docount);
        
        int whilecount = Collections.frequency(list, whileString);
        scores.add(whilecount);
        
        int ccCalculation = (ifcount+trycount+catchcount+thencount+selectcount+switchcount+forcount+docount+whilecount) + 1;
        scores.add(ccCalculation);

        System.out.println("The total Cyclomatic Complexity value is " + ccCalculation);
        
        return(scores);
    }

}
    