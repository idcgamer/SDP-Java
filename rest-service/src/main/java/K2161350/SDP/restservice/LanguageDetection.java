package K2161350.SDP.restservice;

import java.util.ArrayList;

public class LanguageDetection {
    public static String detectLanguage(String code){
        if (code.contains("abstract") || code.contains("assert") || code.contains("boolean") || code.contains("break") || code.contains("byte") || code.contains("case") || code.contains("catch") || code.contains("char") || code.contains("class") || code.contains("const") || code.contains("continue") || code.contains("default") || code.contains("do") || code.contains("double") || code.contains("else") || code.contains("enum") || code.contains("extends") || code.contains("final") || code.contains("finally") || code.contains("float") || code.contains("for") || code.contains("goto") || code.contains("if") || code.contains("implements") || code.contains("import") || code.contains("instanceof") || code.contains("int") || code.contains("interface") || code.contains("long") || code.contains("native") || code.contains("new") || code.contains("package") || code.contains("private") || code.contains("protected") || code.contains("public") || code.contains("return") || code.contains("short") || code.contains("static") || code.contains("strictfp") || code.contains("super") || code.contains("switch") || code.contains("synchronized") || code.contains("this") || code.contains("throw") || code.contains("throws") || code.contains("transient") || code.contains("try") || code.contains("void") || code.contains("volatile") || code.contains("while")) {
            return "Java";
        } else if (code.contains("and") || code.contains("as") || code.contains("assert") || code.contains("break") || code.contains("class") || code.contains("continue") || code.contains("def") || code.contains("del") || code.contains("elif") || code.contains("else") || code.contains("except") || code.contains("finally") || code.contains("for") || code.contains("from") || code.contains("global") || code.contains("if") || code.contains("import") || code.contains("in") || code.contains("is") || code.contains("lambda") || code.contains("nonlocal") || code.contains("not") || code.contains("or") || code.contains("pass") || code.contains("raise") || code.contains("return") || code.contains("try") || code.contains("while") || code.contains("with") || code.contains("yield")) {
            return "Python";
        } else {
            return "Unknown";
        }
    }
}