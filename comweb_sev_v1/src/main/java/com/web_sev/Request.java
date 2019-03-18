package com.web_sev;

public class Request {

    private int id;
    private String text;

    public Request(){

    }

    public Request(int id, String text){
        this.id = id;
        this.text = text;
    }
    public int getId() {return this.id;}
    public String getText() {return this.text;}
    public void setId(int id) {this.id = id;}
    public void setId(String text) {this.text = text;}


}
