package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {
    public WordAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Word> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        Word currentWord = (Word) getItem(position);
        TextView miwokTextView = (TextView) view.findViewById(R.id.miwok_text);
        TextView engTextView = (TextView) view.findViewById(R.id.eng_text);
        ImageView img = (ImageView) view.findViewById(R.id.image);
        miwokTextView.setText(currentWord.getMiwok());
        engTextView.setText(currentWord.getEng());
        img.setImageResource(currentWord.getImg());

        return view;
    }
}
