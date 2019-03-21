package com.example.user.placeapp.POJO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class sPlace {
    @SerializedName("_id")
    @Expose
    private String _id;
    @SerializedName("__v")
    @Expose
    private int __v;
    @SerializedName("poiId")
    @Expose
    private String poiId;
    @SerializedName("placePicUrl")
    @Expose
    private ArrayList<String> placePicUrl;
    @SerializedName("comments")
    @Expose
    private ArrayList<String> comments;

    public ArrayList<String> getPlacePicUrl() {
        return placePicUrl;
    }

    public String getpoiId() {
        return poiId;
    }
}