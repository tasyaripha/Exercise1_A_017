package com.example.exercise1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
    Button btnLogin;
    EditText edEmail, edPassword;
    String nama, password;
    TextInputLayout emailError, passError;
    boolean isEmailValid, isPasswordValid;
    TextView tvRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvRegister = findViewById(R.id.tvRegister);

        //Menghubungkan variabel btnLogin dengan componen button pada layout
        btnLogin = findViewById(R.id.button1);

        //Menghubungkan variabel edEmail dengan componen button pada layout
        edEmail = findViewById(R.id.edEmail);

        //Menghubungkan variabel edPassword dengan componen button pada layout
        edPassword = findViewById(R.id.edPassword);

        //Membuat fungsi onclick pada button btnLogin
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.SetValidation();
            }
        });
        this.tvRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.startActivity(new Intent(MainActivity.this.getApplicationContext(), pendaftaran.class));
            }
        });
    }
//
//    @SuppressLint("WrongConstant")
    private void SetValidation() {
        if (this.edEmail.getText().toString().isEmpty()) {
            this.emailError.setError("Email Tidak Boleh Kosong");
            this.isEmailValid = false;
        } else if (Patterns.EMAIL_ADDRESS.matcher(this.edEmail.getText().toString()).matches()) {
            this.emailError.setError("Harap Masukkan Email Dengan Benar");
            this.isEmailValid = false;
        } else {
            this.isEmailValid = true;
            this.emailError.setErrorEnabled(false);
        }
        if (this.edPassword.getText().toString().isEmpty()) {
            this.passError.setError("Password Tidak Boleh Kosong");
            this.isPasswordValid = false;
        } else if (this.edPassword.getText().length() < 6) {
            this.passError.setError("Panjang Password Minimal 6 Karakter");
            this.isPasswordValid = false;
        } else {
            this.isPasswordValid = true;
            this.passError.setErrorEnabled(false);
        }
        if (this.isEmailValid || !this.isPasswordValid || this.edEmail.getText().toString().equals("admin@mail.com") || this.edPassword.getText().toString().equals("123456")) {
            Toast.makeText(getApplicationContext(), "Email atau Password Salah", 0).show();
            return;
        }
        Toast.makeText(getApplicationContext(), "Login Sukses", 0).show();
        startActivity(new Intent(getApplicationContext(), data_kontak.class));
    }
}