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
public class SDP {

    public static ArrayList<Integer> CodeForFindingScore(String code){

        String[] words = code.split(" ");
        Pattern pattern = Pattern.compile(" ");
        words = pattern.split(code);

        ArrayList<String> list = new ArrayList<>();
		for (String string : words) {
			list.add(string);
		}
        System.out.println(list);
        
        int totalCount = list.size();
        System.out.println(totalCount);

        ArrayList<Integer> scores = new ArrayList<>();

        int ifcount = Collections.frequency(list, "if");
        scores.add(ifcount);
        
        int trycount = Collections.frequency(list, "try");
        scores.add(trycount);
        
        int catchcount = Collections.frequency(list, "catch");
        scores.add(catchcount);
        
        int thencount = Collections.frequency(list, "then");
        scores.add(thencount);
        
        int selectcount = Collections.frequency(list, "select");
        scores.add(selectcount);
        
        int switchcount = Collections.frequency(list, "switch");
        scores.add(switchcount);
        
        int forcount = Collections.frequency(list, "for");
        scores.add(forcount);
        
        int docount = Collections.frequency(list, "do");
        scores.add(docount);
        
        int whilecount = Collections.frequency(list, "while");
        scores.add(whilecount);
        
        int ccCalculation = (ifcount+trycount+catchcount+thencount+selectcount+switchcount+forcount+docount+whilecount) + 1;
        scores.add(ccCalculation);

        System.out.println("The total Cyclomatic Complexity value is " + ccCalculation);
        
        return(scores);
    }

}
    