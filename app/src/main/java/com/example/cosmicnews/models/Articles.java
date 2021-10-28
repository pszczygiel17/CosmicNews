package com.example.cosmicnews.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class Articles {

    @SerializedName("id")
    @Expose
    private int id;

    @SerializedName("featured")
    @Expose
    private boolean featured;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("url")
    @Expose
    private String url;

    @SerializedName("imageUrl")
    @Expose
    private String imageUrl;

    @SerializedName("newsSite")
    @Expose
    private String newsSite;

    @SerializedName("summary")
    @Expose
    private String summary;

    @SerializedName("publishedAt")
    @Expose
    private String publishedAt;

    @SerializedName("updatedAt")
    @Expose
    private String updatedAt;

    @SerializedName("launches")
    @Expose
    private List<Launches> launches;

    @SerializedName("events")
    @Expose
    private List<Events> events;

    public Articles(){

    }

    public Articles(int id, boolean featured, String title, String url, String imageUrl, String newsSite, String summary, String publishedAt, String updatedAt, List<Launches> launches, List<Events> events) {
        this.id = id;
        this.featured = featured;
        this.title = title;
        this.url = url;
        this.imageUrl = imageUrl;
        this.newsSite = newsSite;
        this.summary = summary;
        this.publishedAt = publishedAt;
        this.updatedAt = updatedAt;
        this.launches = launches;
        this.events = events;
    }


    public int getId() {return  id; }
    public String getTitle() {
        return title;
    }
    public String getUrl() {return  url; }
    public String getImageUrl() {
        return imageUrl;
    }
    public String getSummary() {return summary;}
    public String getPublishedAt() {
        return publishedAt;
    }
}



