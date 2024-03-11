package K2161350.SDP.restservice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LanguageDetectionTest {
    
    @Test
    public void testDetectLanguage_JavaCode() {
        String code = "public class HelloWorld {\n" +
                      "    public static void main(String[] args) {\n" +
                      "        System.out.println(\"Hello, World!\");\n" +
                      "    }\n" +
                      "}";
        String expected = "Java";
        String actual = LanguageDetection.detectLanguage(code);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDetectLanguage_PythonCode() {
        String code = "def hello_world():\n" +
                      "    print('Hello, World!')\n";
        String expected = "Python";
        String actual = LanguageDetection.detectLanguage(code);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDetectLanguage_UnknownCode() {
        String code = "int a = 10;\n" +
                      "String b = \"Hello\";\n";
        String expected = "Unknown";
        String actual = LanguageDetection.detectLanguage(code);
        assertEquals(expected, actual);
    }
}