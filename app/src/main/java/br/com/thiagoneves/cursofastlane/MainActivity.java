package br.com.thiagoneves.cursofastlane;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button, button2, button3, button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);

        button.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                startActivity(new Intent(MainActivity.this, ActivityTelaUm.class));
                break;
            case R.id.button2:
                startActivity(new Intent(MainActivity.this, ActivityCalculo.class));
                break;
            case R.id.button3:
                startActivity(new Intent(MainActivity.this, ActivityTexto.class));
                break;
            case R.id.button4:
                startActivity(new Intent(MainActivity.this, ActivityUltima.class));
                break;
        }
    }
}
