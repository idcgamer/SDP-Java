package K2161350.SDP.restservice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

/**
 *
 * @author mosye
 */
//This class is responsible for finding the halstead complexity of the code
public class SDPHC {

    private static List<String> operators;
    private static List<String> opand;
    private static Set<String> unique_operators;
    private static Set<String> unique_operands;
    private static String language;

    public static void setLanguage(String lang) {
        language = lang;
    }

    public static ArrayList<Double> CodeForFindingScore(String hcCode) {
        setLanguage(LanguageDetection.detectLanguage(hcCode));
        System.out.println(LanguageDetection.detectLanguage(hcCode));
        ArrayList<Double> hcscores = new ArrayList<>();

        if (language.equals("Java")) {
            operators = Arrays.asList(
                "byte", "short", "int", "long", "float", "double", "char", "boolean",
                "+", "-", "*", "/", "%", "=", "+=", "-=", "*=", "/=", "%=",
                "++", "--", "==", "!=", ">", "<", ">=", "<=", "&&", "||", "!",
                "&", "|", "^", "~", "<<", ">>", ">>>", "?", ":", "::", "->",
                "new", "instanceof", "if", "for", "while", "do", "switch", "case",
                "default", "(","[]","{",".","return","length",",",";","import","package","class","interface"
            );

        } else if (language.equals("Python")) {
            operators = Arrays.asList(
                "+", "-", "*", "/", "%", "=", "+=", "-=", "*=", "/=", "%=",
                "==", "!=", ">", "<", ">=", "<=", "and", "or", "not", "&", "|",
                "^", "~", "<<", ">>", "if", "for", "while", "try", "except",
                "with", "def", "class", "lambda", "is", "in", "from", "import",
                "as", "pass", "break", "continue", "return", "yield", "raise",
                "del", "global", "nonlocal", "assert","int", "float", "str", "bool", "list", "dict", "set", "tuple",
                "None", "True", "False","(","[","{",":",";","return","print","input","range","len","sorted","abs","sum","max","min","map","filter","reduce","lambda","def","class","import",".",","
            );

        }

        List<String> words = Arrays.asList(hcCode.split("[\\s\\p{Punct}]+"));
        List<String> punctuationStrings = new ArrayList<>();
        for (String word : hcCode.split("[a-zA-Z0-9\\s]+")) {
            if (word.contains(")")) {
                List<String> tempWord = new ArrayList<>();
                for(String letter : word.split("")){
                    if(!letter.equals(")")||letter.equals("}")||letter.equals("]")){
                        tempWord.add(letter);
                    }
                    if(letter.equals("\\}")){
                        System.out.println("Found }");
                    }
                }
                if (tempWord.size() > 0) {
                    punctuationStrings.add(String.join("", tempWord));
                }
            }
            else{
                punctuationStrings.add(word);
            }
        }
        List<String> totaList = new ArrayList<>();

        for (String word : punctuationStrings) {
            if (!word.equals(")") || word.equals("}") || word.equals("]") || word.equals("\"") || word.equals("\'") || word.equals(" ") || word.equals("\n") || word.equals("\t") || word.equals("\r") || word.equals("")) {
                totaList.add(word);
            }
        }

        totaList.addAll(words);

        int operator_count = 0;
        int operand_count = 0;
        unique_operators = new HashSet<>();
        unique_operands = new HashSet<>();

        System.out.println(totaList);

        for (String word : totaList) {
            if (operators.contains(word)) {
                operator_count++;
                unique_operators.add(word);
                System.out.println("Operator: " + word);
            } else {
                operand_count++;
                unique_operands.add(word);

                System.out.println("Operand: " + word);
            }
        }

        double n1 = unique_operators.size();
        double n2 = unique_operands.size();
        double N1 = operator_count;
        double N2 = operand_count;

        System.out.println("n1: " + n1);
        System.out.println("N1: " + N1);
        System.out.println("n2: " + n2);
        System.out.println("N2: " + N2);

        double programLength = (N1 + N2);
        hcscores.add(programLength);

        double sizeOfVocab = (n1 + n2);
        hcscores.add(sizeOfVocab);

        double programVolume = (programLength * (Math.log(sizeOfVocab)));
        hcscores.add(programVolume);

        double difficulty = 1;
        try {
            difficulty = ((n1 / 2) * (N2 / n2));
        } catch (Exception e) {
            System.out.println("Math Error with diffuculty /0");
        }
        hcscores.add(difficulty);

        double progLevel = 0;
        try {
            progLevel = (n1 / n2);
        } catch (Exception e) {
            System.out.println("Math Error progLevel /0");
        }
        System.out.println(n1) ;  
        System.out.println(n2) ;
        System.out.println("progLevel: " + n1/n2);
        hcscores.add(progLevel);

        double effort = (programVolume * difficulty);
        hcscores.add(effort);

        double timeToImplem = (effort / 18);
        hcscores.add(timeToImplem);

        double bugs = (programVolume / 3000);
        hcscores.add(bugs);

        System.out.println("ohhh");
        System.out.println(hcscores);

        return hcscores;
    }
}
