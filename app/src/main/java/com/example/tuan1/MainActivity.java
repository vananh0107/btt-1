package com.example.tuan1;

import android.content.Intent;
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

import com.example.tuan1.week2.SecondWeekActivity;

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

        btnCalc.setOnClickListener(v->{
            int num1 = Integer.parseInt(edt1.getText().toString());
            int num2 = Integer.parseInt(edt2.getText().toString());
            int sum = num1 + num2;

            Intent intent = new Intent(this, SecondWeekActivity.class);
            intent.putExtra("num1", num1);
            intent.putExtra("num2", num2);
            intent.putExtra("sum", sum);
            startActivity(intent);
        });

    }
}