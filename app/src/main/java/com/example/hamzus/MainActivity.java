package com.example.hamzus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
Button connect ;
EditText adresse,password ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        connect = findViewById(R.id.connect);
        adresse = findViewById(R.id.adresse);
        password = findViewById(R.id.password);

        connect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                authentification();
            }
        });
    }

    public void authentification(){
if(adresse.getText().toString().equals("admin")& password.getText().toString().equals("admin") ){
    Intent intent = new Intent().setClass(this, bolbol.class);
    startActivity(intent);
}else {
    Toast toast = Toast.makeText(getApplicationContext(), "thabet ya 7aj ichbik ha sbe7 ", Toast.LENGTH_SHORT);
    toast.show();
}
    }
}