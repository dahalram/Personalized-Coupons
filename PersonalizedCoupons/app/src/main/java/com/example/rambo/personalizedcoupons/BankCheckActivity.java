package com.example.rambo.personalizedcoupons;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class BankCheckActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_login);

        final ImageButton btBofA = findViewById(R.id.btBofa);
        final ImageButton btWellsFargo = findViewById(R.id.btWellsFargo);

        btBofA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bofaIntent = new Intent(BankCheckActivity.this, BankInfoLoginActivity.class);
                BankCheckActivity.this.startActivity(bofaIntent);
            }
        });
    }
}
