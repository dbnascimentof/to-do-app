package br.com.danielfilho.todoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private View btnPlus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPlus = findViewById(R.id.btn_plus);

        btnPlus.setOnClickListener(View ->{
        Intent intent = new Intent(MainActivity.this, Page02_TO_DO_APP.class);
        startActivity(intent);
        });

}
}
