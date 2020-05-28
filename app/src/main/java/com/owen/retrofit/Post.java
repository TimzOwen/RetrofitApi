package com.owen.retrofit;

import com.google.gson.annotations.SerializedName;

public class Post {
    private int userID;
    private int id;
    private String Title;
    @SerializedName("body")
    private String text;

    public int getUserID() {
        return userID;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return Title;
    }

    public String getText() {
        return text;
    }
}
