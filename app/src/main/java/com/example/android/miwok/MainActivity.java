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

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
    }

    public void openActivity(View view) {
        int viewID = view.getId();
        Intent intent = null;
        switch(viewID) {
            case R.id.numbers:
                intent  = new Intent(this, NumbersActivity.class);
                break;
            case R.id.colors:
                intent = new Intent(this, ColorsActivity.class);
                break;
            case R.id.family:
                intent = new Intent(this, FamilyActivity.class);
                break;
            case R.id.phrases:
                intent = new Intent(this, PhrasesActivity.class);
                break;
        }

        if(intent != null) {
            startActivity(intent);
        }

    }
}
