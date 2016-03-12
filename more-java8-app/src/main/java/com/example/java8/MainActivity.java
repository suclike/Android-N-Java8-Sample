package com.example.java8;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.*;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Map<Integer, String> numberMap = new HashMap<>();

    numberMap.put(1, "one");
    numberMap.put(2, "two");
    numberMap.put(3, "three");

    numberMap.forEach((Integer num, String str) -> System.out.println(num + str));
  }
}
