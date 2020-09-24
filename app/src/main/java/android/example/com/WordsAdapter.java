package android.example.com;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.example.com.Words;
import java.util.ArrayList;

public class WordsAdapter extends ArrayAdapter<Words> {
    public WordsAdapter(@NonNull Context context, ArrayList<Words> resource) {
        super(context, 0, resource);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_layout, parent, false);
        }
        // Lookup view for data population
        Words word = getItem(position);
        TextView nepaliName = (TextView) convertView.findViewById(R.id.nepali);
        TextView englishName = (TextView) convertView.findViewById(R.id.english);
        ImageView imageR = (ImageView) convertView.findViewById(R.id.imageV);
        // Populate the data into the template view using the data object
        nepaliName.setText(word.getNepaliWord());
        englishName.setText(word.getEnglishWord());
        if(word.hasImage()){
            imageR.setImageResource(word.getImageR());
            imageR.setVisibility(View.VISIBLE);

        }else {
            imageR.setVisibility(View.GONE);
        }

        // Return the completed view to render on screen
        return convertView;
    }
}
