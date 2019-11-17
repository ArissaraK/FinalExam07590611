package com.example.finalexam07590611.db;

import androidx.room.ColumnInfo;
import androidx.room.Entity;

import com.google.gson.annotations.SerializedName;

@Entity(tableName = "register")
public class LedgerItem {
    
    @ColumnInfo(name = "fullname")
    @SerializedName("fullname")
    public String fullname;

    @ColumnInfo(name = "username")
    @SerializedName("username")
    public String username;

    @ColumnInfo(name = "password")
    @SerializedName("password")
    public String password;

    public LedgerItem(String fullname, String username, String password) {
        this.fullname = fullname;
        this.username = username;
        this.password = password;
    }
}
