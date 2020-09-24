package android.example.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        ArrayList<Words> colors = new ArrayList<>();

        colors.add(new Words("Rato", "Red", R.drawable.color_red));
        colors.add(new Words("Hariyo", "Green", R.drawable.color_green));
        colors.add(new Words("Kalo", "Black", R.drawable.color_black));
        colors.add(new Words("Seto", "White", R.drawable.color_white));
        colors.add(new Words("Payelo", "Yellow", R.drawable.color_mustard_yellow));
        colors.add(new Words("Phusro", "Gray", R.drawable.color_gray));
        colors.add(new Words("Khairo", "Brown", R.drawable.color_brown));
        
        ListView ls = (ListView) findViewById(R.id.rootView);
        ls.setAdapter(new WordsAdapter(this, colors, R.color.category_colors));
    }
}
