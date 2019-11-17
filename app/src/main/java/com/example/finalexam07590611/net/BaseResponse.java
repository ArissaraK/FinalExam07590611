package com.example.finalexam07590611.net;

import com.google.gson.annotations.SerializedName;
public class BaseResponse {

    @SerializedName("error_code")
    public int errorCode;
    @SerializedName("error_message")
    public String errorMessage;

}
