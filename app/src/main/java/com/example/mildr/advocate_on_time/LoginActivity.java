package com.example.mildr.advocate_on_time;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.mildr.advocate_on_time.R.id.password;
import static com.example.mildr.advocate_on_time.R.id.username;

public class LoginActivity extends AppCompatActivity {
    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }


    public void loginUser(View view) {



        EditText usernameET = (EditText) findViewById(username);
        EditText passwordET = (EditText) findViewById(password);

        String username = usernameET.getText().toString();
        String password = passwordET.getText().toString();



        if (!(!username.isEmpty() || !password.isEmpty())) {
            Toast.makeText(getApplication(), "De velden zijn niet ingevuld", Toast.LENGTH_SHORT).show();
        } else if (password.equals("m") ) {
                startActivity(new Intent(this, MainActivity.class));
                Toast.makeText(getApplicationContext(), " U bent succesvol ingelogd", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(), "Uw gebruikersnaam of wachtwoord is onjuist.", Toast.LENGTH_SHORT).show();
        }
  
    }

        public void registerUser (View view){
           Button Register = (Button) findViewById(R.id.registerButton);
            Intent intent = new Intent(getApplicationContext(), RegisterActivity.class);
            startActivity(intent);
        }
        }
