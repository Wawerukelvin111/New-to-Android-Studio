package com.example.newbie;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


    }

    public void onBtnClick(View view) {
        TextView txtHello = findViewById(R.id.txtMessage);
        txtHello.setText("Welcome");
        TextView txtFirst = findViewById(R.id.textViewF);
        TextView txtSecond = findViewById(R.id.textViewS);
        TextView txtThird = findViewById(R.id.textViewE);
        EditText editTxt1Name = findViewById(R.id.editFName);
        txtFirst.setText("First Name" + ":" + editTxt1Name.getText().toString());
        EditText editTxt2Name = findViewById(R.id.editSName);
        txtSecond.setText("Second Name" + ":" + editTxt2Name.getText().toString());
        EditText editTxt3Email = findViewById(R.id.editTxtEmail);
        txtThird.setText("Email" + ":" + editTxt3Email.getText().toString());
    }
}