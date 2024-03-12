package com.mycompany.SDP5;

import java.util.Collections;
import java.util.List;

import static jdk.vm.ci.code.CodeUtil.log2;

public class CyclomaticComplexityCalculator {

    public static int calculateCyclomaticComplexity(List<String> codeLines) {

        int complexity = 1;

        int arithAdd = Collections.frequency(codeLines, "+");
        int arithSub = Collections.frequency(codeLines, "-");
        int arithMult = Collections.frequency(codeLines, "*");
        int arithDiv = Collections.frequency(codeLines, "/");
        int arithMod = Collections.frequency(codeLines, "%");

        int assignEqu = Collections.frequency(codeLines, "=");
        int assignAdd = Collections.frequency(codeLines, "+=");
        int assignSub = Collections.frequency(codeLines, "-=");
        int assignMult = Collections.frequency(codeLines, "*=");
        int assignDiv = Collections.frequency(codeLines, "/=");
        int assignMod = Collections.frequency(codeLines, "%=");
        int assignExp = Collections.frequency(codeLines, "^=");

        int relatEqu = Collections.frequency(codeLines, "==");
        int relatNot = Collections.frequency(codeLines, "!=");
        int relatGre = Collections.frequency(codeLines, ">");
        int relatLess = Collections.frequency(codeLines, "<");
        int relatGreEq = Collections.frequency(codeLines, ">=");
        int relatLesEq = Collections.frequency(codeLines, "<=");

        int logAnd = Collections.frequency(codeLines, "&&");
        int logOr = Collections.frequency(codeLines, "||");
        int logNot = Collections.frequency(codeLines, "!");

        int unaIncre = Collections.frequency(codeLines, "++");
        int unaDecre = Collections.frequency(codeLines, "--");
        int unaInver = Collections.frequency(codeLines, "!");

        int bitAnd = Collections.frequency(codeLines, "&");
        int bitOr = Collections.frequency(codeLines, "|");
        int bitXor = Collections.frequency(codeLines, "^");

        int ternCon = Collections.frequency(codeLines, "?");

        int opandByte = Collections.frequency(codeLines, "byte");
        int opandShort = Collections.frequency(codeLines, "short");
        int opandInt = Collections.frequency(codeLines, "int");
        int opandLong = Collections.frequency(codeLines, "long");
        int opandFloat = Collections.frequency(codeLines, "float");
        int opandDoub = Collections.frequency(codeLines, "double");
        int opandChar = Collections.frequency(codeLines, "char");
        int opandBool = Collections.frequency(codeLines, "boolean");

        int n1 = 0;
        int n2 = 0;
        int N1 = (arithAdd + arithSub + arithMult + arithDiv + arithMod + assignEqu
                + assignAdd + assignSub + assignMult + assignDiv + assignMod + assignExp + relatEqu
                + relatNot + relatGre + relatLess + relatGreEq + relatLesEq + logAnd + logOr + logNot
                + unaIncre + unaDecre + unaInver + bitAnd + bitOr + bitXor + ternCon) ;
        int N2 = (opandByte + opandShort + opandInt + opandLong + opandFloat + opandDoub + opandChar + opandBool);

        int programLength = (N1 + N2);
        int sizeOfVocab = (n1 + n2);
        int programVolume = (programLength*log2(sizeOfVocab));
        float difficulty = ((n1/2) * (N2/n2));
        float progLevel = (1/difficulty);
        float effort = (programVolume * difficulty);
        float timeToImplem = (effort/18);
        int bugs = (effort ^ (8) / 3000);


        return complexity;
    }
}
