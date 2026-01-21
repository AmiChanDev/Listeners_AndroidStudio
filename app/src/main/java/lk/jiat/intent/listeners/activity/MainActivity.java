package lk.jiat.intent.listeners.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

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


    }
}