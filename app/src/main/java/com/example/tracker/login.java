package com.example.tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class login extends AppCompatActivity {
    private FirebaseAuth firebaseAuth;
    private EditText loginId, loginPassword;
    private Button buttonToRegister, login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginId = (EditText) findViewById(R.id.login_id);
        loginPassword = (EditText) findViewById(R.id.login_password);

        buttonToRegister = (Button) findViewById(R.id.button_to_register) ;
        login = (Button) findViewById(R.id.login_button);

        firebaseAuth = FirebaseAuth.getInstance();

        if(firebaseAuth.getCurrentUser() != null){
            Toast.makeText(login.this, "you are already logged in", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(getApplicationContext(),home.class));
            finish();
        }

    }
}