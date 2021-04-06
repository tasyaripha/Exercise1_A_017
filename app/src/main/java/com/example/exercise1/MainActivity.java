package com.example.exercise1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Deklarasi variabel untuk button
    Button btnLogin;

    //Deklarasi variabel untuk EditText
    EditText edEmail, edPassword;

    //Deklarasi variabel untuk menyimpan email dan password
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

                //Menyimpan input user di edittext email kedalam variabel nama
                nama = edEmail.getText().toString();

                //Menyimpan input user di edittext password kedalam variabel password
                password = edPassword.getText().toString();

                //Set Email yang benar
                String email = "admin@mail.com";

                //Set Password yang benar
                String pass = "123456";

                if (nama.isEmpty() || password.isEmpty()) {
                    //membuat variabel toast dan membuat toast dengan menambahkan variabel nama dan password
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Email atau Password Salah", Toast.LENGTH_LONG);
                    //menampilkan toast
                    t.show();
                } else {
                    if (nama.equals(email) && password.equals(pass)) {
                        Toast t = Toast.makeText(getApplicationContext(),
                                "Login Sukses", Toast.LENGTH_LONG);
                        t.show();
                        Bundle b = new Bundle();

                        b.putString("a", nama.trim());

                        b.putString("b", password.trim());

                        Intent i = new Intent(getApplicationContext(), data_kontak.class);

                        i.putExtras(b);

                        startActivity(i);
                    }
                }
            }
        });
    }
}