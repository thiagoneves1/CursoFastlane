package br.com.thiagoneves.cursofastlane;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static br.com.thiagoneves.cursofastlane.util.Calculo.isEven;
import static br.com.thiagoneves.cursofastlane.util.Calculo.isPrime;

public class ActivityCalculo extends AppCompatActivity {

    EditText editTextNumber;
    TextView textViewPar, textViewPrimo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        editTextNumber = findViewById(R.id.editText);
        textViewPar = findViewById(R.id.text_view_result_par);
        textViewPrimo = findViewById(R.id.text_view_result_primo);
    }

    public void calcular(View v) {
        int number = Integer.valueOf(editTextNumber.getText().toString());

        boolean par = isEven(number);
        boolean primo = isPrime(number);
        textViewPar.setText(par ? getString(R.string.par) : getString(R.string.impar));
        textViewPrimo.setText(primo ? getString(R.string.primo) : getString(R.string.nao_primo));
    }
}
