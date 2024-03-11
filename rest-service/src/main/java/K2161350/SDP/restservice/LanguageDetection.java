package K2161350.SDP.restservice;

import java.util.Arrays;
import java.util.List;
//This class is responsible for detecting the language of the code
public class LanguageDetection {
    private static final List<String> JAVA_KEYWORDS = Arrays.asList("abstract", "assert", "boolean",
            "break", "byte", "case", "catch", "char", "class", "const",
            "continue", "default", "do", "double", "else", "enum",
            "extends", "final", "finally", "float", "for", "goto",
            "if", "implements", "import", "instanceof", "int",
            "interface", "long", "native", "new", "package", "private",
            "protected", "public", "return", "short", "static",
            "strictfp", "super", "switch", "synchronized", "this",
            "throw", "throws", "transient", "try", "void", "volatile", "while", "{", "}");

    private static final List<String> PYTHON_KEYWORDS = Arrays.asList("and", "as", "assert", "break", "class", "continue",
            "def", "del", "elif", "else", "except", "exec", "finally",
            "for", "from", "global", "if", "import", "in", "is", "lambda",
            "not", "or", "pass", "print", "raise", "return", "try",
            "while", "with", "yield", ":");

    public static String detectLanguage(String code){
        int javaCount = 0;
        int pythonCount = 0;

        for (String keyword : JAVA_KEYWORDS) {
            if (code.contains(keyword)) {
                javaCount++;
            }
        }

        for (String keyword : PYTHON_KEYWORDS) {
            if (code.contains(keyword)) {
                pythonCount++;
            }
        }
        System.out.println("Java count: " + javaCount);
        System.out.println("Python count: " + pythonCount);

        if (javaCount > pythonCount) {
            return "Java";
        } else if (pythonCount > javaCount) {
            return "Python";
        } else {
            return "Unknown";
        }
    }
}