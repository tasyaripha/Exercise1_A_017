package com.example.exercise1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class pendaftaran extends AppCompatActivity {

    Button btnCancel, btnRegistrasi;

    EditText enama, eAlamat, edEmail, edPassword, edrePassword;

    String Nama, Alamat, JenisKelamin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pendaftaran);

        btnCancel = findViewById(R.id.btnCancel);
        btnRegistrasi = findViewById(R.id.btnRegistrasi);
    }
}