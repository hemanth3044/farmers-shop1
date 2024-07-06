package com.example.farmershop;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.HashMap;

public class Details extends AppCompatActivity {

    EditText detailname, detailnumber, detailaddress;

    Button SaveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        SaveButton=findViewById(R.id.save_button);
        detailname = findViewById(R.id.details_name);
        detailnumber = findViewById(R.id.details_number);
        detailaddress = findViewById(R.id.details_address);

        SaveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HashMap<String,Object> m=new HashMap<String,Object>();
                m.put("Full name",detailname.getText().toString());
                m.put("Phone Number",detailnumber.getText().toString());
                m.put("Full Address",detailaddress.getText().toString());

                FirebaseDatabase.getInstance().getReference().child("Users").push().setValue(m);


                Toast.makeText(Details.this, "You have save data successfully!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Details.this, LoginActivity.class);
                startActivity(intent);
            }
        });


    }
}