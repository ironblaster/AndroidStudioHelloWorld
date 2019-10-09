package it.ironblaster.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView testo = findViewById(R.id.testo);
        final Button button = findViewById(R.id.button1);
        final RecyclerView lista = findViewById(R.id.lista);









        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                testo.setText("prova");

                // Code here executes on main thread after user presses button
            }
        });
    }


}
