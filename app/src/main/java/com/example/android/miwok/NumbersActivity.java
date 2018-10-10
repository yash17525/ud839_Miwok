/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> numbers = new ArrayList<>();
//        Word w = new Word("lutti","one");
//        numbers.add(w);
        numbers.add(new Word("lutti", "one", R.drawable.number_one));
        numbers.add(new Word("otiiko", "two", R.drawable.number_two));
        numbers.add(new Word("tolookosu", "three", R.drawable.number_three));
        numbers.add(new Word("oyissa", "four", R.drawable.number_four));
        numbers.add(new Word("massokka", "five", R.drawable.number_five));
        numbers.add(new Word("temmokka", "six", R.drawable.number_six));
        numbers.add(new Word("kenekaku", "seven", R.drawable.number_seven));
        numbers.add(new Word("kawinta", "eight", R.drawable.number_eight));
        numbers.add(new Word("wo'e", "nine", R.drawable.number_nine));
        numbers.add(new Word("na'aacha", "ten", R.drawable.number_ten));


        WordAdapater itemsAdapter = new WordAdapater(this, numbers, R.color.category_numbers);

        ListView listView = findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

    }
}
