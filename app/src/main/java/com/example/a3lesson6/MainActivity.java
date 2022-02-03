package com.example.a3lesson6;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.a3lesson6.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private Math math;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        math = new Math();
        setupListeners();
    }

    private void setupListeners() {
        binding.btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1 = binding.etNum1.getText().toString();
                String num2 = binding.etNum2.getText().toString();
                binding.tvResult.setText(math.add(num1, num2));
            }
        });
    }
}