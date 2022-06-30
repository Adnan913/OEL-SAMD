package com.example.oelapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.telephony.SmsManager;

public class MainActivity extends AppCompatActivity {
private EditText editTextNumber;
@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.SEND_SMS, Manifest.permission.READ_SMS}, PackageManager.PERMISSION_GRANTED);

        editTextNumber = findViewById(R.id.etPhone);
        }

public void sendSMS(View view){

        String message = "Verify your Account \nPlease do not share 123456 pin to any one.";
        String number = editTextNumber.getText().toString();

        SmsManager mySmsManager = SmsManager.getDefault();
        mySmsManager.sendTextMessage(number,null, message, null, null);

        Intent intent = new Intent(getApplicationContext(), VerifyOTP.class);
//        intent.putExtra("phone", editTextNumber.getText().toString());
//        intent.putExtra("verificationId", verificationId);
        startActivity(intent);
        }
}