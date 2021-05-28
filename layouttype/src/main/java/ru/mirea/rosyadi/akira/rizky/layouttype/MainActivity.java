package ru.mirea.rosyadi.akira.rizky.layouttype;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView17);
        button = (Button) findViewById(R.id.button7);
        View.OnClickListener buttonSave = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Save");
            }
        };
        button.setOnClickListener(buttonSave);
    }
}