package com.example.lambda;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Button button = (Button) findViewById(R.id.activity_main_btn);

    if (button != null) {
      button.setOnClickListener((listener) -> button.setText("Lambda Works!"));
    }
  }
}
