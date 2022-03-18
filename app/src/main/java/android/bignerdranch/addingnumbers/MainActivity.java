package android.bignerdranch.addingnumbers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText number1;
    private EditText number2;
    private Button add;
    private TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = (EditText) findViewById(R.id.edTextNumber1);
        number2 = (EditText) findViewById(R.id.edTextNumber2);
        //reference a button
        add = (Button) findViewById(R.id.addButton);
        answer = (TextView) findViewById(R.id.Answer);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(number1.getText().toString());
                int num2 = Integer.parseInt(number2.getText().toString());
                int sum = num1 + num2;
                answer.setText("The Answer is " + sum);

            }
        });
    }
}