package sg.edu.rp.c346.id21000243.demoarraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    String[] fruits;
    String theFruit;

    String list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.textView);

        ArrayList<String> fruits;
        fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add(3,"Durian");

        list = "Fruits\n=====\n";

        theFruit = fruits.get(1);
        fruits.remove(0);
        fruits.set(fruits.size()-1,"Dragon Fruit");

        for (int i=0;i<fruits.size();i++) {
            list = list+fruits.get(i)+"\n";
            tv.setText(list);
        }
    }
}