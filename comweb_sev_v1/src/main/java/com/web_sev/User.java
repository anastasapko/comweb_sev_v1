package com.web_sev;

public class User {
    private int id;
    private String username;
    private String password;

    public User(){

    }
    public User(String username, String password){
        this.username = username;
        this.password = password;
    }
    public User(int id, String username, String password){
        this.username = username;
        this.password = password;
        this.id = id;
    }

    public int getId() {return this.id;}
    public String getUsername() {return this.username;}
    public String getPassword() {return this.password;}

    public void setId(int id) {this.id = id;}
    public void setUsername(String username) {this.username = username;}
    public void setPassword(String password) {this.password = password;}


    public String to_string(){
        return getClass().getSimpleName() + "(id: " + getId()
                                          + ", username: "+ getUsername()
                                          + ", password: "+ getPassword()+")";
    }



}
