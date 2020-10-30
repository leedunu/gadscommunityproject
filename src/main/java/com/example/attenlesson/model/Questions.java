package com.example.attenlesson.model;

public class Questions {
    private String question;
    private String opt1;
    private String opt2;
    private String opt3;
    private String opt4;
    private String opt5;
    private int answer;
    private int id;

    public Questions(){}

    public Questions(String question, String opt1, String opt2, String opt3, String opt4,String opt5, int answer) {
        this.question = question;
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
        this.opt4 = opt4;
        this.opt5 = opt5;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOpt1() {
        return opt1;
    }

    public void setOpt1(String opt1) {
        this.opt1 = opt1;
    }

    public String getOpt2() {
        return opt2;
    }

    public void setOpt2(String opt2) {
        this.opt2 = opt2;
    }

    public String getOpt3() {
        return opt3;
    }

    public void setOpt3(String opt3) {
        this.opt3 = opt3;
    }

    public String getOpt4() {
        return opt4;
    }

    public void setOpt4(String opt4) {
        this.opt4 = opt4;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
   public void setOpt5(String opt5){
        this.opt5 = opt5;
   }
    public String getOpt5() {
        return opt5;
    }
}
