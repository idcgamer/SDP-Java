package K2161350.SDP.restservice;

import java.util.ArrayList;
//THis is the class that acts as a template for the code that is being sent and received from the front end
public class CodeTemplate {
    private String metric = "Cycolomatic";
    private String code;
    private int totalScore;
    private int ifScore = 0;

    public String getMetric() {
        return metric;
    }
    public int getIfScore() {
        return ifScore;
    }
    public void setIfScore(int ifScore) {
        this.ifScore = ifScore;
    }
    private int tryScore = 0;
    public int getTryScore() {
        return tryScore;
    }
    public void setTryScore(int tryScore) {
        this.tryScore = tryScore;
    }
    private int catchScore = 0;
    public int getCatchScore() {
        return catchScore;
    }
    public void setCatchScore(int catchScore) {
        this.catchScore = catchScore;
    }
    private int thenScore = 0;
    public int getThenScore() {
        return thenScore;
    }
    public void setThenScore(int thenScore) {
        this.thenScore = thenScore;
    }
    private int selectScore = 0;
    public int getSelectScore() {
        return selectScore;
    }
    public void setSelectScore(int selectScore) {
        this.selectScore = selectScore;
    }
    private int switchScore = 0;
    public int getSwitchScore() {
        return switchScore;
    }
    public void setSwitchScore(int switchScore) {
        this.switchScore = switchScore;
    }
    private int forScore = 0;
    public int getForScore() {
        return forScore;
    }
    public void setForScore(int forScore) {
        this.forScore = forScore;
    }
    private int doScore = 0;
    public int getDoScore() {
        return doScore;
    }
    public void setDoScore(int doScore) {
        this.doScore = doScore;
    }
    private int whileScore = 0;

    public int getWhileScore() {
        return whileScore;
    }
    public void setWhileScore(int whileScore) {
        this.whileScore = whileScore;
    }
    CodeTemplate(String code){
        this.code = code;
    }
    CodeTemplate(int score){
        this.totalScore = score;
    }
    CodeTemplate(ArrayList<Integer> results,String code){
        this.totalScore = results.get(9);
        this.ifScore = results.get(0);
        this.tryScore = results.get(1);
        this.catchScore = results.get(2);
        this.thenScore = results.get(3);
        this.selectScore = results.get(4);
        this.switchScore = results.get(5);
        this.forScore = results.get(6);
        this.doScore = results.get(7);
        this.whileScore = results.get(8);
        this.code = code;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public int getScore() {
        return totalScore;
    }
    public void setScore(int score) {
        this.totalScore = score;
    }
}
