package com.example.gasolinaouetanol;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editPrecoGasolina;
    private EditText editPrecoEtanol;
    private TextView textResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPrecoGasolina = findViewById(R.id.editGasolina);
        editPrecoEtanol = findViewById(R.id.editEtanol);
        textResultado = findViewById(R.id.textResultado);

    }

    public void calcularPreco(View View){

        Double precoGasolina = Double.parseDouble(editPrecoGasolina.getText().toString());
        Double precoEtanol = Double.parseDouble(editPrecoEtanol.getText().toString());

        /*
            Faz calculo (precoEtanol/precoGasolina)
        */
        Double resultado = precoEtanol / precoGasolina;

        if (resultado >= 0.7) {
            textResultado.setText("Melhor utilizar gasolina");
        } else {
            textResultado.setText("Melhor utilizar etanol");
        }

    }

}
