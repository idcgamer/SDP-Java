package K2161350.SDP.restservice;

import java.util.ArrayList;

public class HalstedTemplate {
    private String metric = "Halstead";
    private String code;
    private double totalScore;
    private double programLengthScore = 0;

    public String getMetric() {
        return metric;
    }
    
    public double getProgramLengthScore() {
        return programLengthScore;
    }
    public void setProgramLengthScore(double programLengthScore) {
        this.programLengthScore = programLengthScore;
    }
    private double sizeOfVocabScore = 0;
    public double getSizeOfVocabScore() {
        return sizeOfVocabScore;
    }
    public void setSizeOfVocabScore(double sizeOfVocabScore) {
        this.sizeOfVocabScore = sizeOfVocabScore;
    }
    private double programVolumeScore = 0;
    public double getProgramVolumeScore() {
        return programVolumeScore;
    }
    public void setProgramVolumeScore(double programVolumeScore) {
        this.programVolumeScore = programVolumeScore;
    }
    private double difficultyScore = 0;
    public double getDifficultyScore() {
        return difficultyScore;
    }
    public void setDifficultyScore(double difficultyScore) {
        this.difficultyScore = difficultyScore;
    }
    private double progLevelScore = 0;
    public double getProgLevelScore() {
        return progLevelScore;
    }
    public void setProgLevelScore(double progLevelScore) {
        this.progLevelScore = progLevelScore;
    }
    private double effortScore = 0;
    public double getEffortScore() {
        return effortScore;
    }
    public void setEffortScore(double effortScore) {
        this.effortScore = effortScore;
    }
    private double timeToImplemScore = 0;
    public double getTimeToImplemScore() {
        return timeToImplemScore;
    }
    public void setTimeToImplemScore(double timeToImplemScore) {
        this.timeToImplemScore = timeToImplemScore;
    }
    private double bugsScore = 0;
    public double getBugsScore() {
        return bugsScore;
    }
    public void setBugsScore(double bugsScore) {
        this.bugsScore = bugsScore;
    }

    HalstedTemplate(String code){
        this.code = code;
    }
    HalstedTemplate(double hcscore){
        this.totalScore = hcscore;
    }
    HalstedTemplate(ArrayList<Double> results, String code){
        //this.totalScore = results.get(9);
        this.programLengthScore = results.get(0);
        this.sizeOfVocabScore = results.get(1);
        this.programVolumeScore = results.get(2);
        this.difficultyScore = results.get(3);
        this.progLevelScore = results.get(4);
        this.effortScore = results.get(5);
        this.timeToImplemScore = results.get(6);
        this.bugsScore = results.get(7);
        this.code = code;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public double getScore() {
        return totalScore;
    }
    public void setScore(double Score) {
        this.totalScore = Score;
    }
}

