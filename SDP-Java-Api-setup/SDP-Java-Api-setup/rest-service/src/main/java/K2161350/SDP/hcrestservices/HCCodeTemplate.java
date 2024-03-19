package K2161350.SDP.hcrestservices;

import java.util.ArrayList;

//THis is the class that acts as a template for the code that is being sent and received from the front end
public class HCCodeTemplate {
    private String hccode;
    private int totalScore;
    private int programLengthScore = 0;
    public int programLengthScore() {
        return programLengthScore;
    }
    public void programLengthScore(int programLengthScore) {
        this.programLengthScore = programLengthScore;
    }
    private int sizeOfVocabScore = 0;
    public int sizeOfVocabScore() {
        return sizeOfVocabScore;
    }
    public void sizeOfVocabScore(int sizeOfVocabScore) {
        this.sizeOfVocabScore = sizeOfVocabScore;
    }
    private int programVolumeScore = 0;
    public int programVolumeScore() {
        return programVolumeScore;
    }
    public void programVolumeScore(int programVolumeScore) {
        this.programVolumeScore = programVolumeScore;
    }
    private int difficultyScore = 0;
    public int difficultyScore() {
        return difficultyScore;
    }
    public void difficultyScore(int difficultyScore) {
        this.difficultyScore = difficultyScore;
    }
    private int progLevelScore = 0;
    public int progLevelScore() {
        return progLevelScore;
    }
    public void progLevelScore(int progLevelScore) {
        this.progLevelScore = progLevelScore;
    }
    private int effortScore = 0;
    public int effortScore() {
        return effortScore;
    }
    public void effortScore(int effortScore) {
        this.effortScore = effortScore;
    }
    private int timeToImplemScore = 0;
    public int timeToImplemScore() {
        return timeToImplemScore;
    }
    public void timeToImplemScore(int timeToImplemScore) {
        this.timeToImplemScore = timeToImplemScore;
    }
    private int bugsScore = 0;
    public int bugsScore() {
        return bugsScore;
    }
    public void bugsScore(int bugsScore) {
        this.bugsScore = bugsScore;
    }

    HCCodeTemplate(String hccode){
        this.hccode = hccode;
    }
    HCCodeTemplate(int hcscore){
        this.totalScore = hcscore;
    }
    HCCodeTemplate(ArrayList<Integer> results, String hccode){
        this.totalScore = results.get(9);
        this.programLengthScore = results.get(0);
        this.sizeOfVocabScore = results.get(1);
        this.programVolumeScore = results.get(2);
        this.difficultyScore = results.get(3);
        this.progLevelScore = results.get(4);
        this.effortScore = results.get(5);
        this.timeToImplemScore = results.get(6);
        this.bugsScore = results.get(7);
    }
    public String getHcCode() {
        return hccode;
    }
    public void setHcCode(String hccode) {
        this.hccode = hccode;
    }
    public int getScore() {
        return totalScore;
    }
    public void setScore(int Score) {
        this.totalScore = Score;
    }
}
