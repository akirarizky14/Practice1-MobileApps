package ru.mirea.rosyadi.akira.rizky.clickbuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvOut;
    private Button buttonOk;
    private Button buttoncCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOut = (TextView) findViewById(R.id.textView4);
        buttonOk = (Button) findViewById(R.id.button5);
        buttoncCancel = (Button) findViewById(R.id.button6);

        View.OnClickListener oclBtnOk = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOut.setText("Нажата кнопка ОК");
            }
        };
        View.OnClickListener oclBtnCancel = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOut.setText("Нажата кнопка Cancel");
            }
        };
        buttonOk.setOnClickListener(oclBtnOk);
        buttoncCancel.setOnClickListener(oclBtnCancel);

    }
}