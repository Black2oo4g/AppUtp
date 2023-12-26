package com.example.apputpinder.spinner;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.apputpinder.R;

public class SpinnerHelper {
    public static void setupSedeSpinner(Context context, Spinner spinner) {
        // Obtén el array de strings desde resources
        String[] sedeArray = context.getResources().getStringArray(R.array.sede);

        // Crea un ArrayAdapter utilizando el array de strings y un diseño simple para los elementos del spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<>(context, android.R.layout.simple_spinner_item, sedeArray);

        // Especifica el diseño que se utilizará cuando se desplieguen las opciones (drop-down)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Asigna el ArrayAdapter al Spinner
        spinner.setAdapter(adapter);

        // Establece el primer elemento del array como seleccionado por defecto
        spinner.setSelection(0);
    }
    public static void setupCarreraSpinner(Context context, Spinner spinner) {
        // Obtén el array de strings desde resources
        String[] carreraArray = context.getResources().getStringArray(R.array.carrera);

        // Crea un ArrayAdapter utilizando el array de strings y un diseño simple para los elementos del spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<>(context, android.R.layout.simple_spinner_item, carreraArray);

        // Especifica el diseño que se utilizará cuando se desplieguen las opciones (drop-down)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Asigna el ArrayAdapter al Spinner
        spinner.setAdapter(adapter);

        // Establece el primer elemento del array como seleccionado por defecto
        spinner.setSelection(0);
    }
}
