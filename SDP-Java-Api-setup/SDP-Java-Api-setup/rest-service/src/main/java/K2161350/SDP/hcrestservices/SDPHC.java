package K2161350.SDP.hcrestservices;
import K2161350.SDP.restservice.LanguageDetection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;


/**
 *
 * @author mosye
 */
//This class is responsible for finding the cyclomatic complexity of the code
public class SDPHC {
    private static String arithAddString= "";
    private static String arithSubString= "";
    private static String arithMultString= "";
    private static String arithDivString= "";
    private static String arithModString= "";

    private static String assignEquString= "";
    private static String assignAddString= "";
    private static String assignSubString= "";
    private static String assignMultString= "";
    private static String assignDivString= "";
    private static String assignModString= "";
    private static String assignExpString= "";

    private static String relatEquString= "";
    private static String relatNotString= "";
    private static String relatGreString= "";
    private static String relatLessString= "";
    private static String relatGreEqString= "";
    private static String relatLesEqString= "";

    private static String logAndString= "";
    private static String logOrString= "";
    private static String logNotString= "";

    private static String unaIncreString= "";
    private static String unaDecreString= "";
    private static String unaInverString= "";

    private static String bitAndString= "";
    private static String bitOrString= "";
    private static String bitXorString= "";
    private static String bitNotString= "";
    private static String bitRshiftString= "";
    private static String bitLshiftString= "";

    private static String ternConString= "";

    private static String opandByteString= "";
    private static String opandShortString= "";
    private static String opandIntString= "";
    private static String opandLongString= "";
    private static String opandFloatString= "";
    private static String opandDoubString= "";
    private static String opandCharString= "";
    private static String opandBoolString= "";



    private static ArrayList<Integer> hcscores = new ArrayList<>();
    private static String language = "java";

    public static void setLanguage(String language) {
        SDPHC.language = language;
    }
    public static String getLanguage() {
        return language;
    }



    public static ArrayList<Integer> CodeForFindingScore(String hcCode){

        setLanguage(LanguageDetection.detectLanguage(hcCode));
        System.out.println(LanguageDetection.detectLanguage(hcCode));
        hcscores = new ArrayList<>();



        if (language.equals("Java")) {
            arithAddString= "+";
            arithSubString= "-";
            arithMultString= "*";
            arithDivString= "/";
            arithModString= "%";

            assignEquString= "=";
            assignAddString= "+=";
            assignSubString= "-=";
            assignMultString= "*=";
            assignDivString= "/=";
            assignModString= "%=";
            assignExpString= "^=";

            relatEquString= "==";
            relatNotString= "!=";
            relatGreString= ">";
            relatLessString= "<";
            relatGreEqString= ">=";
            relatLesEqString= "<=";

            logAndString= "&&";
            logOrString= "||";
            logNotString= "?";

            unaIncreString= "++";
            unaDecreString= "--";
            unaInverString= "!";

            bitAndString= "&";
            bitOrString= "|";
            bitXorString= "^";
            bitNotString= "";
            bitRshiftString= "";
            bitLshiftString= "";

            ternConString= "?";

            opandByteString= "byte";
            opandShortString= "short";
            opandIntString= "int";
            opandLongString= "long";
            opandFloatString= "float";
            opandDoubString= "double";
            opandCharString= "char";
            opandBoolString= "boolean";
        } else if (language.equals("Python")) {
            arithAddString= "+";
            arithSubString= "-";
            arithMultString= "*";
            arithDivString= "/";
            arithModString= "%";

            assignEquString= "=";
            assignAddString= "+=";
            assignSubString= "-=";
            assignMultString= "*=";
            assignDivString= "/=";
            assignModString= "%=";
            assignExpString= "**=";

            relatEquString= "==";
            relatNotString= "!=";
            relatGreString= ">";
            relatLessString= "<";
            relatGreEqString= ">=";
            relatLesEqString= "<=";

            logAndString= "and";
            logOrString= "or";
            logNotString= "not";

            unaIncreString= "";
            unaDecreString= "";
            unaInverString= "";

            bitAndString= "&";
            bitOrString= "/";
            bitXorString= "^";
            bitNotString= "~";
            bitRshiftString= ">>";
            bitLshiftString= "<<";

            ternConString= "";

            opandByteString= "";
            opandShortString= "";
            opandIntString= "";
            opandLongString= "";
            opandFloatString= "";
            opandDoubString= "";
            opandCharString= "";
            opandBoolString= "";
        }

        String[] words = hcCode.split(" ");
        Pattern pattern = Pattern.compile("\\s+");
        words = pattern.split(hcCode);

        ArrayList<String> list = new ArrayList<>();
        for (String string : words) {
            list.add(string);
        }
        System.out.println(list);

        int totalCount = list.size();
        System.out.println(totalCount);

        int arithAddcount = Collections.frequency(list, arithAddString);
        int arithSubcount = Collections.frequency(list, arithSubString);
        int arithMultcount = Collections.frequency(list, arithMultString);
        int arithDivcount = Collections.frequency(list, arithDivString);
        int arithModcount = Collections.frequency(list, arithModString);

        int assignEqucount = Collections.frequency(list, assignEquString);
        int assignAddcount = Collections.frequency(list, assignAddString);
        int assignSubcount = Collections.frequency(list, assignSubString);
        int assignMultcount = Collections.frequency(list, assignMultString);
        int assignDivcount = Collections.frequency(list, assignDivString);
        int assignModcount = Collections.frequency(list, assignModString);
        int assignExpcount = Collections.frequency(list, assignExpString);

        int relatEqucount = Collections.frequency(list, relatEquString);
        int relatNotcount = Collections.frequency(list, relatNotString);
        int relatGrecount = Collections.frequency(list, relatGreString);
        int relatLesscount = Collections.frequency(list, relatLessString);
        int relatGreEqcount = Collections.frequency(list, relatGreEqString);
        int relatLesEqcount = Collections.frequency(list, relatLesEqString);

        int logAndcount = Collections.frequency(list, logAndString);
        int logOrcount = Collections.frequency(list, logOrString);
        int logNotcount = Collections.frequency(list, logNotString);

        int unaIncrecount = Collections.frequency(list, unaIncreString);
        int unaDecrecount = Collections.frequency(list, unaDecreString);
        int unaInvercount = Collections.frequency(list, unaInverString);

        int bitAndcount = Collections.frequency(list, bitAndString);
        int bitOrcount = Collections.frequency(list, bitOrString);
        int bitXorcount = Collections.frequency(list, bitXorString);
        int bitNotcount = Collections.frequency(list, bitNotString);
        int bitRshiftcount = Collections.frequency(list, bitRshiftString);
        int bitLshiftcount = Collections.frequency(list, bitLshiftString);
        int ternConcount = Collections.frequency(list, ternConString);

        int opandBytecount = Collections.frequency(list, opandByteString);
        int opandShortcount = Collections.frequency(list, opandShortString);
        int opandIntcount = Collections.frequency(list, opandIntString);
        int opandLongcount = Collections.frequency(list, opandLongString);
        int opandFloatcount = Collections.frequency(list, opandFloatString);
        int opandDoubcount = Collections.frequency(list, opandDoubString);
        int opandCharcount = Collections.frequency(list, opandCharString);
        int opandBoolcount = Collections.frequency(list, opandBoolString);

        int n1 = 0;
        if (arithAddcount > 0){
            int i = n1++;
        }
        if (arithSubcount > 0){
            int i = n1++;
        }
        if (arithMultcount > 0){
            int i = n1++;
        }
        if (arithDivcount > 0){
            int i = n1++;
        }
        if (arithModcount > 0){
            int i = n1++;
        }
        if (assignEqucount > 0){
            int i = n1++;
        }
        if (assignAddcount > 0){
            int i = n1++;
        }
        if (assignSubcount > 0){
            int i = n1++;
        }
        if (assignMultcount > 0){
            int i = n1++;
        }
        if (assignDivcount > 0){
            int i = n1++;
        }
        if (assignModcount > 0){
            int i = n1++;
        }
        if (assignExpcount > 0){
            int i = n1++;
        }
        if (relatEqucount > 0){
            int i = n1++;
        }
        if (relatNotcount > 0){
            int i = n1++;
        }
        if (relatGrecount > 0){
            int i = n1++;
        }
        if (relatLesscount > 0){
            int i = n1++;
        }
        if (relatGreEqcount > 0){
            int i = n1++;
        }
        if (relatLesEqcount > 0){
            int i = n1++;
        }
        if (logAndcount > 0){
            int i = n1++;
        }
        if (logOrcount > 0){
            int i = n1++;
        }
        if (logNotcount > 0){
            int i = n1++;
        }
        if (unaIncrecount > 0){
            int i = n1++;
        }
        if (unaDecrecount > 0){
            int i = n1++;
        }
        if (unaInvercount > 0){
            int i = n1++;
        }
        if (bitAndcount > 0){
            int i = n1++;
        }
        if (bitOrcount > 0){
            int i = n1++;
        }
        if (bitXorcount > 0){
            int i = n1++;
        }
        if (ternConcount > 0){
            int i = n1++;
        }


        int n2 = 0;
        if (opandBoolcount > 0){
            int j = n2++;
        }
        if (opandBytecount > 0){
            int j = n2++;
        }
        if (opandShortcount > 0){
            int j = n2++;
        }
        if (opandIntcount > 0){
            int j = n2++;
        }
        if (opandLongcount > 0){
            int j = n2++;
        }
        if (opandFloatcount > 0){
            int j = n2++;
        }
        if (opandDoubcount > 0){
            int j = n2++;
        }
        if (opandCharcount > 0){
            int j = n2++;
        }



        int N1 = (arithAddcount + arithSubcount + arithMultcount + arithDivcount + arithModcount + assignEqucount
                + assignAddcount + assignSubcount + assignMultcount + assignDivcount + assignModcount + assignExpcount + relatEqucount
                + relatNotcount + relatGrecount + relatLesscount + relatGreEqcount + relatLesEqcount + logAndcount + logOrcount + logNotcount
                + unaIncrecount + unaDecrecount + unaInvercount + bitAndcount + bitOrcount + bitXorcount + ternConcount) ;
        int N2 = (opandBytecount + opandShortcount + opandIntcount + opandLongcount + opandFloatcount + opandDoubcount + opandCharcount + opandBoolcount);


        int programLength = (N1 + N2);
        hcscores.add(programLength);
        int sizeOfVocab = (n1 + n2);
        hcscores.add(sizeOfVocab);
        int programVolume = (programLength*(sizeOfVocab));
        hcscores.add(programVolume);
        float difficulty = ((n1/2) * (N2/n2));
        hcscores.add((int) difficulty);
        float progLevel = (1/difficulty);
        hcscores.add((int) progLevel);
        float effort = (programVolume * difficulty);
        hcscores.add((int) effort);
        float timeToImplem = (effort/18);
        hcscores.add((int) timeToImplem);
        int bugs = (programVolume/3000);
        hcscores.add(bugs);

        System.out.println(hcscores);

        return(hcscores);
    }

}