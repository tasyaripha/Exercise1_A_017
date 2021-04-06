package com.example.exercise1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class pendaftaran extends AppCompatActivity {

    Button btnCancel, btnRegistrasi;

    EditText enama, eAlamat, edEmail, edPassword, edrePassword;

    String Nama, Alamat, JenisKelamin, Agama;

    TextInputLayout dafnama, dafalamat, PDaftar1, PDafpass, Pdafrepass;
    RadioButton Jk1, JK2, rbIs, rbKi, rbKr, rbHi, rbKg, rbBd, rbPk;
    int Jk;
    RadioGroup rgAgama;
    RadioGroup rgAgama2;
    RadioGroup rgAgama3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pendaftaran);

        btnCancel = findViewById(R.id.btnCancel);
        btnRegistrasi = findViewById(R.id.btnRegistrasi);


    }

    public void JenisKelamin(View view) {
        int i = this.Jk;
        if (i == R.id.Jk1) {
            this.JenisKelamin = "Laki-Laki";
        } else if (i == R.id.Jk2) {
            this.JenisKelamin = "Perempuan";
        }
    }
    public void validasi (View view) {
        if (this.enama.getText().toString().isEmpty() || this.eAlamat.getText().toString().isEmpty()
                || this.edEmail.getText().toString().isEmpty() || this.edPassword.getText().toString().isEmpty()
                || this.edrePassword.getText().toString().isEmpty() || this.Agama.isEmpty() || this.JenisKelamin.isEmpty());
        {
            Toast.makeText(getApplicationContext(),"Data Harus DiIsi Semua", 0).show();
        }
    }
}