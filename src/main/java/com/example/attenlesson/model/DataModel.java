package com.example.attenlesson.model;

public class DataModel {
    private String contents;
    private String title;

    public DataModel(){}

    public DataModel(String contents, String title){
        this.contents = contents;
        this.title = title;
    }

    public String getLecture() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
