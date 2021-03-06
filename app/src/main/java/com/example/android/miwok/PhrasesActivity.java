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

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Where are you going?", "minto wuksus",0));
        words.add(new Word("What is your name?", "tinnә oyaase'nә",0));
        words.add(new Word("My name is...", "oyaaset...",0));
        words.add(new Word("How are you feeling?", "michәksәs?",0));
        words.add(new Word("I'm feeling good.", "kuchi achit",0));
        words.add(new Word("Are you coming?", "әәnәs'aa?",0));
        words.add(new Word("Yes, I’m coming.", "khәә’ әәnәm",0));
        words.add(new Word("I’m coming.", "әәnәm",0));
        words.add(new Word("Let’s go.", "yoowutis",0));
        words.add(new Word("Come here.", "әnni'nem",0));
        WordAdapter itemsAdapter = new WordAdapter(this, R.layout.list_item, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
