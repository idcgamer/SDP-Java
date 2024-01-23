/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sdp;

import java.io.BufferedReader;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        System.out.println("File name is: " + txtfilename);  // Output user input
        
        
        //Finds file via directory and by entered file name
        File file = new File ("/Users/mosye/Downloads/"+ txtfilename + ".txt");
        Scanner scan = new Scanner (file);
        
        //Print whole file content
        while(scan.hasNextLine()){
        System.out.println(scan.nextLine());
        }
        
        String line;
        String delimiter = ",";
        List<List<String>> data = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader (new FileReader(file)))
        {
            while ((line = br.readLine()) != null)
            {
                String[] values = line.split(delimiter);
                data.add(Arrays.asList(values));
            }
        } catch (IOException e){
            System.out.println(e);
        }
        
        for (List<String> row : data){
            System.out.println(row);
        }
        
        System.out.println(data);
        
        String x = "hello";
        if(Arrays.asList(data).contains(x)){
            System.out.println("a");
        }
        
        else {
            System.out.println("b");
        }
    }

}
    