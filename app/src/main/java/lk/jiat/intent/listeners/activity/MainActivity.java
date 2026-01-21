package lk.jiat.intent.listeners.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import lk.jiat.intent.listeners.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button homeBtn = findViewById(R.id.homeBtn);
//        homeBtn.setOnClickListener(v -> {
//
//        });

//        OnClickButton
        Button onClickBtn= findViewById(R.id.onClickBtn);
        onClickBtn.setOnClickListener(v->{
            Toast.makeText(MainActivity.this,"OnClick Event",Toast.LENGTH_LONG).show();
        });

//        LongPressOnClick
        Button longPressOnClickBtn = findViewById(R.id.longPressBtn);
//        longPressOnClickBtn.setOnClickListener(v->{
//            Toast.makeText(MainActivity.this,"Long Press OnClick Event",Toast.LENGTH_LONG).show();
//        });

        longPressOnClickBtn.setOnLongClickListener(v->{
            Toast.makeText(MainActivity.this,"Long Press OnLongClick Event",Toast.LENGTH_LONG).show();
            return true;
        });

        EditText editText = findViewById(R.id.editText);
        editText.setOnFocusChangeListener((v, hasFocus) -> {
            if(hasFocus){
                v.setBackgroundColor(Color.LTGRAY);
            }
        });
    }
}