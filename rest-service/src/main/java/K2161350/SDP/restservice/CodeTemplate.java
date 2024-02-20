package K2161350.SDP.restservice;

public class CodeTemplate {
    private String code;
    private int score;

    CodeTemplate(String code){
        this.code = code;
    }
    CodeTemplate(int score){
        this.score = score;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
}
