package com.example.apputpinder.main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

import com.example.apputpinder.R;
import com.example.apputpinder.spinner.SpinnerHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        // Obtén referencias a los Spinners desde tu diseño
        Spinner sedeSpinner = findViewById(R.id.spinner2);
        Spinner carreraSpinner = findViewById(R.id.spinner3);

        // Configura los Spinners utilizando la clase SpinnerHelper
        SpinnerHelper.setupSedeSpinner(this, sedeSpinner);
        SpinnerHelper.setupCarreraSpinner(this, carreraSpinner);
    }
}