package com.example.finalexam07590611.net;

import retrofit2.Call;
import retrofit2.http.GET;

public interface WebServices {

    @GET("get_ledger")
    Call<GetLedgerResponse> getLedger(
    );
}
