package android.example.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        ArrayList<Words> phrases = new ArrayList<>();

        phrases.add(new Words("Namaste!", "Hello!"));
        phrases.add(new Words("Timro Naam k ho?", "What is your name?"));
        phrases.add(new Words("Timi kasto chau?", "How are you?"));
        phrases.add(new Words("Mah thikei chu", "I am fine."));
        phrases.add(new Words("Dhanyabaad", "Thank you"));
        phrases.add(new Words("Malai yoh mann paryo", "I liked this"));
        phrases.add(new Words("Voli garchu", "I will do it tomorrow"));

        ListView ls = (ListView) findViewById(R.id.rootView);
        ls.setAdapter(new WordsAdapter(this, phrases, R.color.category_phrases));

    }
}
