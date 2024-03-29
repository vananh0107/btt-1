package com.example.tuan1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText edt1, edt2;
    Button btnCalc;

    TextView tvSum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        edt1 = findViewById(R.id.plaintext1);
        edt2 = findViewById(R.id.plaintext2);
        btnCalc = findViewById(R.id.btn1);
        tvSum = findViewById(R.id.tvSum);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sum = Integer.parseInt(edt1.getText().toString()) + Integer.parseInt(edt2.getText().toString());
                tvSum.setText(String.valueOf(sum));
            }
        });
    }
}