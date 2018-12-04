//Pedro Henrique Fortunato Silva Mariano
package com.example.pedroMariano.pesoideal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton radioButton;
    private String radiovalue;
    private int P;
    private EditText edtAltura;
    private TextView txtValResultado;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroup);
        edtAltura = findViewById(R.id.edtAltura);
        txtValResultado = findViewById(R.id.txtValResultado);


        String radiovalue =((RadioButton)findViewById(radioGroup.getCheckedRadioButtonId())).getText().toString();

        if (radiovalue == "homem"){
            P = 4;

        }else{
            P = 2;
        }



        Button button_aplicar = findViewById(R.id.button_aplicar);
        button_aplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float p,x;
                int altura;
                altura = Integer.parseInt(edtAltura.getText().toString());
                p = (altura - 100);
                x = altura - 150;
                x = x/K;
                p = p - x;
                txtValorResul.setText("Resultado: " + Float.toString(p));

            }
        });
    }

    public void checkButton(View v){
        int radioId = radioGroup.getCheckedRadioButtonId();

        radioButton = findViewById(radioId);
        Toast.makeText(this,"Selecionou: " + radioButton.getText(), Toast.LENGTH_SHORT).show();
    }
}