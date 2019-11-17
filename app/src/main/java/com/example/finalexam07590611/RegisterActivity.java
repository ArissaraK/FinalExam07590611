package com.example.finalexam07590611;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.finalexam07590611.db.LedgerItem;
import com.example.finalexam07590611.db.LedgerRepository;


public class RegisterActivity extends AppCompatActivity {

    private int mLedgerType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

       /* Intent intent = getIntent();
        mLedgerType = intent.getIntExtra("type", 0);

        ActionBar ab = getSupportActionBar();
        if (ab != null) {
            ab.setTitle(mLedgerType == 0 ? "บันทึกรายรับ" : "บันทึกรายจ่าย");
        }
*/

        Button saveButton = findViewById(R.id.register_button);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText fullnameEditText = findViewById(R.id.full_name_edit_text);
                String fullname = fullnameEditText.getText().toString();

                EditText usernameEditText = findViewById(R.id.username_edit_text);
                String username = usernameEditText.getText().toString();

                EditText passwordEditText = findViewById(R.id.password_edit_text);
                String password = passwordEditText.getText().toString();

                LedgerItem item = new LedgerItem(fullname, username, password);

                LedgerRepository repo = new LedgerRepository(RegisterActivity.this);
                repo.insertLedger(item, new LedgerRepository.InsertCallback() {
                    @Override
                    public void onInsertSuccess() {
                        finish();
                    }
                });
            }
        });
    }


}
