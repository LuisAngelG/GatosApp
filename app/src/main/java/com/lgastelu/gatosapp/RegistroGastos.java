package com.lgastelu.gatosapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class RegistroGastos extends AppCompatActivity {

    private EditText edit;
    private RadioGroup rdgroup;
    private Spinner spinn;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_gastos);

        edit=findViewById(R.id.monto);
        rdgroup=findViewById(R.id.radio_group);
        spinn=findViewById(R.id.spinner_tipo);
        btn=findViewById(R.id.button_read);




    }
}
