package com.example.finalexam07590611.net;

import com.example.finalexam07590611.db.LedgerItem;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetLedgerResponse extends BaseResponse {

    @SerializedName("data_list")
    public List<LedgerItem> ledgerItemList;

}
