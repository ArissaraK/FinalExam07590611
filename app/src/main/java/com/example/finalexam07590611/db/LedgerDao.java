package com.example.finalexam07590611.db;

import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

public interface LedgerDao {

    @Query("SELECT * FROM register")
    List<LedgerItem> getAll();

    @Insert
    void insert(LedgerItem ledgerItem);
}
