package com.example.login_prac2;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextUsername, editTextPassword;
    private Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI elements
        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonLogin = findViewById(R.id.buttonLogin);

        // Set a click listener for the login button
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Retrieve entered username and password
                String username = editTextUsername.getText().toString();
                String password = editTextPassword.getText().toString();

                // Implement authentication logic here
                if (username.equals("vidhi") && password.equals("123")) {
                    // Successful login
                    Toast.makeText(MainActivity.this, "Login successful", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                    intent.putExtra("username", username);
                    //startActivity( new Intent(getApplicationContext(),putExtra("username",editTextUsername.getText().toString());
                    startActivity(intent);
                } else {
                    // Failed login
                    Toast.makeText(MainActivity.this, "Invalid Username or Password", Toast.LENGTH_SHORT).show();
                }
            }
        });
        editTextUsername.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) {
                    if (editTextUsername.getText().toString().equals("")) {
                        editTextUsername.setBackgroundColor(Color.parseColor("#FF0000"));
                    } else {
                        if (editTextUsername.getText().toString().equals("vaidik")) {
                            editTextUsername.setBackgroundColor(Color.parseColor("#008000"));

                        } else {
                            editTextUsername.setBackgroundColor(Color.parseColor("#FF0000"));
                        }
                    }
                }

            }
            });
                editTextPassword.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                    @Override
                    public void onFocusChange(View v, boolean hasFocus) {
                        if (!hasFocus) {
                            if (editTextPassword.getText().toString().equals("")) {
                                editTextPassword.setBackgroundColor(Color.parseColor("#FF0000"));
                            } else {
                                if (editTextPassword.getText().toString().equals("123")) {
                                    editTextPassword.setBackgroundColor(Color.parseColor("#008000"));

                                } else {
                                    editTextPassword.setBackgroundColor(Color.parseColor("#FF0000"));
                                }
                            }
                        }
                    }
                });
            }


}