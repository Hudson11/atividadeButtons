package software.jamelli.atividade;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void onClick(View v){

        RadioGroup g = findViewById(R.id.radioGroup);
        CheckBox check = findViewById(R.id.checkBox);

        EditText texto = findViewById(R.id.editText);

        if(texto.getText().toString().equals("")){
            Toast.makeText(this, "Preencha o nome", Toast.LENGTH_SHORT).show();
            return;
        }

        if(g.getCheckedRadioButtonId() == R.id.radioButton3){
            Toast.makeText(this, "Concorde com os termos ", Toast.LENGTH_SHORT).show();
        }else if(g.getCheckedRadioButtonId() == R.id.radioButton4){
            Toast.makeText(this, "vlw!!", Toast.LENGTH_SHORT).show();
        }
        if(!check.isChecked() == true){
            Toast.makeText(this, "Temos ótimas promoções", Toast.LENGTH_SHORT).show();
        }

    }

}
