package com.fernando.rodriguez;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;



public class Saludo extends AppCompatActivity {
    private TextView answ1;
    private TextView answ2;
    private TextView answ3;
    private TextView answ4;
    private TextView answ5;
    private Resources res;
    private TextView answ6;
    private String fName, fSecName, fMidName, fSecMidName, fAge, fSex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);

        answ1 = (TextView) findViewById(R.id.lblFinalName);
        answ2 = (TextView) findViewById(R.id.lblFinalSecName);
        answ3 = (TextView) findViewById(R.id.lblFinalFirstMidName);
        answ4 = (TextView) findViewById(R.id.lblFinalSecMidName);
        answ5 = (TextView) findViewById(R.id.lblFinalAge);
        answ6 = (TextView) findViewById(R.id.lblFinalSex);

        Bundle bip = getIntent().getExtras();
        fName = bip.getString("firstName");
        fSecName = bip.getString("secondName");
        fMidName = bip.getString("firstMidName");
        fSecMidName = bip.getString("secondMidName");
        fAge = bip.getString("age");
        fSex= bip.getString("sex");

        res = getResources();

        answ1.setText("Hola \n"+fName+", seguramente éste es tu Primer Nombre.");
        answ2.setText("Segundo Nombre: "+fSecName);
        answ3.setText("Primer Apellido: "+fMidName);
        answ4.setText("Segundo Apellido: "+fSecMidName);
        answ5.setText("Edad: "+fAge);
        answ6.setText("Sexo: "+fSex);

    }
}
