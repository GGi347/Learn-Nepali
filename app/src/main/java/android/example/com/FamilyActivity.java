package android.example.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        ArrayList<Words> family = new ArrayList<>();

        family.add(new Words("Aama", "Mother", R.drawable.family_mother));
        family.add(new Words("Buwa", "Father", R.drawable.family_father));
        family.add(new Words("Hajurbuwa", "Grandfather", R.drawable.family_grandfather));
        family.add(new Words("Hajurama", "Grandmother", R.drawable.family_grandmother));
        family.add(new Words("Dai", "Older Brother", R.drawable.family_older_brother));
        family.add(new Words("Didi", "Older Sister", R.drawable.family_older_sister));
        family.add(new Words("Bhai", "Younger Brother", R.drawable.family_younger_brother));
        family.add(new Words("Baini", "Younger Sister", R.drawable.family_younger_sister));
        family.add(new Words("Chori", "Daughter", R.drawable.family_daughter));
        family.add(new Words("Chora", "Son", R.drawable.family_son));

        WordsAdapter familyAdapter = new WordsAdapter(this, family, R.color.category_family);
        ListView ls = (ListView) findViewById(R.id.rootView);
        ls.setAdapter(familyAdapter);
    }
}
