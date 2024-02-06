/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sdp;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/**
 *
 * @author mosye
 */
public class SDP {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        // Recieve User input for text file name
        Scanner txtfile = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please enter text file name:");
        
        // Converts file name into readable string variable
        var txtfilename = txtfile.nextLine();  // Read user input
        var addedtxt = txtfilename + ".txt";
        System.out.println("File name is: " + addedtxt);  // Output user input
        
        Path fileName = Path.of("/Users/mosye/Downloads/"+ addedtxt);

        String readable = Files.readString(fileName);
        
        String[] words = readable.split(" ");
        Pattern pattern = Pattern.compile(" ");
        words = pattern.split(readable);
        
        ArrayList<String> list = new ArrayList<>();
		for (String string : words) {
			list.add(string);
		}
        System.out.println(list);
        
        int javaCodePublic = Collections.frequency(list, "public");
        int javaCodeStatic = Collections.frequency(list, "static");
        int javaCodeVoid = Collections.frequency(list,"void");
        
        int cplushash = Collections.frequency(list, "#");
        int cplusinclude = Collections.frequency(list, "include");
                
        if (cplushash > 0 && cplusinclude > 0){
            int CtotalCount = list.size();
            int Cifcount = Collections.frequency(list, "if");
            int Ctrycount = Collections.frequency(list, "try");
            int Ccatchcount = Collections.frequency(list, "catch");
            int Cthencount = Collections.frequency(list, "then");
            int Cselectcount = Collections.frequency(list, "select");
            int Cswitchcount = Collections.frequency(list, "switch");
            int Cforcount = Collections.frequency(list, "for");
            int Cdocount = Collections.frequency(list, "do");
            int Cwhilecount = Collections.frequency(list, "while"); 
            
            int CCCCalculation = (Cifcount+Ctrycount+Ccatchcount+Cthencount+Cselectcount+Cswitchcount+Cforcount+Cdocount+Cwhilecount) + 1;
        
            System.out.println("The total Cyclomatic Complexity value is " + CCCCalculation);
        }
        else if (javaCodePublic > 0 && javaCodeStatic > 0 && javaCodeVoid > 0){
            int JtotalCount = list.size();
            int Jifcount = Collections.frequency(list, "if");
            int Jtrycount = Collections.frequency(list, "try");
            int Jcatchcount = Collections.frequency(list, "catch");
            int Jthencount = Collections.frequency(list, "then");
            int Jselectcount = Collections.frequency(list, "select");
            int Jswitchcount = Collections.frequency(list, "switch");
            int Jforcount = Collections.frequency(list, "for");
            int Jdocount = Collections.frequency(list, "do");
            int Jwhilecount = Collections.frequency(list, "while");
            int JCCCalculation = (Jifcount+Jtrycount+Jcatchcount+Jthencount+Jselectcount+Jswitchcount+Jforcount+Jdocount+Jwhilecount) + 1;
        
            System.out.println("The total Cyclomatic Complexity value is " + JCCCalculation);
        }
        else {
            int PtotalCount = list.size();
            int Pifcount = Collections.frequency(list, "if");
            int Pelifcount = Collections.frequency(list, "elif");
            int Ptrycount = Collections.frequency(list, "try");
            int Pcatchcount = Collections.frequency(list, "catch");
            int Pthencount = Collections.frequency(list, "then");
            int Pselectcount = Collections.frequency(list, "select");
            int Pswitchcount = Collections.frequency(list, "switch");
            int Pforcount = Collections.frequency(list, "for");
            int Pdocount = Collections.frequency(list, "do");
            int Pwhilecount = Collections.frequency(list, "while");
            int PCCCalculation = (Pifcount+Pelifcount+Ptrycount+Pcatchcount+Pthencount+Pselectcount+Pswitchcount+Pforcount+Pdocount+Pwhilecount) + 1;
        
            System.out.println("The total Cyclomatic Complexity value is " + PCCCalculation);
        }
        
    }

}
    