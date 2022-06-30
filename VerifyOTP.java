package com.example.oelapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
//
//import com.google.android.gms.tasks.OnCompleteListener;
//import com.google.android.gms.tasks.Task;
//import com.google.firebase.auth.AuthResult;
//import com.google.firebase.auth.FirebaseAuth;
//import com.google.firebase.auth.PhoneAuthCredential;
//import com.google.firebase.auth.PhoneAuthProvider;
//
//import org.jetbrains.annotations.NotNull;

public class VerifyOTP extends AppCompatActivity {

//    private ActivityOtpVerifyBinding binding;
//    private String verificationId;
    Button btnVerify;
    EditText etC1,etC2,etC3,etC4,etC5,etC6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_otp);

        TextView tvMobile = findViewById(R.id.tvMobile);
        TextView tvResendBtn = findViewById(R.id.tvResendBtn);
        etC1 =findViewById(R.id.etC1);
        etC2 =findViewById(R.id.etC2);
        etC3 =findViewById(R.id.etC3);
        etC4 =findViewById(R.id.etC4);
        etC5 =findViewById(R.id.etC5);
        etC6 =findViewById(R.id.etC6);

//        tvMobile.setText(String.format( "+92-%s", getIntent().getStringExtra("phone")));



        btnVerify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                binding.progressBarVerify.setVisibility(View.VISIBLE);
//                binding.btnVerify.setVisibility(View.INVISIBLE);
                if (etC1.getText().toString().trim().isEmpty() ||
                        etC2.getText().toString().trim().isEmpty() ||
                        etC3.getText().toString().trim().isEmpty() ||
                        etC4.getText().toString().trim().isEmpty() ||
                        etC5.getText().toString().trim().isEmpty() ||
                        etC6.getText().toString().trim().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "OTP is not Valid!", Toast.LENGTH_SHORT).show();
                } else {
                    String code= etC1.getText().toString()+etC2.getText().toString()+etC3.getText().toString()+
                            etC4.getText().toString()+etC5.getText().toString()+etC6.getText().toString();
                    if(code.equals("123456")){

                        Intent intent = new Intent(getApplicationContext(), Dashboard.class);
//                        intent.putExtra("phone", editTextNumber.getText().toString());
                        startActivity(intent);
                    }

                }
            }
        });
    }

//    private void editTextInput() {
//        etC1.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//                etC2.requestFocus();
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//
//            }
//        });
//        etC2.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//                etC3.requestFocus();
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//
//            }
//        });
//        etC3.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//                etC4.requestFocus();
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//
//            }
//        });
//        etC4.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//                etC5.requestFocus();
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//
//            }
//        });
//        etC5.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//                etC6.requestFocus();
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//
//            }
//        });
//    }
}