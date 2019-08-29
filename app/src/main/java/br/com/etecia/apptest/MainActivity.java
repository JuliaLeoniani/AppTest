package br.com.etecia.apptest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //set() é pra escrever dentro do bloco
    //get() é para pegar o valor lá dentro
    //avisar os objetos no java
    EditText txtNum1, txtNum2;
    Button btnSomar;
    TextView lblResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNum1 = (EditText) findViewById(R.id.txtNum1);
        txtNum2 = (EditText) findViewById(R.id.txtNum2);

        btnSomar = (Button) findViewById(R.id.btnSomar);
        lblResultado = (TextView) findViewById(R.id.lblResultado);

       btnSomar.setOnClickListener(new View.OnClickListener() {  //criar um método para o tal botão
            @Override
            public void onClick(View v) {

                double resp = 0;

                String txtN1 = txtNum1.getText().toString();
                String txtN2 = txtNum2.getText().toString();
                resp = Double.parseDouble(txtN1) + Double.parseDouble(txtN2);
                lblResultado.setText("O resultado é: " + String.valueOf(resp));

            }
        });
    }
}
