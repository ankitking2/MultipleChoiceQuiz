package com.sample.multiplechoicequiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    Button btnlogin;
    EditText edtuser,edtpass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edtuser = (EditText) findViewById(R.id.edtuser);
        edtpass = (EditText) findViewById(R.id.edtpass);
        btnlogin = (Button) findViewById(R.id.btnlogin);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userid = edtuser.getText().toString();
                String pass = edtpass.getText().toString();
                if (userid.matches("")){
                    edtuser.setError("Please enter username");
                }
                else if (pass.matches("")){
                    edtpass.setError("Please enter password");
                }
                else {
                    Intent intent = new Intent(LoginActivity.this, QuizActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
