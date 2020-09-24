package android.example.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Words> numbers = new ArrayList<>();

        numbers.add(new Words("Ek", "One", R.drawable.number_one));
        numbers.add(new Words("Dui", "Two", R.drawable.number_two));
        numbers.add(new Words("Teen", "Three", R.drawable.number_three));
        numbers.add(new Words("Char", "Four", R.drawable.number_four));
        numbers.add(new Words("Paach", "Five", R.drawable.number_five));
        numbers.add(new Words("Cha", "Six", R.drawable.number_six));
        numbers.add(new Words("Saath", "Seven", R.drawable.number_seven));
        numbers.add(new Words("Aath", "Eight", R.drawable.number_eight));
        numbers.add(new Words("Nau", "Nine", R.drawable.number_nine));
        numbers.add(new Words("Dus", "Ten", R.drawable.number_ten));

        WordsAdapter itemAdapter = new WordsAdapter(this, numbers, R.color.category_numbers);


        ListView ls = (ListView) findViewById(R.id.rootView);
        ls.setAdapter(itemAdapter);
    }
}
