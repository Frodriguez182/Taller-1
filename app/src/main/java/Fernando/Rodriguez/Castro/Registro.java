package Fernando.Rodriguez.Castro;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;



public class Registro extends AppCompatActivity {

    private EditText firstName, secondName, firstMidName, secondMidName, age;
    private RadioButton masc, fem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        //Asignación del Array que contiene los valores del Spinner

        firstName=(EditText)findViewById(R.id.txtFirstName);
        secondName=(EditText)findViewById(R.id.txtSecondName);
        firstMidName=(EditText)findViewById(R.id.txtFirstMiddleName);
        secondMidName=(EditText)findViewById(R.id.txtSecondMiddleName);
        age=(EditText)findViewById(R.id.txtAge);

        masc=(RadioButton)findViewById(R.id.radioButtonMasculino);
        fem=(RadioButton)findViewById(R.id.radioButtonFemenino);


    }

    public void sayHello(View v){
        String firstNameFinal, secondNameFinal, firstMidNameFinal, secondMidNameFinal, sexFinal="", ageFinal;

        firstNameFinal = firstName.getText().toString().trim();
        secondNameFinal = secondName.getText().toString().trim();
        firstMidNameFinal = firstMidName.getText().toString().trim();
        secondMidNameFinal = secondMidName.getText().toString().trim();
        ageFinal = age.getText().toString().trim();



        if (masc.isChecked()){
            sexFinal="Masculino";
        }else if (fem.isChecked()){
            sexFinal="Femenino";
        }

        Intent i = new Intent(this, Saludo.class);
        Bundle b = new Bundle();
        b.putString("firstName", firstNameFinal);
        b.putString("secondName", secondNameFinal);
        b.putString("firstMidName", firstMidNameFinal);
        b.putString("secondMidName", secondMidNameFinal);
        b.putString("age", ageFinal);
        b.putString("sex", sexFinal);



        i.putExtras(b);
        startActivity(i);
    }


}
