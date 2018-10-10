package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yashwant on 6/10/18.
 */

public class WordAdapater extends ArrayAdapter<Word> {
    private int mColorResourceId;

    WordAdapater(Activity context, ArrayList<Word> wordList, int colorResourceId) {
        super(context, 0, wordList);
        mColorResourceId = colorResourceId;
    }


    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // Get the {Word} object located at this position in the list
        Word currentWord = getItem(position);
        // Find the TextView in the list_item.xml layout with the ID - miwok
        TextView miwokTextView = listItemView.findViewById(R.id.miwok);
        // Get the version name from the current Word class object and
        // set this text on the miwokTextView
        assert currentWord != null;
        miwokTextView.setText(currentWord.getmiwokTranslation());
        // Find the TextView in the list_item.xml layout with the ID - english
        TextView defaultTextView = listItemView.findViewById(R.id.english);
        // Get the version number from the current Word class object and
        // set this text on defaultTextView
        defaultTextView.setText(currentWord.getDefaultTranslation());

        // Find the ImageView in the list_item.xml layout with the ID imageSource
        ImageView iconView = listItemView.findViewById(R.id.imageSource);

        if (currentWord.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            iconView.setImageResource(currentWord.getImageResourceId());
            // Make sure the view is visible
            iconView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            iconView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}


