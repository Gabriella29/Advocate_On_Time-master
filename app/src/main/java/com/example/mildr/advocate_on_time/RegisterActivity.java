package com.example.mildr.advocate_on_time;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.mildr.advocate_on_time.R.id.Adres;
import static com.example.mildr.advocate_on_time.R.id.ConfirmPassword;
import static com.example.mildr.advocate_on_time.R.id.Email;
import static com.example.mildr.advocate_on_time.R.id.FirstName;
import static com.example.mildr.advocate_on_time.R.id.Gender;
import static com.example.mildr.advocate_on_time.R.id.Kantoor;
import static com.example.mildr.advocate_on_time.R.id.LastName;
import static com.example.mildr.advocate_on_time.R.id.Password;
import static com.example.mildr.advocate_on_time.R.id.Phone;
import static com.example.mildr.advocate_on_time.R.id.password;
import static com.example.mildr.advocate_on_time.R.id.username;

public class RegisterActivity extends AppCompatActivity {

    DatabaseHelper databasehelper = new DatabaseHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


    }

    public void registerUser(View view) {


        EditText usernameET = (EditText) findViewById(R.id.UserName);
        EditText passwordET = (EditText) findViewById(R.id.password);
        EditText confirmPasswordET = (EditText) findViewById(R.id.ConfirmPassword);
        EditText firstnameET = (EditText) findViewById(R.id.FirstName);
        EditText lastnameET = (EditText) findViewById(R.id.LastName);
        EditText emailET = (EditText) findViewById(R.id.Email);
        EditText genderET = (EditText) findViewById(R.id.Gender);
        EditText kantoorET = (EditText) findViewById(R.id.Kantoor);
        EditText adresET = (EditText) findViewById(R.id.Adres);
        EditText phoneET = (EditText) findViewById(R.id.Phone);

        String username = usernameET.getText().toString();
        String password = passwordET.getText().toString();
        String confirmpassword = confirmPasswordET.getText().toString();
        String firstname = firstnameET.getText().toString();
        String lastname = lastnameET.getText().toString();
        String email = emailET.getText().toString();
        String gender = genderET.getText().toString();
        String kantoor = kantoorET.getText().toString();
        String adres = adresET.getText().toString();
        String phone = phoneET.getText().toString();
        String confirmPassword = confirmPasswordET.getText().toString();

        if (!(!username.isEmpty() || !password.isEmpty())) {
            Toast.makeText(getApplication(), "De velden zijn niet ingevuld", Toast.LENGTH_SHORT).show();
            if (!password.equals(confirmPassword)) {
                Toast.makeText(getApplicationContext(), "De wachtwoorden komen niet overeen.", Toast.LENGTH_SHORT).show();
            } else {
                Users user = new Users();
                user.setUserName(username);
                user.setPassword(password);
                user.setConfirmPassword(confirmpassword);
                user.setFirstName(firstname);
                user.setLastName(lastname);
                user.setEmail(email);
                user.setGender(gender);
                user.setKantoor(kantoor);
                user.setAdres(adres);
                user.setPhone(phone);

                databasehelper.insertUser(user);
                databasehelper.close();

            }

        }

    }
}

