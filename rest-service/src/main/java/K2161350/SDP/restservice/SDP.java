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

    public static int CodeForFindingScore(String code){

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
        
        int ifcount = Collections.frequency(list, "if");
        System.out.println(ifcount);
        
        int trycount = Collections.frequency(list, "try");
        System.out.println(trycount);
        
        int catchcount = Collections.frequency(list, "catch");
        System.out.println(catchcount);
        
        int thencount = Collections.frequency(list, "then");
        System.out.println(thencount);
        
        int selectcount = Collections.frequency(list, "select");
        System.out.println(selectcount);
        
        int switchcount = Collections.frequency(list, "switch");
        System.out.println(switchcount);
        
        int forcount = Collections.frequency(list, "for");
        System.out.println(forcount);
        
        int docount = Collections.frequency(list, "do");
        System.out.println(docount);
        
        int whilecount = Collections.frequency(list, "while");
        System.out.println(whilecount);
        
        int ccCalculation = (ifcount+trycount+catchcount+thencount+selectcount+switchcount+forcount+docount+whilecount) + 1;
        
        System.out.println("The total Cyclomatic Complexity value is " + ccCalculation);
        
        return(ccCalculation);
    }

}
    