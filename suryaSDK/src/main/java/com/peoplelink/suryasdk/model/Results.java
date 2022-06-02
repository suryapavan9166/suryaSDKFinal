package com.peoplelink.suryasdk.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Results {


    @SerializedName("count")
    public Integer count;
    @SerializedName("entries")
    public List<Entry> entries = null;

    public class Entry {

        @SerializedName("API")
        public String API;
        @SerializedName("Auth")
        public String Auth;
        @SerializedName("Category")
        public String Category;
        @SerializedName("Cors")
        public String Cors;
        @SerializedName("Description")
        public String Description;
        @SerializedName("HTTPS")
        public Boolean HTTPS;
        @SerializedName("Link")
        public String Link;

    }
}
